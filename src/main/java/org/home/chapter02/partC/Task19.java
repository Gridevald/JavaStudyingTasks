package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Sort matrix by columns characteristics
public class Task19 {
    
    public void go(double[][] input) {
    
        //Copy input array to new array
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, input.length);
        }
        
        for (int i = 0; i < inner[0].length - 1; i++) {
            for (int j = 0; j < input[0].length - 1; j++) {
                if (this.charact(inner, j) < this.charact(inner, j + 1)) {
                    for (int q = 0; q < inner.length; q++) {
                        double temp = inner[q][j];
                        inner[q][j] = inner[q][j + 1];
                        inner[q][j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Sorted by columns characteristics:");
        print(inner);
    }
    
    private double charact(double[][] input, int column) {
        double output = 0;
        for (int i = 0; i < input.length; i++) {
            output += Math.abs(input[i][column]);
        }
        return output;
    }
}
