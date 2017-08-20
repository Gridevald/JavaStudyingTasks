package org.home.chapter02.partA;

import java.util.HashSet;
import java.util.Set;

import static org.home.chapter02.partA.C02PAMain.length;

//Find number with unique numerals
public class Task07 {
    
    public void go(int[] input) {
    
        System.out.print("First number with unique numerals: ");
        for(int i : input) {
            if (this.count(i)) {
                System.out.print(i);
                break;
            }
        }
        System.out.println();
    }
    
    private boolean count(int input) {
        boolean out = true;
        int temp = input;
        Set<Integer> tempSet = new HashSet<Integer>();
        while (temp != 0) {
            tempSet.add(temp % 10);
            temp /= 10;
        }
        if (tempSet.size() != length(input)) {
            out = false;
        }
        return out;
    }
}
