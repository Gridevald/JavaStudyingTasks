package org.home.chapter04.partB.coffeeVan;

public class Package {
    
    private Coffee coffee;

    private PackageTare tare;
    
    private PackageMass mass;
    
    /**
     * Constructors
     */
    public Package() {}
    
    public Package(Coffee coffee) {
        setCoffee(coffee);
    }
    
    public Package(Coffee coffee, PackageTare tare, PackageMass mass) {
        this(coffee);
        setTare(tare);
        setMass(mass);
    }
    
    /**
     * Getters and Setters
     */
    public Coffee getCoffee() {
        return coffee;
    }
    
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    
    public PackageTare getTare() {
        return tare;
    }
    
    public void setTare(PackageTare tare) {
        this.tare = tare;
    }
    
    public PackageMass getMass() {
        return mass;
    }
    
    public void setMass(PackageMass mass) {
        this.mass = mass;
    }
    
    /**
     * Methods
     */
    public double price() {
        return coffee.price() * mass.getMass() + tare.getPrice();
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Package pack = (Package) object;
        if (coffee == null) {
            if (pack.getCoffee() != null) {
                return false;
            }
        } else {
            if (!coffee.equals(pack.getCoffee())) {
                return false;
            }
        }
        if (tare == null) {
            if (pack.getTare() != null) {
                return false;
            }
        } else {
            if (!tare.equals(pack.getTare())) {
                return false;
            }
        }
        if (mass == null) {
            if (pack.getMass() != null) {
                return false;
            }
        } else {
            if (mass.equals(pack.getMass())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        return tare + "(" + mass.getMass() + " kg) of " + coffee;
    }
}
