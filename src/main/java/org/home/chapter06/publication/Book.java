package org.home.chapter06.publication;

import java.util.ArrayList;
import java.util.List;

public abstract class Book implements Publication{
    
    private int id;
    
    private String title;
    
    private List<String> text;
    
    /**
     * Getters and setters
     */
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public List<String> getText() {
        return text;
    }
    
    public void setText(List<String> text) {
        this.text = text;
    }
    
    /**
     * Constructors
     */
    public Book() {
        text = new ArrayList<>();
    }
    
    public Book(int id, String title) {
        this();
        setId(id);
        setTitle(title);
    }
    
    /**
     * Methods
     */
    @Override
    public void addText(String value) {
        text.add(value);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book #").append(id).append("\n");
        sb.append(title).append("\n");
        for (String s : text) {
            sb.append(s);
        }
        return sb.toString();
    }
}
