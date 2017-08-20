package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Sort matrix by value in k row
public class Task01 {
    
    public void go(double[][] input) {
        
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < inner.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, inner.length);
        }
        
        int k = 2;
        
        for (int i = 0; i < inner.length - 1; i++) {
            for (int j = 0; j < inner.length - 1; j++) {
                if (inner[k][j] > inner[k][j + 1]) {
                    double temp;
                    for (int q = 0; q < inner.length; q++) {
                        temp = inner[q][j];
                        inner[q][j] = inner[q][j + 1];
                        inner[q][j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Matrix sorted by value in " + k + " row: ");
        print(inner);
    }
}
