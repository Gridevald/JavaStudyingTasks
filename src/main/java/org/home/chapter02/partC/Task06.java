package org.home.chapter02.partC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Calculate norms of matrix
public class Task06 {
    
    public void go(double[][] input) {
    
        List<Double> iNorm = new ArrayList<Double>();
        List<Double> jNorm = new ArrayList<Double>();
    
        System.out.println("Norms of matrix:");
        
        for (int i = 0; i < input.length; i++) {
            double sum = 0;
            for (int j = 0; j < input.length; j++) {
                sum += Math.abs(input[i][j]);
            }
            iNorm.add(sum);
        }
        System.out.println("- I-norm: " + Collections.max(iNorm));
    
        for (int i = 0; i < input.length; i++) {
            double sum = 0;
            for (int j = 0; j < input.length; j++) {
                sum += Math.abs(input[j][i]);
            }
            jNorm.add(sum);
        }
        System.out.println("- J-norm: " + Collections.max(jNorm));
        System.out.println();
    }
}
