package org.home.chapter04.partA.state;

public class City {
    
    private String city;
    
    public City() {}
    
    public City(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return city;
    }
    
    @Override
    public int hashCode() {
        return city.hashCode();
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        City c = (City) object;
        if (city == null) {
            if (c.getCity() != null) {
                return false;
            }
        } else {
            if (!city.equals(c.getCity())) {
                return false;
            }
        }
        return true;
    }
}
