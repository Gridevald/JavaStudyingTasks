package org.home.chapter10.examples;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(2);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        System.out.println(ints);
        ints.add(1, 4);
        System.out.println(ints);
    }
}
