package org.home.chapter02.partA;

import static org.home.chapter02.partA.C02PAMain.length;

//Find numbers longer then average length
public class Task03 {
    
    public void go(int[] input) {
        
        double avLength = 0;
        
        for (int i : input) {
            avLength += length(i);
        }
        avLength /= input.length;
        
        System.out.println("Numbers with length more then average length(" + avLength + "):");
        for (int i : input) {
            int temp = length(i);
            if (temp > avLength) {
                System.out.println("- Number: " + i + " Length: " + temp);
            }
        }
    }
}
