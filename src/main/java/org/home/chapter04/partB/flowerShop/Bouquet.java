package org.home.chapter04.partB.flowerShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bouquet {
    
    private List<Flower> flowers;
    
    private List<Accessory> accessories;
    
    /**
     * Constructors
     */
    public Bouquet() {
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
    }
    
    public Bouquet(List<Flower> flowers) {
        setFlowers(flowers);
        accessories = new ArrayList<>();
    }
    
    public Bouquet(List<Flower> flowers, List<Accessory> accessories) {
        this(flowers);
        setAccessories(accessories);
    }
    
    /**
     * Getters and Setters
     */
    public List<Flower> getFlowers() {
        return flowers;
    }
    
    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
    
    public List<Accessory> getAccessories() {
        return accessories;
    }
    
    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }
    
    /**
     * Methods
     */
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }
    
    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }
    
    public double price() {
        double price = 0;
        for (Flower f : flowers) {
            price += f.getPrice();
        }
        for (Accessory a : accessories) {
            price += a.getPrice();
        }
        return price;
    }
    
    public void sortDate() {
        Collections.sort(flowers, new Comparator<Flower>() {
            @Override
            public int compare(Flower o1, Flower o2) {
                return o2.getDate().compareTo(o1.getDate());
            }
        });
    }
    
    public void findLength(int min, int max) {
        System.out.println("Flowers which length between " + min + " cm and " + max + " cm:");
        for (Flower f : flowers) {
            if (f.getLength() > min && f.getLength() < max) {
                System.out.println(" - " + f);
            }
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bouquet consists of:").append("\n");
        for (Flower f : flowers) {
            sb.append(" - ").append(f).append("\n");
        }
        sb.append("It wrapped with:").append("\n");
        for (Accessory a : accessories) {
            sb.append(" - ").append(a).append("\n");
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int output = 0;
        output += getClass().hashCode();
        output += 3 * flowers.hashCode();
        output += 5 * accessories.hashCode();
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
        Bouquet bouquet = (Bouquet) object;
        if (flowers == null) {
            if (bouquet.getFlowers() != null) {
                return false;
            }
        } else {
            if (!flowers.equals(bouquet.getFlowers())) {
                return false;
            }
        }
        if (accessories == null) {
            if (bouquet.getAccessories() != null) {
                return false;
            }
        } else {
            if (!accessories.equals(bouquet.getAccessories())) {
                return false;
            }
        }
        return true;
    }
}
