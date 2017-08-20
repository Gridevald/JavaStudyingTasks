package org.home.chapter04.partA.state;

import java.util.HashSet;
import java.util.Set;

public class Region {
    
    private String region;
    
    private Set<District> districts;
    
    private City regionCenter;
    
    /**
     * Constructors
     */
    public Region() {
        districts = new HashSet<>();
    }
    
    public Region(String region) {
        this.region = region;
        districts = new HashSet<>();
    }
    
    public Region(String region, Set<District> districts) {
        this.region = region;
        this.districts = districts;
    }
    
    /**
     * Setters and getters
     */
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    public Set<District> getDistricts() {
        return districts;
    }
    
    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }
    
    public City getRegionCenter() {
        return regionCenter;
    }
    
    public boolean setRegionCenter(City regionCenter) {
        if (regionCenter == null) {
            this.regionCenter = null;
            return true;
        }
        for (District d : districts) {
            for (City c : d.getCities()) {
                if (c.equals(regionCenter)) {
                    this.regionCenter = c;
                    return true;
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
        for (District d : districts) {
            output += d.getSquare();
        }
        return output;
    }
    
    public void addDistrict(District district) {
        districts.add(district);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Region ").append(region).append(". Districts: ");
        for (District d : districts) {
            sb.append(d.getDistrict()).append("; ");
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int output = 0;
        output += 3 * region.hashCode();
        output += 5 * districts.hashCode();
        output += 7 * regionCenter.hashCode();
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
        Region r = (Region) object;
        if (region == null) {
            if (r.getRegion() != null) {
                return false;
            }
        } else {
            if (!region.equals(r.getRegion())) {
                return false;
            }
        }
        if (regionCenter == null) {
            if (r.getRegionCenter() != null) {
                return false;
            }
        } else {
            if (!regionCenter.equals(r.getRegionCenter())) {
                return false;
            }
        }
        return true;
    }
}
