package org.home.chapter10.partA;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculates average resistance
 */
public class Task09 {
    
    public static void main(String[] args) {
        
        List<Double> u = new ArrayList<Double>() {
            {
                add(20.3);
                add(5.1);
                add(10.2);
            }
        };
        
        List<Double> i = new ArrayList<Double>() {
            {
                add(4.1);
                add(1.0);
                add(2.1);
            }
        };
    
        System.out.printf("Average resistance is %.3f", new Task09().avrResistance(u, i));
    }
    
    public double avrResistance(List<Double> u, List<Double> i) {
        if (u.size()!=i.size()) {
            throw new IllegalArgumentException("Lists has different sizes!");
        }
        List<Double> r = new ArrayList<>();
        for (int j = 0; j < u.size(); j++) {
            r.add(u.get(j) / i.get(j));
        }
        double sum = 0;
        for (double d : r) {
            sum += d;
        }
        return sum / r.size();
    }
}
