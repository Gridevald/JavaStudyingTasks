package org.home.chapter06.figure;

public class Triangle extends abstractFigure implements Rotatable{
    
    @Override
    public void rotate() {
        System.out.println("Triangle is rotating.");
    }
}
