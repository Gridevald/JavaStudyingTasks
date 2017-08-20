package org.home.chapter03.partC.triangle;

import org.home.chapter03.partB.fraction.Fraction;
import org.home.chapter03.partC.point.Point;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TriangleMain {
    
    public static void main(String[] args) {
    
        NumberFormat fr = new DecimalFormat ("#0.000");
        
        Triangle tr = new Triangle(new Point(new Fraction(1), new Fraction(-3), new Fraction(1)),
                new Point(new Fraction(5), new Fraction(2), new Fraction(-5)),
                new Point(new Fraction(-1), new Fraction(5), new Fraction(3)));
    
        Triangle tr1 = new Triangle(new Point(new Fraction(1), new Fraction(2)),
                new Point(new Fraction(5), new Fraction(2)),
                new Point(new Fraction(5), new Fraction(5)));
        
//        System.out.println("Perimeter: " + fr.format(tr.perimeter()));
//        System.out.println("Square: " + fr.format(tr.square()));
//        tr.type();
    
        System.out.println(tr1.toString());
        System.out.println("Perimeter: " + fr.format(tr1.perimeter()));
        System.out.println("Square: " + fr.format(tr1.square()));
    }
}
