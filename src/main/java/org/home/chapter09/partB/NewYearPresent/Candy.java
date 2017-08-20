package org.home.chapter09.partB.NewYearPresent;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Candy implements Serializable{
    
    private CandyType candyType;
    
    private List<Addition> additions;
    
    /**
     * Constructors
     */
    public Candy() {
        additions = new LinkedList<>();
    }
    
    public Candy(CandyType candyType) {
        this();
        setCandyType(candyType);
    }
    
    public Candy(CandyType candyType, List<Addition> additions) {
        setCandyType(candyType);
        setAdditions(additions);
    }
    
    /**
     * Getters & Setters
     */
    public CandyType getCandyType() {
        return candyType;
    }
    
    public void setCandyType(CandyType candyType) {
        this.candyType = candyType;
    }
    
    public List<Addition> getAdditions() {
        return additions;
    }
    
    public void setAdditions(List<Addition> additions) {
        this.additions = additions;
    }
    
    /**
     * Override methods
     */
    @Override
    public String toString() {
        return "Candy{" +
                "candyType=" + candyType +
                ", additions=" + additions +
                '}';
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Candy)) return false;
        Candy candy = (Candy) object;
        return candyType == candy.candyType &&
                Objects.equals(additions, candy.additions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(candyType, additions);
    }
    
    /**
     * Methods
     */
    public double mas() {
        double out = 0;
        for (Addition a : additions) {
            out += a.getMas();
        }
        return 1.5 * out;
    }
    
    public void addAddition(Addition addition) {
        additions.add(addition);
    }
    
    public void removeAddition(int index) {
        try {
            additions.remove(index);
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR: " + e);
        }
    }
}
