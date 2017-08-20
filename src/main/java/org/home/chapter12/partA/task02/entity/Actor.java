package org.home.chapter12.partA.task02.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "actor")
public class Actor extends Man{
    
    @ManyToMany(mappedBy = "actors", fetch = FetchType.EAGER)
    private List<Movie> movies;
    
    /**
     * Constructors
     */
    
    public Actor() {
        movies = new ArrayList<>();
    }
    
    /**
     * Getters and Setters
     */

    public List<Movie> getMovies() {
        return movies;
    }
    
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
    
    /**
     * Methods
     */
    
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    
    public void removeMovie(int index) {
        movies.remove(index);
    }
    
    /**
     * Override methods
     */
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Actor)) return false;
        Actor actor = (Actor) object;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getBirthDay(), actor.getBirthDay());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirthDay());
    }
    
    @Override
    public String toString() {
        return "Actor{" + getName() + "}";
    }
}
