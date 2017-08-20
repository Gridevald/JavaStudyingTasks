package org.home.chapter10.partA;

import java.util.HashSet;
import java.util.Set;

public class Task08Main {
    
    public static void main(String[] args) {
        
        Task08 set1 = new Task08();
        for (int i = 0; i < 10; i++) {
            set1.add(i);
        }
    
        System.out.println(set1);
    
        Set<Integer> set2 = new HashSet<>();
        for (int i = 6; i < 14; i++) {
            set2.add(i);
        }
    
        System.out.println(set2);
    
        System.out.println(set1.cross(set2));
        
        set1.combine(set2);
        System.out.println(set1);
    }
}
