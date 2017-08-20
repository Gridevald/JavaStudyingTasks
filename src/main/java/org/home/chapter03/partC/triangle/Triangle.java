package org.home.chapter03.partC.triangle;
;
import org.home.chapter03.partC.point.Point;
import org.home.chapter03.partC.point.PointHandler;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

/**
 * This is triangle in 3-dimension system
 */
public class Triangle {
    
    private Point p1;
    
    private Point p2;
    
    private Point p3;
    
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public Point getP1() {
        return p1;
    }
    
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    
    public Point getP2() {
        return p2;
    }
    
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    
    public Point getP3() {
        return p3;
    }
    
    public void setP3(Point p3) {
        this.p3 = p3;
    }
    
    /**
     * Calculates triangle perimeter by calculating distance
     * between points of triangle
     */
    public double perimeter() {
        PointHandler ph = new PointHandler();
        return (ph.distance(p1, p2) + ph.distance(p2, p3) + ph.distance(p3, p1));
    }
    
    /**
     * Calculates triangle perimeter by Gerons formula
     */
    public double square() {
        PointHandler ph = new PointHandler();
        double p = perimeter() / 2;
        double a = ph.distance(p1, p2);
        double b = ph.distance(p2, p3);
        double c = ph.distance(p3, p1);
        return (sqrt(p * (p - a) * (p - b) * (p - c)));
    }
    
    /**
     * Finds type of triangle:
     * - Equilateral - all 3 sides of triangle has the same length;
     * - Right - there is angle 90 degrees;
     * - Isosceles - two sides of triangle has the same length;
     * - Arbitrary - length of sides and degree values are different.
     */
    public String type() {
        
        PointHandler ph = new PointHandler();
        StringBuilder sb = new StringBuilder();
        
        double a = ph.distance(p1, p2);
        double b = ph.distance(p2, p3);
        double c = ph.distance(p3, p1);
        double tolerance = 10e-20;
        
        if (abs(a - b) < tolerance && abs(a - c) < tolerance) {
            sb.append("Equilateral triangle.");
        } else {
            if ((abs(a - b) < tolerance && abs(a - c) > tolerance) ||
                    (abs(b - c) < tolerance && abs(b - a) > tolerance) ||
                    (abs(a - c) < tolerance && abs(a - b) > tolerance)) {
                if (pow(a, 2) + pow(b, 2) - pow(c, 2) < tolerance ||
                        (pow(b, 2) + pow(c, 2) - pow(a, 2)) < tolerance ||
                        (pow(a, 2) + pow(c, 2) - pow(b, 2) < tolerance)) {
                    sb.append("Right and isosceles triangle.");
                } else {
                    sb.append("Isosceles triangle.");
                }
            } else {
                if (pow(a, 2) + pow(b, 2) - pow(c, 2) < tolerance ||
                        (pow(b, 2) + pow(c, 2) - pow(a, 2)) < tolerance ||
                        (pow(a, 2) + pow(c, 2) - pow(b, 2) < tolerance)) {
                    sb.append("Right triangle.");
                } else {
                    sb.append("Arbitrary triangle.");
                }
            }
        }
        
        return sb.toString();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder(type());
        sb.append(" Vertexes: ").append(p1);
        sb.append(", ").append(p2);
        sb.append(", ").append(p3).append(".");
        return sb.toString();
    }
}
