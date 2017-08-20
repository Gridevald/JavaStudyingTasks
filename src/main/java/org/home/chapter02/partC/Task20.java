package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

public class Task20 {
    
    public void go(double[][] input) {
        
        //Copy input array to new array
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, input.length);
        }
        
        //Rewrite inner to linear array
        int c = 0;
        double[] linear = new double[inner.length * inner.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                linear[c++] = input[i][j];
            }
        }
        
        //Sort linear array to get max values in matrix
        for (int i = 0; i < linear.length - 1; i++) {
            for (int j = 0; j < linear.length - 1; j++) {
                if (linear[j] < linear[j + 1]) {
                    double temp = linear[j];
                    linear[j] = linear[j + 1];
                    linear[j + 1] = temp;
                }
            }
        }
        
        //Find max values in inner and move it to main diagonal
        for (int q = 0; q < inner.length; q++) {
            out:
            for (int i = 0; i < inner.length; i++) {
                for (int j = 0; j < inner[i].length; j++) {
                    if (inner[i][j] == linear[q]) {
                        if (!(i == j && i <= q)) { //!(i == j && i <= q) !(i == j) || (i == j && i > q)
                            double temp = inner[q][q];
                            inner[q][q] = inner[i][j];
                            inner[i][j] = temp;
                            break out;
                        }
                    }
                }
            }
        }
        
        System.out.println("Max values in matrix placed on main diagonal:");
        print(inner);
    }
}
