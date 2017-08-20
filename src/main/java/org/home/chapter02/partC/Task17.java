package org.home.chapter02.partC;

//Find local minimums
public class Task17 {
    
    public void go(double[][] input) {
    
        System.out.print("Local minimums: ");
    
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                double value = input[i][j];
                boolean isMin = true;
                //Top
                if (i > 0) {
                    if (input[i - 1][j] <= value) {
                        isMin = false;
                    }
                }
                //Bottom
                if (i < input.length - 1) {
                    if (input[i + 1][j] <= value) {
                        isMin = false;
                    }
                }
                //Left
                if (j > 0) {
                    if (input[i][j - 1] <= value) {
                        isMin = false;
                    }
                }
                //Right
                if (j < input[i].length - 1) {
                    if (input[i][j + 1] <= value) {
                        isMin = false;
                    }
                }
                //Top left
                if (i > 0 && j > 0) {
                    if (input[i - 1][j - 1] <= value) {
                        isMin = false;
                    }
                }
                //Top right
                if (i > 0 && j < input[i].length - 1) {
                    if (input[i - 1][j + 1] <= value) {
                        isMin = false;
                    }
                }
                //Bottom
                if (i < input.length - 1 && j > 0) {
                    if (input[i + 1][j - 1] <= value) {
                        isMin = false;
                    }
                }
                //Bottom
                if (i < input.length - 1 && j < input[i].length - 1) {
                    if (input[i + 1][j + 1] <= value) {
                        isMin = false;
                    }
                }
                if (isMin) {
                    System.out.print(input[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
    }
}
