package org.home.chapter04.partA.puppy;

public abstract class Animal {

    private String name;
    
    public Animal() {}
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void voice();
}
