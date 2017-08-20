package org.home.chapter02.partC;

//Find max number of ascent values in matrix
public class Task03 {
    
    public void go(double[][] input) {
        
        int count = 1;
        int max = 1;
        
        //Rewrite input to 1-dimension array
        int c = 0;
        double[] inner = new double[input.length * input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                inner[c++] = input[i][j];
            }
        }
        
        for (int i = 0; i < inner.length - 1; i++) {
            if (inner[i] < inner[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println("Max sequence ascent numbers: " + max);
        System.out.println();
    }
}
