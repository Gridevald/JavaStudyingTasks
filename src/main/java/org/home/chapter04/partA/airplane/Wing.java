package org.home.chapter04.partA.airplane;

/**
 * This is Airplane wing.
 * It has length in mm
 * and mass in kg.
 */
public class Wing {
    
    private int length;
    
    private int mass;
    
    public Wing() {}
    
    public Wing(int length) {
        if (checkPositive(length)) this.length = length;
    }
    
    public Wing(int length, int mass) {
        if (checkPositive(length)) this.length = length;
        if (checkPositive(mass)) this.mass = mass;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        if (checkPositive(length)) this.length = length;
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
        return "Wing length is " + length + " mm, " + "mass is " + mass + " kg.";
    }
    
    @Override
    public int hashCode() {
        return 13 * length + 17 * mass;
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
        Wing w = (Wing) obj;
        if (length != w.getLength()) {
            return false;
        }
        if (mass != w.getMass()) {
            return false;
        }
        return true;
    }
}
