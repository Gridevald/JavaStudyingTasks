package org.home.chapter01.partB;

public class Task14 {
    
    public void go(int[] input) {
        
        System.out.print("Numbers equals half sum of neighbors: ");
        for (int i = 1; i < input.length - 1; i++) {
            Double d1 = Double.valueOf(String.valueOf(input[i - 1]));
            Double d2 = Double.valueOf(String.valueOf(input[i + 1]));
            Double d3 = Double.valueOf(String.valueOf(input[i]));
            if (d3.equals((d1 + d2)/2)) {
                System.out.print(input[i] + " ");
            }
        }
        System.out.println();
    }
}
