package org.home.chapter02.partC;

import java.util.ArrayList;
import java.util.List;

import static org.home.chapter02.partC.C02PCMain.print;

//Delete zero-filled rows and columns
public class Task11 {
    
    public void go(double[][] input) {
        
        //Copy input array to new array
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, input.length);
        }
        
        //Lists of number of columns and rows to delete
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> columns = new ArrayList<Integer>();
        
        //Find rows filled with 0
        for (int i = 0; i < input.length; i++) {
            boolean isZero = true;
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero) {
                rows.add(i);
            }
        }
        
        //Find columns filled with 0
        for (int i = 0; i < input.length; i++) {
            boolean isZero = true;
            for (int j = 0; j < input[0].length; j++) {
                if (input[j][i] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero) {
                columns.add(i);
            }
        }
        
        //Delete rows
        for (int i = rows.size() - 1; i >= 0; i--) {
            inner = this.delRow(inner, rows.get(i));
        }
        
        //Delete columns
        for (int i = columns.size() - 1; i >= 0; i--) {
            inner = this.delColumn(inner, columns.get(i));
        }
        
        System.out.println("Matrix without zero-filled columns and rows:");
        print(inner);
    }
    
    private double[][] delRow(double[][] input, int row) {
        if (input.length > 0) {
            double[][] output = new double[input.length - 1][input[0].length];
            for (int i = 0; i < row; i++) {
                System.arraycopy(input[i], 0, output[i], 0, input[i].length);
            }
            for (int i = row; i < input.length - 1; i++) {
                System.arraycopy(input[i + 1], 0, output[i], 0, input[i].length);
            }
            return output;
        } else {
            return input;
        }
    }
    
    private double[][] delColumn(double[][] input, int column) {
        if (input.length > 0) {
            double[][] output = new double[input.length][input[0].length - 1];
            for (int i = 0; i < input.length; i++) {
                System.arraycopy(input[i], 0, output[i], 0, column);
                System.arraycopy(input[i], column + 1, output[i], column, input[0].length - column - 1);
            }
            return output;
        } else {
            return input;
        }
    }
}
