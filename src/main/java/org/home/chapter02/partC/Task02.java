package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Move columns to right on k columns
public class Task02 {
    
    public void go(double[][] input) {
        
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < inner.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, inner.length);
        }
        
        int k = 1;
        
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < k; j++) {
                double temp = inner[i][inner.length - 1];
                System.arraycopy(inner[i], 0, inner[i], 1, inner.length - 1);
                inner[i][0] = temp;
            }
        }
        System.out.println("Columns moved to right on " + k + " columns: ");
        print(inner);
    }
}
