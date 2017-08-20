package org.home.chapter10.partA;

import java.util.*;

/**
 * This class has methods for operating with maps, represents polynomials.
 * makePolynomial - produces new map-polynomial;
 * sumPolynomial - produces map-polynomial as result of sum two polynomials.
 * multPolynomial - produces map-polynomial as result of multiplication of two polynomials.
 */
public class Task11Task12 {
    
    public static void main(String[] args) {
        
        Task11Task12 task = new Task11Task12();
        
        HashMap<Integer, Double> map1 = task.makePolynomial(4);
        HashMap<Integer, Double> map2 = task.makePolynomial(4);
        map1.put(5, 50.0);
        map2.put(6, 60.0);
    
        System.out.println(map1);
        System.out.println(map2);
    
        System.out.println(task.sumPolynomial(map1, map2));
        System.out.println(task.multPolynomial(map1, map2));
    }
    
    /**
     * Takes int value as grade of polynomial.
     * Returns map, where Key represents grade of polynomial:
     * 0 = x^0; 1 = x^1 and so on;
     * Value represents coefficient appropriated to Key grade.
     */
    public HashMap<Integer, Double> makePolynomial(int grade) {
        HashMap<Integer, Double> out = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i <= grade; i++) {
            out.put(i, (random.nextDouble() * 200) - 100);
        }
        return out;
    }
    
    /**
     * Takes two maps, represents polynomial.
     * Sum coefficients of appropriate Keys.
     * Returns map, which represents summary polynomial.
     */
    public HashMap<Integer, Double> sumPolynomial(HashMap<Integer, Double> m1, HashMap<Integer, Double> m2) {
        Set<Integer> grades = new TreeSet<>();
        grades.addAll(m1.keySet());
        grades.addAll(m2.keySet());
        HashMap<Integer, Double> out = new HashMap<>();
        for (Integer i : grades) {
            double temp = 0;
            if (m1.containsKey(i)) {
                temp += m1.get(i);
            }
            if (m2.containsKey(i)) {
                temp += m2.get(i);
            }
            out.put(i, temp);
        }
        return out;
    }
    
    /**
     * Takes two maps, represents polynomial.
     * Multiplies coefficients of appropriate Keys.
     * Returns map, which represents multiplied polynomial.
     */
    public HashMap<Integer, Double> multPolynomial(HashMap<Integer, Double> m1, HashMap<Integer, Double> m2) {
        Set<Integer> grades = new TreeSet<>();
        grades.addAll(m1.keySet());
        grades.addAll(m2.keySet());
        HashMap<Integer, Double> out = new HashMap<>();
        for (Integer i : grades) {
            if (m1.containsKey(i) && m2.containsKey(i)) {
                out.put(i, m1.get(i) * m2.get(i));
            }
        }
        return out;
    }
}
