package org.home.chapter09.partA;

import java.io.*;
import java.util.Scanner;

/**
 * Deletes all numerals
 */
public class Task01 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("src/main/java/org/home/chapter09/partA/data/task01_input.txt"));
//             FileWriter fw = new FileWriter(new File("src/main/java/org/home/chapter09/partA/results/task01_output.txt"));
//             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(new File("src/main/java/org/home/chapter09/partA/results/task01_output.txt"))) {
            while (sc.hasNextLine()) {
                String temp = sc.nextLine().replaceAll("[0-9]+", "");
                pw.println(temp);
            }
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
        }
    
        System.out.println("Well done. Look at Output file! :)");
    }
}
