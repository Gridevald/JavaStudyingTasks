package org.home.chapter01.partA;

public class Task05 {
    
    public static void main(String[] args) {
        
        int sum = 0;
        int mult = 1;
        
        for(String str : args) {
            sum += Integer.valueOf(str);
            mult *= Integer.valueOf(str);
        }
    
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + mult);
    }
}
