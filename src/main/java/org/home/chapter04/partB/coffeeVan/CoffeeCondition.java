package org.home.chapter04.partB.coffeeVan;

public enum CoffeeCondition {
    
    BEAN(1.0), GROUND(1.3), INSTANT(0.5);
    
    private final double price;
    
    CoffeeCondition(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
}
