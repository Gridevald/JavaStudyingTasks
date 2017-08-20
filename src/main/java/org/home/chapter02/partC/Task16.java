package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Sort matrix by row sum
public class Task16 {
    
    public void go(double[][] input) {
        
        //Copy input array to new array
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, input.length);
        }
        
        //Sorting by row sum
        for (int q = 0; q < inner.length - 1; q++) {
            for (int r = 0; r < inner.length - 1; r++) {
                //sum of 2 rows
                double sum0 = 0;
                double sum1 = 0;
                for (int i = 0; i < inner[r].length; i++) {
                    sum0 += inner[r][i];
                    sum1 += inner[r + 1][i];
                }
                //switch rows if necessary
                if (sum0 > sum1) {
                    double[] temp = inner[r];
                    inner[r] = inner[r + 1];
                    inner[r + 1] = temp;
                }
            }
        }
        
        System.out.println("Matrix sorted by row-sum:");
        print(inner);
    }
}
