package org.home.chapter06.figure;

public class FigureMain {
    
    public static void main(String[] args) {
        
        Square f1 = new Square();
        f1.rotate();
        f1.setColor(Color.RED);
        
        Triangle f2 = new Triangle();
        f2.rotate();
        f2.setColor(Color.WHITE);
        
        sum(f1, f2);
    }
    
    public static void sum(abstractFigure f1, abstractFigure f2) {
        if (f1.getColor().equals(f2.getColor())) {
            System.out.println("Figures ok.");
        } else {
            System.out.println("Different colors.");
        }
    }
}
