package org.home.chapter03.enumPractice;

public enum TaxiStation {
    MERCEDES(10), TOYOTA(7), AUDI;
    
    private int freeCabs;
    
    TaxiStation() {}
    
    TaxiStation(int cabs) {
        freeCabs = cabs;
    }
    
    public int getFreeCabs() {
        return freeCabs;
    }
    
    public void setFreeCabs(int freeCabs) {
        this.freeCabs = freeCabs;
    }
    
    public void add() {
        freeCabs++;
    }
    
    @Override
    public String toString() {
        return String.format("%s : free cabs = %d", name(), freeCabs);
    }
}
