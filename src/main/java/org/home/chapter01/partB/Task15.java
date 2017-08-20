package org.home.chapter01.partB;

//fraction
public class Task15 {
    
    public void go(int[] input) {
    
        double d3 = 0;
        String s1 = "";
        String s2 = "";
        
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > 0 && input[i + 1] > 0) {
                s1 += input[i];
                s2 += input[i + 1];
                Double d1 = Double.valueOf(s1);
                Double d2 = Double.valueOf(s2);
                d3 = d1 / d2;
                break;
            }
        }
    
        if (!s1.equals("")) {
            System.out.println("fraction: " + s1 + "/" + s2 + " = " + d3);
        } else {
            System.out.println("fraction: There is no two neighbor positive integers.");
        }
    }
}
