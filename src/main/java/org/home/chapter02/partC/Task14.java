package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Round values in matrix
public class Task14 {
    
    public void go(double[][] input) {
        
        //New array for rounded value
        double[][] inner = new double[input.length][input.length];
        
        //Round values
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                inner[i][j] = input[i][j] - input[i][j] % 1;
            }
        }
        
        System.out.println("Rounded values in matrix:");
        print(inner);
    }
}
