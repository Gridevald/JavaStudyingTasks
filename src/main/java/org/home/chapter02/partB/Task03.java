package org.home.chapter02.partB;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.lang.Math.*;

//Find roots of quadratic equation a * x^2 + b * x + c = 0
public class Task03 {
    
    public static void main(String[] args) {
        
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double c = Double.valueOf(args[2]);
        
        double d = b * b - 4 * a * c;
        
        NumberFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println("Roots are:");
        if (d >= 0) {
            double x1 = (-b + sqrt(d)) / (2 * a);
            double x2 = (-b - sqrt(d)) / (2 * a);
            System.out.println("x1 = " + formatter.format(x1));
            System.out.println("x2 = " + formatter.format(x2));
        } else {
            double x = -b / (2 * a);
            double i = (sqrt(abs(d))) / (2 * a);
            System.out.println("x1 = " + formatter.format(x) + "+" + formatter.format(i) + "*i");
            System.out.println("x2 = " + formatter.format(x) + "-" + formatter.format(i) + "*i");
        }
    }
}
