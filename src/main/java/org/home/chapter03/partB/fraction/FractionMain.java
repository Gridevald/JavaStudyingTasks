package org.home.chapter03.partB.fraction;

import java.util.ArrayList;
import java.util.List;

public class FractionMain {
    
    public static void main(String[] args) {
    
        List<Fraction> fractions = new ArrayList<Fraction>();
        fractions.add(new Fraction(1, 3));
        fractions.add(new Fraction(2, 5));
        fractions.add(new Fraction(-3, 2));
        fractions.add(new Fraction(2, 1));
        fractions.add(new Fraction(5, 8));
        fractions.add(new Fraction(7, 3));
        fractions.add(new Fraction(-1, -4));
        fractions.add(new Fraction(8, 9));
//        fractions.add(new fraction(6, 7));
        
        printList(fractions);
    
        FractionHandler handler = new FractionHandler();
        handler.sumEven(fractions);
        
        printList(fractions);
    }
    
    public static void printList(List<Fraction> list) {
        System.out.println("Fractions:");
        for (Fraction f : list) {
            System.out.print(f + " ");
        }
        System.out.println();
    }
}
