package org.home.chapter03.partC.point;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class PointHandler {
    
    public boolean pointsOnLine(Point p1, Point p2, Point p3) {
        
        boolean output = false;
        double tolerance = 10e-20;
        
        double x;
        double y;
        double z;
        
        if (abs(p2.getX().toDecimal() - p3.getX().toDecimal()) < tolerance) {
            x = 0;
        } else {
            x = (p1.getX().toDecimal() - p3.getX().toDecimal()) / (p2.getX().toDecimal() - p3.getX().toDecimal());
        }
        if (abs(p2.getY().toDecimal() - p3.getY().toDecimal()) < tolerance) {
            y = 0;
        } else {
            y = (p1.getY().toDecimal() - p3.getY().toDecimal()) / (p2.getY().toDecimal() - p3.getY().toDecimal());
        }
        if (abs(p2.getZ().toDecimal() - p3.getZ().toDecimal()) < tolerance) {
            z = 0;
        } else {
            z = (p1.getZ().toDecimal() - p3.getZ().toDecimal()) / (p2.getZ().toDecimal() - p3.getZ().toDecimal());
        }
        
        //If 2 or 3 coordinates = 0, than points lies on the same line
        if ((x == 0 && y == 0) || (y == 0 && z == 0) || (z == 0 && x == 0)) {
            output = true;
            return output;
        }
        
        //If 1 coordinate = 0
        if (x == 0) {
            if (abs(y - z) < tolerance) {
                output = true;
                return output;
            }
        }
        if (y == 0) {
            if (abs(x - z) < tolerance) {
                output = true;
                return output;
            }
        }
        if (z == 0) {
            if (abs(x - y) < tolerance) {
                output = true;
                return output;
            }
        }
        
        //If non of coordinate = 0
        if (abs(x - y) < tolerance && abs(x - z) < tolerance) {
            output = true;
            return output;
        }
        
        return output;
    }
    
    public double distance(Point p1, Point p2) {
        double x = p1.getX().toDecimal() - p2.getX().toDecimal();
        double y = p1.getY().toDecimal() - p2.getY().toDecimal();
        double z = p1.getZ().toDecimal() - p2.getZ().toDecimal();
        return (sqrt(pow(x, 2) + pow(y, 2) + pow(z, 2)));
    }
}
