package org.home.chapter04.partA.airplane;

/**
 * This is Airplane Chassis.
 * It has diameter in mm
 * and mass in kg.
 */
public class Chassis {
    
    private int diameter;    //in mm
    
    private int mass;    //in kg
    
    public Chassis() {}
    
    public Chassis(int diameter) {
        if (checkPositive(diameter)) this.diameter = diameter;
    }
    
    public Chassis(int diameter, int mass) {
        if (checkPositive(diameter)) this.diameter = diameter;
        if (checkPositive(mass)) this.mass = mass;
    }
    
    public int getDiameter() {
        return diameter;
    }
    
    public void setDiameter(int diameter) {
        if (checkPositive(diameter)) this.diameter = diameter;
    }
    
    public int getMass() {
        return mass;
    }
    
    public void setMass(int mass) {
        if (checkPositive(mass)) this.mass = mass;
    }
    
    private boolean checkPositive(int value) {
        return value > 0;
    }
    
    @Override
    public String toString() {
        return "Chassis diameter is " + diameter + " mm, mass is " + mass + " kg.";
    }
    
    @Override
    public int hashCode() {
        return 13 * diameter + 17 * mass;
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
        Chassis c = (Chassis) obj;
        if (diameter != c.getDiameter()) {
            return false;
        }
        if (mass != c.getMass()) {
            return false;
        }
        return true;
    }
}
