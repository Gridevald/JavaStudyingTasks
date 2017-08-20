package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Transpose matrix
public class Task05 {
    
    public void go(double[][] input) {
        
        double[][] transposed = new double[input.length][input.length];
        
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed.length; j++) {
                transposed[i][j] = input[j][i];
            }
        }
    
        System.out.println("Transposed matrix: ");
        print(transposed);
    }
}
