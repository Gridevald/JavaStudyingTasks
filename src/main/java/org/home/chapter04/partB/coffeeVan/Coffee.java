package org.home.chapter04.partB.coffeeVan;

public class Coffee {
    
    private CoffeeBrand brand;
    
    private CoffeeCondition condition;
    
    /**
     * Constructors
     */
    public Coffee() {}
    
    public Coffee(CoffeeBrand brand) {
        setBrand(brand);
    }
    
    public Coffee(CoffeeBrand brand, CoffeeCondition condition) {
        this(brand);
        setCondition(condition);
    }
    
    /**
     * Getters and Setters
     */
    public CoffeeBrand getBrand() {
        return brand;
    }
    
    public void setBrand(CoffeeBrand brand) {
        this.brand = brand;
    }
    
    public CoffeeCondition getCondition() {
        return condition;
    }
    
    public void setCondition(CoffeeCondition condition) {
        this.condition = condition;
    }
    
    /**
     * Methods
     */
    public double price() {
        return brand.getPrice() + condition.getPrice();
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
        Coffee coffee = (Coffee) object;
        if (brand == null) {
            if (coffee.brand != null) {
                return false;
            }
        } else {
            if (brand.equals(coffee.getBrand())) {
                return false;
            }
        }
        if (condition == null) {
            if (coffee.getCondition() != null) {
                return false;
            }
        } else {
            if (condition.equals(coffee.getCondition())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        return brand + " " + condition;
    }
}
