package org.home.chapter08.examples;

import java.util.Scanner;

public class scannerTest {
    
    public static void main(String[] args) {
    
        int i = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Type in integer number!");
            i = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
    }
}
