package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Move zeros to the end of each row
public class Task13 {
    
    public void go(double[][] input) {
        
        //Copy input array to new array
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, input.length);
        }
        
        //Move zeros
        for (int q = 0; q < inner.length; q++) {
            for (int i = 0; i < inner[q].length - 1; i++) {
                for (int j = 0; j < inner[q].length - 1; j++) {
                    if (inner[q][j] == 0 && inner[q][j + 1] != 0) {
                        inner[q][j] = inner[q][j + 1];
                        inner[q][j + 1] = 0;
                    }
                }
            }
        }
        
        System.out.println("Matrix with zeros moved to the end of each row:");
        print(inner);
    }
}
