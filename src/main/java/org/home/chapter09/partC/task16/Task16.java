package org.home.chapter09.partC.task16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Reads file by link from args.
 * Prints lines from file equivalent to string from args.
 */
public class Task16 {
    
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        
        try (Scanner sc = new Scanner(new File(args[0]))) {
            while (sc.hasNextLine()) {
                strings.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e);
        }
        
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals(args[1])) {
                System.out.println("#" + i + ": " + strings.get(i));
            }
        }
    }
}
