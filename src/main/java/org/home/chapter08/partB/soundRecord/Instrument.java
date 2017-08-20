package org.home.chapter08.partB.soundRecord;

import java.util.Objects;

public class Instrument {
    
    private String name;
    
    private int cost;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getCost() {
        return cost;
    }
    
    public void setCost(int cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Instrument)) return false;
        Instrument that = (Instrument) object;
        return getCost() == that.getCost() &&
                Objects.equals(getName(), that.getName());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCost());
    }
}
