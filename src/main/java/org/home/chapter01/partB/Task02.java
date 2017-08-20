package org.home.chapter01.partB;

//Find min and max numbers
public class Task02 {
    
    public void go(int[] input) {
    
        int min = input[0];
        int max = input[0];
    
        for (int i : input) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
    
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
