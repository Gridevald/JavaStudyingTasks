package org.home.chapter01.partA;

import java.util.Scanner;

public class Task03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity of random numbers: ");
        int quantity = sc.nextInt();
        sc.close();

        //Prints some quantity in each row
        for (int i = 1; i <= quantity; i++) {
            int random = (int) (Math.random() * 10);
            System.out.print(random + " ");
            if(i % 3 == 0) {
                System.out.println();
            }
        }
    
        System.out.print("\n" + "\n");
        
        //Prints in triangle shape
        int x = 0;
        int length = 1;
        while (x < quantity) {
            for (int i = 0; i < length; i++) {
                int random = (int) (Math.random() * 10);
                System.out.print(random + " ");
                x++;
                if (x >= quantity) {
                    break;
                }
            }
            length++;
            System.out.println();
        }
    }
}
