package org.home.chapter03.partC.myArray;

import java.util.Comparator;

public class MyArrayMain {
    
    public static void main(String[] args) {
    
        Integer[] array = {1, 5, 3, 8, 0, 6, 1, 3};
        MyArray<Integer> ma = new MyArray<Integer>(array);
        ma.sortMerge(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // o1 < o2 = -1; o1 = o2 = 0; o1 > o2 = 1
            }
        });
        System.out.println(ma.toString());
        
        Double[] array1 = {5.3, 2.1, 6.0, 3.3, 1.8, 7.9};
        MyArray<Double> ma1 = new MyArray<Double>(array1);
        ma1.sortMerge(new Comparator<Double>() {
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(ma1.toString());
    }
}
