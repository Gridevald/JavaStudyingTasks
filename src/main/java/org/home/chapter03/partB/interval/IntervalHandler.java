package org.home.chapter03.partB.interval;

import java.util.List;

public class IntervalHandler {
    
    public boolean cross(Interval i1, Interval i2) {
        boolean output = false;
        
        Interval left;
        Interval right;
        
        //If i1 left point = i2 left point
        // or i1 right point = i2 right point
        // than it is 100% i1 cross i2
        if (i1.getLeft() == i2.getLeft() || i1.getRight() == i2.getRight()) {
            output = true;
            return output;
        }
        
        //Find which interval lies far left
        if (i1.getLeft() < i2.getLeft()) {
            left = i1;
            right = i2;
        } else {
            left = i2;
            right = i1;
        }
        
        //Find out if there is crossing
        if (right.getLeft() < left.getRight()) {
            output = true;
            return output;
        } else {
            if (right.getLeft() == left.getRight() && right.isIncludeLeft() && left.isIncludeRight()) {
                output = true;
                return output;
            }
        }
        return output;
    }
    
    public Interval connect(Interval i1, Interval i2) {
        Interval output = null;
        if (cross(i1, i2)) {
            double left;
            boolean inludeLeft;
            double right;
            boolean includeRight;
            //If left points equal findFile which point include
            if (i1.getLeft() == i2.getLeft()) {
                if (i1.isIncludeLeft()) {
                    left = i1.getLeft();
                    inludeLeft = i1.isIncludeLeft();
                } else {
                    left = i2.getLeft();
                    inludeLeft = i2.isIncludeLeft();
                }
            }
            //If right points equal findFile which point include
            if (i1.getRight() == i2.getRight()) {
                if (i1.isIncludeRight()) {
                    right = i1.getRight();
                    includeRight = i1.isIncludeRight();
                } else {
                    right = i2.getRight();
                    includeRight = i2.isIncludeRight();
                }
            }
            //Find left point for output if left points of input are not equal
            if (i1.getLeft() < i2.getLeft()) {
                left = i1.getLeft();
                inludeLeft = i1.isIncludeLeft();
            } else {
                left = i2.getLeft();
                inludeLeft = i2.isIncludeLeft();
            }
            //Find right point for output if right points of input are not equal
            if (i2.getRight() > i1.getRight()) {
                right = i2.getRight();
                includeRight = i2.isIncludeRight();
            } else {
                right = i1.getRight();
                includeRight = i1.isIncludeRight();
            }
            output = new Interval (left, inludeLeft, right, includeRight);
        }
        return output;
    }
    
    public double longest(List<Interval> list) {
        double output = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > output) {
                output = list.get(i).length();
            }
        }
        return output;
    }
}
