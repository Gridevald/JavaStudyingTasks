package org.home.chapter03.partA.train;

public class Seats {
    
    private int common;
    
    private int compartment;
    
    private int reserved;
    
    private int luxury;
    
    public Seats(int common) {
        this.common = common;
    }
    
    public Seats(int common, int compartment) {
        this.common = common;
        this.compartment = compartment;
    }
    
    public Seats(int common, int compartment, int reserved) {
        this.common = common;
        this.compartment = compartment;
        this.reserved = reserved;
    }
    
    public Seats(int common, int compartment, int reserved, int luxury) {
        this.common = common;
        this.compartment = compartment;
        this.reserved = reserved;
        this.luxury = luxury;
    }
    
    public int getCommon() {
        return common;
    }
    
    public void setCommon(int common) {
        this.common = common;
    }
    
    public int getCompartment() {
        return compartment;
    }
    
    public void setCompartment(int compartment) {
        this.compartment = compartment;
    }
    
    public int getReserved() {
        return reserved;
    }
    
    public void setReserved(int reserved) {
        this.reserved = reserved;
    }
    
    public int getLuxury() {
        return luxury;
    }
    
    public void setLuxury(int luxury) {
        this.luxury = luxury;
    }
}
