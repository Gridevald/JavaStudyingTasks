package org.home.chapter12.partA.task02.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "movie")
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String title;
    
    @Temporal(TemporalType.DATE)
    private Calendar premierDate;
    
    private String country;
    
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<Actor> actors;
    
    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private Director director;
    
    /**
     * Constructors
     */
    
    public Movie() {
        actors = new ArrayList<>();
    }
    
    /**
     * Getters and Setters
     */

    public int getId() {
        return Id;
    }
    
    public void setId(int id) {
        this.Id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Calendar getPremierDate() {
        return premierDate;
    }
    
    public void setPremierDate(Calendar premierDate) {
        this.premierDate = premierDate;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public List<Actor> getActors() {
        return actors;
    }
    
    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
    
    public Director getDirector() {
        return director;
    }
    
    public void setDirector(Director director) {
        this.director = director;
    }
    
    /**
     * Methods
     */
    
    public void addActor(Actor actor) {
        actors.add(actor);
    }
    
    public void removeActor(int index) {
        actors.remove(index);
    }
    
    /**
     * Override methods
     */
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Movie)) return false;
        Movie movie = (Movie) object;
        return Objects.equals(getTitle(), movie.getTitle()) &&
                Objects.equals(getPremierDate(), movie.getPremierDate()) &&
                Objects.equals(getCountry(), movie.getCountry());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPremierDate(), getCountry());
    }
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        return "Movie{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", premierDate=" + sdf.format(premierDate.getTime()) +
                ", country='" + country + '\'' +
                '}';
    }
}
