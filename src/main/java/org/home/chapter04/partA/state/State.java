package org.home.chapter04.partA.state;

import java.util.HashSet;
import java.util.Set;

public class State {
    
    private String state;
    
    private Set<Region> regions;
    
    private City capital;
    
    /**
     * Constructors
     */
    public State() {
        regions = new HashSet<>();
    }
    
    public State(String state) {
        this.state = state;
        regions = new HashSet<>();
    }
    
    public State(String state, Set<Region> regions) {
        this.state = state;
        this.regions = regions;
    }
    
    /**
     * Setters and Getters
     */
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public Set<Region> getRegions() {
        return regions;
    }
    
    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }
    
    public City getCapital() {
        return capital;
    }
    
    public boolean setCapital(City capital) {
        if (capital == null) {
            this.capital = null;
            return true;
        }
        for (Region r : regions) {
            for (District d : r.getDistricts()) {
                for (City c : d.getCities()) {
                    if (c.equals(capital)) {
                        this.capital = c;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    /**
     * Methods for work
     */
    public int square() {
        int output = 0;
        for (Region r : regions) {
            output += r.square();
        }
        return output;
    }
    
    public void addRegion(Region region) {
        regions.add(region);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State ").append(state).append(". Regions: ");
        for (Region r : regions) {
            sb.append(r.getRegion()).append("; ");
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int output = 0;
        output += 3 * state.hashCode();
        output += 5 * regions.hashCode();
        output += 7 * capital.hashCode();
        return output;
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
        State s = (State) object;
        if (state == null) {
            if (s.getState() != null) {
                return false;
            }
        } else {
            if (!state.equals(s.getState())) {
                return false;
            }
        }
        if (regions == null) {
            if (s.getRegions() != null) {
                return false;
            }
        } else {
            if (!regions.equals(s.getRegions())) {
                return false;
            }
        }
        
        if (capital == null) {
            if (s.getCapital() != null) {
                return false;
            }
        } else {
            if (!capital.equals(s.getCapital())) {
                return false;
            }
        }
        return true;
    }
}
