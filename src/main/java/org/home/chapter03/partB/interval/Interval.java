package org.home.chapter03.partB.interval;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Interval {
    
    private double left;
    
    private boolean includeLeft;
    
    private double right;
    
    private boolean includeRight;
    
    public Interval(double left, boolean includeLeft, double right, boolean includeRight) {
        this.left = left;
        this.includeLeft = includeLeft;
        this.right = right;
        this.includeRight = includeRight;
    }
    
    public double getLeft() {
        return left;
    }
    
    public void setLeft(double left) {
        this.left = left;
    }
    
    public boolean isIncludeLeft() {
        return includeLeft;
    }
    
    public void setIncludeLeft(boolean includeLeft) {
        this.includeLeft = includeLeft;
    }
    
    public double getRight() {
        return right;
    }
    
    public void setRight(double right) {
        this.right = right;
    }
    
    public boolean isIncludeRight() {
        return includeRight;
    }
    
    public void setIncludeRight(boolean includeRight) {
        this.includeRight = includeRight;
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        NumberFormat formatter = new DecimalFormat("#0.000");
        if (includeLeft) {
            builder.append("[");
        } else {
            builder.append("(");
        }
        builder.append(formatter.format(left)).append("; ").append(formatter.format(right));
        if (includeRight) {
            builder.append("]");
        } else {
            builder.append(")");
        }
        return (builder.toString());
    }
    
    public double length() {
        return (right - left);
    }
}
