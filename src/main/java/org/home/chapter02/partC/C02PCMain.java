package org.home.chapter02.partC;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class C02PCMain {
    
    public static void main(String[] args) {
        
        int n = 0;

        System.out.print("Enter size of square matrix n: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("This is not correct!");
        }
        sc.close();

        double[][] matrix = new double[n][];

        if (n > 0) {
            Random random = new Random();
            matrix = new double[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
//                    matrix[i][j] = random.nextInt(n * 2 + 1) - n;
                    matrix[i][j] = random.nextDouble() * 2 * n - n;
                }
            }
        }
    
//        double[][] matrix = {
//                {4, 2, 1},
//                {1, 4, 3},
//                {1, 3, 4}};
    
//        double[][] matrix = {
//                {-4, -3, -1, 1},
//                {-4, 1, 3, -1},
//                {1, 3, 0, 4},
//                {-2, 0, 0, -2}};

//       double[][] matrix = {
//                {2.4, 0.0, 0.5, 1.8},
//                {0.0, 0.0, 0.0, 0.0},
//                {2.9, 0.0, 0.0, 3.4},
//                {1.1, 0.0, 0.0, 3.6}};
        
        System.out.println("Matrix: ");
        print(matrix);
        
        //Sort columns by value in k row in ascend order
        new Task01().go(matrix);
        
        //Move columns to right on k columns
        new Task02().go(matrix);
        
        //Find max number of ascent values in matrix
        new Task03().go(matrix);
        
        //Calculate sum of numbers between 1st and 2nd positive numbers in each row
        new Task04().go(matrix);
        
        //Transpose matrix
        new Task05().go(matrix);
        
        //Norms of matrix
        new Task06().go(matrix);
        
        //Turn matrix counter clock-wise
        new Task07().go(matrix);
        
        //Find determinant of matrix
        new Task08().go(matrix);
        
        //Reduced rows by avg value in row
        new Task09().go(matrix);
        
        //Minus row and column with max value
        new Task10().go(matrix);
        
        //Delete zero-filled rows and columns
        new Task11().go(matrix);
        
        //Move element to destination point
        new Task12().go(matrix);
        
        //Move zeros to the end of each row
        new Task13().go(matrix);
        
        //Round values in matrix
        new Task14().go(matrix);
        
        //Find saddle points
        new Task15().go(matrix);
        
        //Sort matrix by row sum
        new Task16().go(matrix);
        
        //Local minimums
        new Task17().go(matrix);
    
        //Local maximums
        new Task18().go(matrix);
        
        //Sort matrix by columns characteristics
        new Task19().go(matrix);
        
        //Build main diagonal with max values
        new Task20().go(matrix);
    }
    
    public static void print(double[][] input) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        for (double[] i : input) {
            for (double j : i) {
                System.out.print(formatter.format(j) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
