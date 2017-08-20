package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Move element to destination point
public class Task12 {
    
    public void go(double[][] input) {
        
        //Copy input array to new array
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, input.length);
        }
        
        int destRow = 0;
        int destColumn = 0;
        
        //Find first min value in matrix
        double min = inner[0][0];
        int row = 0;
        int column = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < inner[i].length; j++) {
                if (inner[i][j] < min) {
                    min = inner[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        
        //If destRow = row than it is not needed to change row
        if (destRow != row) {
            this.changeRows(inner, row, destRow);
        }
        
        //If destColumn = column than it is not needed to change column
        if (destColumn != column) {
            this.changeColumns(inner, column, destColumn);
        }
        
        System.out.println("Minimum element(" + row + "; " + column + "): " + min);
        System.out.println("Element moved to destination point(" + destRow + "; " + destColumn + "):");
        print(inner);
    }
    
    private void changeRows(double[][] input, int row, int destRow) {
        for (int i = 0; i < input[0].length; i++) {
            double temp = input[row][i];
            input[row][i] = input[destRow][i];
            input[destRow][i] = temp;
        }
    }
    
    private void changeColumns(double[][] input, int column, int destColumn) {
        for (int i = 0; i < input.length; i++) {
            double temp = input[i][column];
            input[i][column] = input[i][destColumn];
            input[i][destColumn] = temp;
        }
    }
}
