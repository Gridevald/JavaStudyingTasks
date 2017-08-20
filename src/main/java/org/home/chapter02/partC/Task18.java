package org.home.chapter02.partC;

//Find local maximums
public class Task18 {
    
    public void go(double[][] input) {
    
        System.out.print("Local maximums: ");
    
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                double value = input[i][j];
                boolean isMax = true;
                //Top
                if (i > 0) {
                    if (input[i - 1][j] >= value) {
                        isMax = false;
                    }
                }
                //Bottom
                if (i < input.length - 1) {
                    if (input[i + 1][j] >= value) {
                        isMax = false;
                    }
                }
                //Left
                if (j > 0) {
                    if (input[i][j - 1] >= value) {
                        isMax = false;
                    }
                }
                //Right
                if (j < input[i].length - 1) {
                    if (input[i][j + 1] >= value) {
                        isMax = false;
                    }
                }
                //Top left
                if (i > 0 && j > 0) {
                    if (input[i - 1][j - 1] >= value) {
                        isMax = false;
                    }
                }
                //Top right
                if (i > 0 && j < input[i].length - 1) {
                    if (input[i - 1][j + 1] >= value) {
                        isMax = false;
                    }
                }
                //Bottom left
                if (i < input.length - 1 && j > 0) {
                    if (input[i + 1][j - 1] >= value) {
                        isMax = false;
                    }
                }
                //Bottom right
                if (i < input.length - 1 && j < input[i].length - 1) {
                    if (input[i + 1][j + 1] >= value) {
                        isMax = false;
                    }
                }
                if (isMax) {
                    System.out.print(input[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
    }
}
