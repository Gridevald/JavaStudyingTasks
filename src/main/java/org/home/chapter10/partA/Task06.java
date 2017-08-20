package org.home.chapter10.partA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Sorts lines of poem by length in ascending order.
 */
public class Task06 {
    
    public static void main(String[] args) {
        
        String file = "src/main/java/org/home/chapter10/partA/files/Task06_input.txt";
    
        List<String> poem = new LinkedList<>();
        
        try (Scanner sc = new Scanner(new File(file))) {
            while (sc.hasNextLine()) {
                poem.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e);
        }
        
        poem.sort(((o1, o2) -> o1.length() - o2.length()));
        poem.forEach(System.out::println);
    }
}
