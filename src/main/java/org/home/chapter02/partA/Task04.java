package org.home.chapter02.partA;

import java.util.HashSet;
import java.util.Set;

//Find number with minimum different numerals
public class Task04 {
    
    public void go(int[] input) {
        
        int shortest = input[0];
        
        System.out.print("Number with minimum different numerals: ");
        for (int i : input) {
            if (this.different(i) < this.different(shortest)) {
                shortest = i;
            }
        }
        System.out.println(shortest);
    }
    
    private int different(int input) {
        Set<Integer> temp = new HashSet<Integer>();
        while (input != 0) {
            temp.add(input % 10);
            input /= 10;
        }
        return temp.size();
    }
}
