package org.home.chapter04.partB.flowerShop;

import java.util.Calendar;

/**
 * This class represents Flower where:
 * - name is type of flower like rose or tulip;
 * - color is color;
 * - length is length of flower stem in cm;
 * - price is price in NewBYR;
 * - date is date of flower arrival to flower shop.
 */
public class Flower {
    
    private String name;
    
    private String color;
    
    private int length;
    
    private double price;
    
    private Calendar date;
    
    /**
     * Constructors
     */
    public Flower(String name) {
        setName(name);
    }
    
    public Flower(String name, String color) {
        this(name);
        setColor(color);
    }
    
    /**
     * Setters and Getters
     */
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    
    public Calendar getDate() {
        return date;
    }
    
    public void setDate(Calendar date) {
        this.date = date;
    }
    
    /**
     * Methods
     */
    @Override
    public String toString() {
        return color + " " + name;
    }
    
    @Override
    public int hashCode() {
        int output = 0;
        output += getClass().hashCode();
        output += 3 * name.hashCode();
        output += 5 * color.hashCode();
        output += 7 * length;
        output += (int) (9 * price);
        output += date.hashCode();
        return output;
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
        Flower flower = (Flower) object;
        if (name == null) {
            if (flower.getName() != null) {
                return false;
            }
        } else {
            if (!name.equals(flower.getName())) {
                return false;
            }
        }
        if (color == null) {
            if (flower.getColor() != null) {
                return false;
            }
        } else {
            if (!color.equals(flower.getColor())) {
                return false;
            }
        }
        if (length != flower.getLength()) {
            return false;
        }
        if (price != flower.getPrice()) {
            return false;
        }
        if (date == null) {
            if (flower.getDate() != null) {
                return false;
            }
        } else {
            if (!date.equals(flower.getDate())) {
                return false;
            }
        }
        return true;
    }
}
