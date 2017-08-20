package org.home.chapter01.partA;

import java.util.Scanner;

public class Task04 {
    
    private static final String PASSWORD = "Hello";
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        if (sc.next().equals(PASSWORD)) {
            System.out.println("Correct :)");
        } else {
            System.out.println("Incorrect :(");
        }
    }
}
