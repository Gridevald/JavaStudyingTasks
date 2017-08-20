package org.home.chapter10.examples;

public class Nested {
    
    private String name;
    
    Nested nested;
    
    public Nested(String name, Nested nested) {
        this.name = name;
        this.nested = nested;
    }
}
