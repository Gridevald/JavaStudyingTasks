package org.home.chapter12.partA.task02;

import org.home.chapter12.partA.task02.entity.Actor;
import org.home.chapter12.partA.task02.entity.Director;
import org.home.chapter12.partA.task02.entity.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Operator {

    private EntityManagerFactory factory;

    public Operator(EntityManagerFactory factory) {
        this.factory = factory;
    }

    /**
     * Inserts movie to DB if this movie doesn't exists,
     * updates movie if it does.
     */
    // UNCONTROLLED CASE
    private void addMovie(Movie movie) {
        Movie temp = checkMovieExist(movie);
        if (temp != null) {
            System.out.println("---update");
            updateMovie(temp, movie);
        } else {
            System.out.println("---insert");
            insertMovie(movie);
        }
    }

    /**
     * Finds out if Movie exists.
     * Returns this movie if exists,
     * null - if not.
     */
    @SuppressWarnings("unchecked")
    private Movie checkMovieExist(Movie movie) {
        EntityManager em = null;
        try {
            em = factory.createEntityManager();
            em.getTransaction().begin();
            String query = "from Movie movie where movie.title = :title and movie.premierDate = :premierDate";
            List<Movie> movies = em.createQuery(query)
                    .setParameter("title", movie.getTitle())
                    .setParameter("premierDate", movie.getPremierDate())
                    .getResultList();
            em.getTransaction().commit();
            if (movies.size() > 0) {
                return movies.get(0);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return null;
    }

    /**
     * Inserts Movie to DB
     */
    private void insertMovie(Movie movie) {
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = factory.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(movie); //merge add copied actor, persist throws exception :(
            et.commit();
        } catch (RuntimeException e) {
            if (et != null) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Updates movie in DB
     */
    private void updateMovie(Movie toUpdate, Movie movie) {
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = factory.createEntityManager();
            et = em.getTransaction();
            et.begin();
            toUpdate.setCountry(movie.getCountry());
            toUpdate.setDirector(movie.getDirector());
            toUpdate.setActors(movie.getActors());
            em.merge(toUpdate);
            et.commit();
        } catch (RuntimeException e) {
            if (et != null) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Removes the Movie
     */
    public void removeMovie(Movie movie) {
        EntityManager em = null;
        EntityTransaction et = null;
        Movie fromDB = checkMovieExist(movie);
        if (fromDB != null) {
            try {
                em = factory.createEntityManager();
                et = em.getTransaction();
                et.begin();
                Movie toRemove = em.find(Movie.class, fromDB.getId());
                em.remove(toRemove);
                System.out.println("---remove");
                et.commit();
            } catch (RuntimeException e) {
                if (et != null) {
                    et.rollback();
                }
                e.printStackTrace();
            } finally {
                if (em != null) {
                    em.close();
                }
            }
        }
    }

    /**
     * Prints movies with Premier Date in present and last years.
     */
    @SuppressWarnings("unchecked")
    public void lastMovies() {
        EntityManager em = null;
        try {
            em = factory.createEntityManager();
            em.getTransaction().begin();
            int year = new GregorianCalendar().get(Calendar.YEAR) - 1;
            Calendar pDate = new GregorianCalendar(year, 1, 1);
            StringBuilder sb = new StringBuilder("Movies premiered in this and last years : ");
            List<Movie> movies = (List<Movie>) em
                    .createQuery("from Movie movie where movie.premierDate > :pDate")
                    .setParameter("pDate", pDate)
                    .getResultList();
            for (Movie m : movies) {
                sb.append(m.getTitle()).append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append(".");
            System.out.println(sb);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Prints names of Actors from current Movie.
     */
    public void showActorsInMovie(Movie movie) {
        Movie temp = checkMovieExist(movie);
        if (temp != null) {
            StringBuilder sb = new StringBuilder("Actors in movie \"")
                    .append(temp.getTitle())
                    .append("\" : ");
            for (Actor a : temp.getActors()) {
                sb.append(a.getName()).append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append(".");
            System.out.println(sb);
        }
    }

    /**
     * Prints Actors who have at least n movies.
     */
    @SuppressWarnings("unchecked")
    public void showActors(int n) {
        EntityManager em = null;
        try {
            em = factory.createEntityManager();
            em.getTransaction().begin();
            List<Actor> actors = (List<Actor>) em
                    .createQuery("from Actor actor")
                    .getResultList();
            StringBuilder sb = new StringBuilder("Actors who have at least ")
                    .append(n)
                    .append(" movies : ");
            for (Actor a : actors) {
                if (a.getMovies().size() >= n) {
                    sb.append(a.getName()).append(", ");
                }
            }
            sb.setLength(sb.length() - 2);
            sb.append(".");
            System.out.println(sb);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Prints Actors who worker as director as well.
     */
    @SuppressWarnings("unchecked")
    public void actorDirector() {
        EntityManager em = null;
        try {
            em = factory.createEntityManager();
            em.getTransaction().begin();
            List<Actor> actors = em.createQuery("from Actor").getResultList();
            List<Director> directors = em.createQuery("from Director").getResultList();
            StringBuilder in = new StringBuilder();
            for (int i = 0; i < actors.size(); i++) {
                for (int j = 0; j < directors.size(); j++) {
                    if (actors.get(i).getName().equals(directors.get(j).getName()) &&
                            actors.get(i).getBirthDay().equals(directors.get(j).getBirthDay())) {
                        in.append(actors.get(i).getName()).append(", ");
                    }
                }
            }
            StringBuilder out = new StringBuilder();
            if (in.length() != 0) {
                out.append("Actors as Directors : ");
                in.setLength(in.length() - 2);
                out.append(in).append(".");
            } else {
                out.append("There is no actors who was director as well.");
            }
            System.out.println(out);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
