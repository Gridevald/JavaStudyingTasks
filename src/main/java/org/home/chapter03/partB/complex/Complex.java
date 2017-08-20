package org.home.chapter03.partB.complex;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * This Class represents complex number: x + i*y
 */
public class Complex {
    
    private double x;
    
    private double y;
    
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public String toString() {
        NumberFormat formatter = new DecimalFormat("#0.000");
        StringBuilder builder = new StringBuilder(formatter.format(x));
        builder.append(" ");
        if (y > 0) {
            builder.append("+ ").append(formatter.format(y)).append("*i");
        } else {
            builder.append("- ").append(formatter.format(Math.abs(y))).append("*i");
        }
        return(builder.toString());
    }
}
