package org.home.chapter06.figure;

public abstract class abstractFigure {
    
    private int id;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    private Color color;
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
}
