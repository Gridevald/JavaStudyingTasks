package org.home.chapter04.partA.airplane;

/**
 * This is Airplane Engine.
 * It has power in horse powers
 * and mass in kg.
 */
public class Engine {
    
    private int power;
    
    private int mass;
    
    public Engine() {
    }
    
    public Engine(int power) {
        if (checkPositive(power)) this.power = power;
    }
    
    public Engine(int power, int mass) {
        if (checkPositive(power)) this.power = power;
        if (checkPositive(mass)) this.mass = mass;
    }
    
    public int getPower() {
        return power;
    }
    
    public void setPower(int power) {
        if (checkPositive(power)) this.power = power;
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
        return "Engine power is " + power + " hp, mass is " + mass + " kg.";
    }
    
    @Override
    public int hashCode() {
        return 13 * power + 17 * mass;
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
        if (power != e.getPower()) {
            return false;
        }
        if (mass != e.getMass()) {
            return false;
        }
        return true;
    }
}
