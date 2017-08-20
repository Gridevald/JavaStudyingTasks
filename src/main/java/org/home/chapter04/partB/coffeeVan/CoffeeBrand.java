package org.home.chapter04.partB.coffeeVan;

public enum CoffeeBrand {
    
    ARABICA(2.5), ROBUSTA(2.0);
    
    private final double price;
    
    CoffeeBrand(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
}
