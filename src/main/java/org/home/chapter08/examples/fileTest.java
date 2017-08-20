package org.home.chapter08.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileTest {
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(new File("src/main/java/org/home/chapter08/examples/input.txt"))) {
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e);
        }
    }
}
