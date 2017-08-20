package org.home.chapter05.payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    
    private List<Thing> cart;
    
    /**
     * Constructors
     */
    public Payment() {
        cart = new ArrayList<>();
    }
    
    /**
     * Getters and Setters
     */
    public List<Thing> getCart() {
        return cart;
    }
    
    public void setCart(List<Thing> cart) {
        this.cart = cart;
    }
    
    /**
     * Methods
     */
    public void addThing(Thing thing) {
        cart.add(thing);
    }
    
    public void doPayment() {
        //some operations
        System.out.println("Payment completed!");
    }
    
    public double price() {
        double output = 0;
        for (Thing t : cart) {
            output += t.getPrice();
        }
        return output;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("You cart contains:" + "\n");
        for (Thing t : cart) {
            sb.append(t).append("\n");
        }
        return sb.toString();
    }
    
    /**
     * Inner class, represents Thing in the Shop
     */
    public class Thing {
        
        private int id;
        
        private String name;
        
        private double price;
    
        /**
         * Constructors
         */
        public Thing(int id) {
            Payment p = new Payment();
            setId(id);
        }
        
        public Thing(int id, String name, double price) {
            this(id);
            setName(name);
            setPrice(price);
        }
    
        /**
         * Getters and Setters
         */
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            if (id > 0) {
                this.id = id;
            }
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public double getPrice() {
            return price;
        }
    
        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            }
        }
    
        /**
         * Methods
         */
        @Override
        public String toString() {
            return "#" + id + ": " + name + " - $ " + price;
        }
    }
}
