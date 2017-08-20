package org.home.chapter04.partA.state;

import java.util.HashSet;
import java.util.Set;

public class District {
    
    private String district;
    
    private Set<City> cities;
    
    private City districtCenter;
    
    private int square;
    
    /**
     * Constructors
     */
    public District() {
        cities = new HashSet<>();
    }
    
    public District (String district) {
        this.district = district;
        cities = new HashSet<>();
    }
    
    public District (String district, Set<City> cities) {
        this.district = district;
        this.cities = cities;
    }
    
    /**
     * Getters and Setters
     */
    public String getDistrict() {
        return district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    
    public Set<City> getCities() {
        return cities;
    }
    
    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
    
    public City getDistrictCenter() {
        return districtCenter;
    }
    
    public boolean setDistrictCenter(City districtCenter) {
        if (districtCenter == null) {
            this.districtCenter = null;
            return true;
        }
        for (City c : cities) {
            if (c.equals(districtCenter)) {
                this.districtCenter = c;
                return true;
            }
        }
        return false;
    }
    
    public int getSquare() {
        return square;
    }
    
    public void setSquare(int square) {
        this.square = square;
    }
    
    /**
     * Methods for work
     */
    public void addCity(City city) {
        cities.add(city);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("District ").append(district).append(". Cities: ");
        for (City c : cities) {
            sb.append(c).append("; ");
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int output = 0;
        output += 3 * district.hashCode();
        output += 5 * cities.hashCode();
        output += 7 * districtCenter.hashCode();
        output += 9 * square;
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
        District d = (District) object;
        if (district == null) {
            if (d.getDistrict() != null) {
                return false;
            }
        } else {
            if (!district.equals(d.getDistrict())) {
                return false;
            }
        }
        if (cities == null) {
            if (d.getCities() != null) {
                return false;
            }
        } else {
            if (!cities.equals(d.getCities())) {
                return false;
            }
        }
        if (districtCenter == null) {
            if (d.getDistrictCenter() != null) {
                return false;
            }
        } else {
            if (!districtCenter.equals(d.getDistrictCenter())) {
                return false;
            }
        }
        if (square != d.getSquare()) {
            return false;
        }
        return true;
    }
}
