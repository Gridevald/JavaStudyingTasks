package org.home.chapter02.partC;

//Calculate sum of numbers between 1st and 2nd positive numbers in each row
public class Task04 {
    
    public void go(double[][] input) {
        
        System.out.println("Sum of numbers between two positive numbers:");
        for (int i = 0; i < input.length; i++) {
            int positive = 0;
            //Check if there are 2 or more positives in a row
            for (int j = 0; j < input.length; j++) {
                if (input[i][j] > 0) {
                    positive++;
                }
            }
            //If there are more than 1 positive number - count sum
            if (positive > 1) {
                boolean count = false;
                double sum = 0;
                for (int j = 0; j < input.length; j++) {
                    if (input[i][j] <= 0) {
                        if (count) {
                            sum += input[i][j];
                        }
                    } else {
                        if (count) {
                            break;
                        } else {
                            count = true;
                        }
                    }
                }
                System.out.println("- " + i + " row: " + sum);
            } else {
                System.out.println("- " + i + " row: it's less than 2 positives in a row");
            }
        }
        System.out.println();
    }
}
