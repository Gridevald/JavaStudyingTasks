package org.home.chapter02.partC;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.home.chapter02.partC.C02PCMain.print;

//Delete rows and columns which contains max value in matrix
public class Task10 {
    
    public void go(double[][] input) {
        
        //Copy input array to new array
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, input.length);
        }
        
        //Sets of numbers of rows and columns to delete
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> columns = new HashSet<Integer>();
        
        double max = input[0][0];
        
        //Find what is max value in matrix
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] > max) {
                    max = input[i][j];
                }
            }
        }
        
        //Find rows and columns with max value
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] == max) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        
        //Copy Sets to Lists
        List<Integer> rowsList = new ArrayList<Integer>(rows);
        List<Integer> columnsList = new ArrayList<Integer>(columns);
        
        //Delete rows
        for (int i = rowsList.size() - 1; i >= 0; i--) {
            inner = this.delRow(inner, rowsList.get(i));
        }
        
        //Delete columns
        for (int i = columnsList.size() - 1; i >= 0; i--) {
            inner = this.delColumn(inner, columnsList.get(i));
        }
        
        System.out.println("Max value in matrix = " + max);
        System.out.println("Matrix with deleted rows and columns:");
        
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
