package org.home.chapter04.partB.coffeeVan;

import java.util.HashMap;
import java.util.Map;

public class Van {
    
    private double mass;
    
    private Map<Package, Integer> packages;
    
    /**
     * Constructors
     */
    public Van() {
        packages = new HashMap<>();
    }
    
    public Van(double mass) {
        this();
        setMass(mass);
    }
    
    /**
     * Getters and Setters
     */
    public double getMass() {
        return mass;
    }
    
    public void setMass(double mass) {
        this.mass = mass;
    }
    
    public Map<Package, Integer> getPackages() {
        return packages;
    }
    
    public void setPackages(Map<Package, Integer> packages) {
        this.packages = packages;
    }
    
    /**
     * Methods
     */
    public void add(Package pack) {
        if (packages.containsKey(pack)) {
            packages.put(pack, packages.get(pack) + 1);
        } else {
            packages.put(pack, 1);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Van can get ").append(mass).append(" kg of load.").append("\n");
        sb.append("There are coffee in there: ").append("\n");
        for (Map.Entry<Package, Integer> entry : packages.entrySet()) {
            sb.append(" - ").append(entry.getKey()).append(" - ").append(entry.getValue()).append(" pieces;").append("\n");
        }
        return sb.toString();
    }
}
