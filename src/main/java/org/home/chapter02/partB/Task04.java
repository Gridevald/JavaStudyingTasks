package org.home.chapter02.partB;

import java.util.Scanner;

//Print month of year
public class Task04 {
    
    public static void main(String[] args) {
        
        System.out.print("Enter int number from 1 to 12: ");
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Please, enter correct number!");
        }
        sc.close();
        
        if (n >= 1 && n <= 12) {
            switch (n) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
        } else {
            System.out.println("Please, enter correct number!");
        }
    }
}
