package org.home.chapter02.partA;

import static org.home.chapter02.partA.C02PAMain.length;

//Find Longest and Shortest numbers in array
public class Task01 {
    
    public void go(int[] input) {
        
        int shortNumber = input[0];
        int shortLength = length(input[0]);
        int longNumber = input[0];
        int longLength = length(input[0]);
        
        for (int i : input) {
            int temp = length(i);
            if (temp > longLength) {
                longLength = temp;
                longNumber = i;
            }
            if (temp < shortLength) {
                shortLength = temp;
                shortNumber = i;
            }
        }
        
        System.out.println("Longest number: " + longNumber + ", Length: " + longLength);
        System.out.println("Shortest number: " + shortNumber + ", Length: " + shortLength);
    }
}
