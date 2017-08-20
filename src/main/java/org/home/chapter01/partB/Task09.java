package org.home.chapter01.partB;

import java.util.Arrays;

public class Task09 {
    
    public void go(int[] input) {
        
        //Sort ascend
        int[] inner = new int[input.length];
        System.arraycopy(input, 0, inner, 0, input.length);
        Arrays.sort(inner);
        
        System.out.print("Sorted array ascend: ");
        for (int i : inner) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        //Rewrite array backwards to get array sorted descent
        int[] descent = new int[inner.length];
        for(int i = 0; i < inner.length; i++) {
            descent[i] = inner[inner.length-1-i];
        }
    
        System.out.print("Sorted array descent: ");
        for (int i : descent) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
