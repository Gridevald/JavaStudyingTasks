package org.home.chapter12.partA.task02;

import org.home.chapter12.partA.task02.entity.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.GregorianCalendar;

public class MovieMain {
    
    public static void main(String[] args) {
        
        Actor a1 = new Actor();
        a1.setName("Henry Cavill");
        a1.setBirthDay(new GregorianCalendar(1983, 4, 5));
        Actor a2 = new Actor();
        a2.setName("Ben Affleck");
        a2.setBirthDay(new GregorianCalendar(1972, 7, 15));
        Actor a3 = new Actor();
        a3.setName("Amy Adams");
        a3.setBirthDay(new GregorianCalendar(1974, 7, 20));
        Actor a4 = new Actor();
        a4.setName("Jeremy Renner");
        a4.setBirthDay(new GregorianCalendar(1971, 0, 7));
        Actor a5 = new Actor();
        a5.setName("Scarlett Johansson");
        a5.setBirthDay(new GregorianCalendar(1984, 10, 22));
        Actor a6 = new Actor();
        a6.setName("Jennifer Lawrence");
        a6.setBirthDay(new GregorianCalendar(1990, 7, 15));
        
        Director d1 = new Director();
        d1.setName("Zack Snyder");
        d1.setBirthDay(new GregorianCalendar(1966, 2, 1));
        Director d2 = new Director();
        d2.setName("Denis Villeneuve");
        d2.setBirthDay(new GregorianCalendar(1967, 9, 3));
        Director d3 = new Director();
        d3.setName("David Russell");
        d3.setBirthDay(new GregorianCalendar(1958, 8, 20));
        Director d4 = new Director();
        d4.setName("Rupert Sanders");
        d4.setBirthDay(new GregorianCalendar(1971, 2, 16));
        Director d5 = new Director();
        d5.setName("Luc Besson");
        d5.setBirthDay(new GregorianCalendar(1959, 2, 18));

        Movie m1 = new Movie();
        m1.setTitle("Man of Steel");
        m1.setPremierDate(new GregorianCalendar(2013, 5, 10));
        m1.setCountry("USA");
        Movie m2 = new Movie();
        m2.setTitle("Batman v Superman");
        m2.setPremierDate(new GregorianCalendar(2016, 2, 20));
        m2.setCountry("USA");
        Movie m3 = new Movie();
        m3.setTitle("Arrival");
        m3.setPremierDate(new GregorianCalendar(2016, 8, 1));
        m3.setCountry("USA");
        Movie m4 = new Movie();
        m4.setTitle("American Hustle");
        m4.setPremierDate(new GregorianCalendar(2013, 11, 12));
        m4.setCountry("USA");
        Movie m5 = new Movie();
        m5.setTitle("Lucy");
        m5.setPremierDate(new GregorianCalendar(2014, 6, 25));
        m5.setCountry("France");
        Movie m6 = new Movie();
        m6.setTitle("Ghost in the Shell");
        m6.setPremierDate(new GregorianCalendar(2017, 2, 16));
        m6.setCountry("USA, China");
        
        a1.addMovie(m1);
        a1.addMovie(m2);
        a2.addMovie(m2);
        a3.addMovie(m1);
        a3.addMovie(m2);
        a3.addMovie(m3);
        a3.addMovie(m4);
        a4.addMovie(m3);
        a5.addMovie(m5);
        a5.addMovie(m6);
        a6.addMovie(m4);

        m1.addActor(a1);
        m1.addActor(a3);
        m1.setDirector(d1);
        m2.addActor(a1);
        m2.addActor(a2);
        m2.addActor(a3);
        m2.setDirector(d1);
        m3.addActor(a3);
        m3.addActor(a4);
        m3.setDirector(d2);
        m4.addActor(a3);
        m4.addActor(a6);
        m4.setDirector(d3);
        m5.addActor(a5);
        m5.setDirector(d4);
        m6.addActor(a5);
        m6.setDirector(d5);

        d1.addMovie(m1);
        d1.addMovie(m2);
        d2.addMovie(m3);
        d3.addMovie(m4);
        d4.addMovie(m6);
        d5.addMovie(m5);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("chapter12_task02");
        Operator op = new Operator(emf);
//        op.addMovie(m3);
//        op.addMovie(m4);
//        op.removeMovie(m3);
//        op.removeMovie(m4);
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(m1);
//        em.persist(m2);
//        em.persist(m3);
//        em.persist(m4);
//        em.persist(m5);
//        em.persist(m6);
//        em.getTransaction().commit();

        op.lastMovies();
        op.showActorsInMovie(m3);
        op.showActors(2);
        op.actorDirector();

        emf.close();

    }
}
