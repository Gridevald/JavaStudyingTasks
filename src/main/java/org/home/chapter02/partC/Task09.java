package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Reduce each element in row by avg value of current row
public class Task09 {
    
    public void go(double[][] input) {
        
        double[][] inner = new double[input.length][input.length];
        double[] average = new double[input.length];
        
        for (int i = 0; i < input.length; i++) {
            double sum = 0;
            for (int j = 0; j < input.length; j++) {
                sum += input[i][j];
            }
            average[i] = sum / input.length;
        }
        
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < inner.length; j++) {
                inner[i][j] = input[i][j] - average[i];
            }
        }
    
        System.out.println("Matrix where each element reduced" + "\n" + "on average value in current row:");
        print(inner);
    }
}
