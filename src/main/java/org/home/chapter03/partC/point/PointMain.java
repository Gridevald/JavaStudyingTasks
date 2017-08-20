package org.home.chapter03.partC.point;

import org.home.chapter03.partB.fraction.Fraction;

public class PointMain {
    
    public static void main(String[] args) {
        
//        point p1 = new point(new fraction(2, 1), new fraction(2, 1), new fraction(4, 2));
//        System.out.println(p1);
//
//        System.out.println(p1.distanceZero());
        
        PointHandler ph = new PointHandler();
        
        Point p2 = new Point(new Fraction(7), new Fraction(5), new Fraction(0));
        Point p3 = new Point(new Fraction(1), new Fraction(5), new Fraction(0));
        Point p4 = new Point(new Fraction(4), new Fraction(5), new Fraction(0));
    
        System.out.println(ph.pointsOnLine(p2, p3, p4));
    }
}
