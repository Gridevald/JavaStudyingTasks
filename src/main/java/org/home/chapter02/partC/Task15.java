package org.home.chapter02.partC;

import java.text.DecimalFormat;
import java.text.NumberFormat;

//Find saddle points
public class Task15 {
    
    public void go(double[][] input) {
    
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.print("Saddle points:\n");
        
        //Find saddle points
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (this.isSaddle(input, i, j)) {
                    System.out.print(formatter.format(input[i][j]) + " ");
                }
            }
        }
        System.out.println();
    }
    
    private boolean isSaddle (double[][] input, int row, int column) {
        boolean saddle = true;
        double value = input[row][column];
        
        //Check if value min in row
        for (int i = 0; i < input[row].length; i++) {
            if (input[row][i] < value) {
                saddle = false;
                return saddle;
            }
        }
        
        //Check if value max in column
        for (int i = 0; i < input.length; i++) {
            if (input[i][column] > value) {
                saddle = false;
                return saddle;
            }
        }
        
        return saddle;
    }
}
