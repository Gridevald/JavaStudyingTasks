package org.home.chapter04.partB.coffeeVan;

public enum PackageMass {
    
    SMALL(0.25), MIDDLE(0.5), BIG(1.0), XL(3.0);
    
    private final double mass;
    
    PackageMass(double mass) {
        this.mass = mass;
    }
    
    public double getMass() {
        return mass;
    }
}
