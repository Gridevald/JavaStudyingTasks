package org.home.chapter03.partC.point;

import org.home.chapter03.partB.fraction.Fraction;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    
    private Fraction x;
    
    private Fraction y;
    
    private Fraction z;
    
    public Point(Fraction x, Fraction y) {
        this.x = x;
        this.y = y;
        this.z = new Fraction(0);
    }
    
    public Point(Fraction x, Fraction y, Fraction z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Fraction getX() {
        return x;
    }
    
    public void setX(Fraction x) {
        this.x = x;
    }
    
    public Fraction getY() {
        return y;
    }
    
    public void setY(Fraction y) {
        this.y = y;
    }
    
    public Fraction getZ() {
        return z;
    }
    
    public void setZ(Fraction z) {
        this.z = z;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(x: ").append(x);
        sb.append("; y: ").append(y);
        sb.append("; z: ").append(z).append(")");
        return sb.toString();
    }
    
    public double distanceZero() {
        return (sqrt(pow(x.toDecimal(), 2) + pow(y.toDecimal(), 2) + pow(z.toDecimal(), 2)));
    }
}
