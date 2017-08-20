package org.home.chapter04.partB.flowerShop;

/**
 * This class represents Accessory where:
 * - type is type of accessories.txt like tape or wrapper;
 * - color is color of accessory;
 * - material is material like paper or plastic;
 * - price is price in NewBYR.
 */
public class Accessory {
    
    private String type;
    
    private String color;
    
    private String material;
    
    private double price;
    
    /**
     * Constructors
     */
    public Accessory(String type) {
        setType(type);
    }
    
    public Accessory(String type, String color) {
        this(type);
        setColor(color);
    }
    
    public Accessory(String type, String color, String material) {
        this(type, color);
        setMaterial(material);
    }
    
    public Accessory(String type, String color, String material, double price) {
        this(type, color, material);
        setPrice(price);
    }
    
    /**
     * Setters and Getters
     */
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    
    /**
     * Methods
     */
    @Override
    public String toString() {
        return color + " " + material + " " + type;
    }
    
    @Override
    public int hashCode() {
        int output = 0;
        output += getClass().hashCode();
        output += 3 * type.hashCode();
        output += 5 * color.hashCode();
        output += 7 * material.hashCode();
        output += (int) (9 * price);
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
        Accessory accessory = (Accessory) object;
        if (type == null) {
            if (accessory.getType() != null) {
                return false;
            }
        } else {
            if (!type.equals(accessory.getType())) {
                return false;
            }
        }
        if (color == null) {
            if (accessory.getColor() != null) {
                return false;
            }
        } else {
            if (!color.equals(accessory.getColor())) {
                return false;
            }
        }
        if (material == null) {
            if (accessory.getMaterial() != null) {
                return false;
            }
        } else {
            if (!material.equals(accessory.getMaterial())) {
                return false;
            }
        }
        if (price != accessory.getPrice()) {
            return false;
        }
        return true;
    }
}
