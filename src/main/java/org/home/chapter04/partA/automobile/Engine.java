package org.home.chapter04.partA.automobile;

public class Engine {
    
    private String model;
    
    private String fuelType;
    
    private double capacity;
    
    public Engine(String model, String fuelType, double capacity) {
        this.model = model;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }
    
    
    public String getModel() {
        return model;
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    @Override
    public String toString() {
        return "Engine: " + model + ", " + capacity + " liter, " + fuelType + ".";
    }
    
    @Override
    public int hashCode() {
        return ((int) (30 * capacity)) + model.hashCode() + fuelType.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Engine e = (Engine) obj;
        if (capacity != e.capacity) {
            return false;
        }
        if (!model.equals(e.model)) {
            return false;
        }
        if (!fuelType.equals(e.fuelType)) {
            return false;
        }
        return true;
    }
}
