package org.home.chapter11.partA.task02;

public class Book {

    private String name;
    
    public Book(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
