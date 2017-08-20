package org.home.chapter01.partA;

import java.util.Scanner;

public class Task01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your name: ");
            System.out.println("Hello, " + sc.next() + "!\n");
        }
    }
}
