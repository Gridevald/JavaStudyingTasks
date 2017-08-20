package org.home.chapter06.figure;

public class Rectangle extends abstractFigure implements Rotatable{
    
    @Override
    public void rotate() {
        System.out.println("Rectangle is rotating.");
    }
}
