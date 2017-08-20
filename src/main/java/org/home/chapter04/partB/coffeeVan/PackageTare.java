package org.home.chapter04.partB.coffeeVan;

public enum PackageTare {

    CAN(0.7), PACK(0.3);
    
    private final double price;
    
    PackageTare(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
}
