package org.home.chapter09.partB.NewYearPresent;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class SweetPresent implements Serializable{
    
    private List<Candy> candies;
    
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructors
     */
    public SweetPresent() {
        candies = new LinkedList<>();
    }
    
    public SweetPresent(List<Candy> candies) {
    
    }
    
    /**
     * Getters & Setters
     */
    public List<Candy> getCandies() {
        return candies;
    }
    
    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }
    
    /**
     * Override methods
     */
    @Override
    public String toString() {
        return "SweetPresent{" +
                candies.size() + " candies, mas is " + mas() +
                '}';
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof SweetPresent)) return false;
        SweetPresent that = (SweetPresent) object;
        return Objects.equals(getCandies(), that.getCandies());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getCandies());
    }
    
    /**
     * Methods
     */
    public double mas() {
        double out = 0;
        for (Candy c : candies) {
            out += c.mas();
        }
        return out;
    }
    
    public void addCandy(Candy candy) {
        candies.add(candy);
    }
    
    public void popCandy(int index) {
        try {
            candies.remove(index);
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR: " + e);
        }
    }
}
