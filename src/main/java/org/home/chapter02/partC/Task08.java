package org.home.chapter02.partC;

//Find determinant of matrix
public class Task08 {
    
    public void go(double[][] input) {
        
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, input.length);
        }
        
        System.out.println("Determinant: " + this.determinant(inner) + "\n");
    }
    
    private double determinant(double[][] input) {
        double output = 0;
        if (input.length == 2) {
            output = input[0][0] * input[1][1] - input[0][1] * input[1][0];
        } else {
            for (int i = 0; i < input.length; i++) {
                output += Math.pow(-1, 2 + i) * input[0][i] * this.determinant(this.minor(input, i));
            }
        }
        return output;
    }
    
    private double[][] minor(double[][] input, int column) {
        double[][] output = new double[input.length - 1][input.length - 1];
        for (int i = 0; i < input.length - 1; i++) {
            System.arraycopy(input[i + 1], 0, output[i], 0, column);
            System.arraycopy(input[i + 1], column + 1, output[i], column, input.length - column - 1);
        }
        return output;
    }
}
