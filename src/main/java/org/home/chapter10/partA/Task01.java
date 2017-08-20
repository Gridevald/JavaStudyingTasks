package org.home.chapter10.partA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Reads file and writes reversed lines in output file.
 */
public class Task01 {
    
    public static void main(String[] args) {
        
        String path = "src/main/java/org/home/chapter10/partA/files";
        String input = "Task01_input.txt";
        String output = "Task01_output.txt";
    
        List<String> lines = new LinkedList<>();
        
        try (Scanner sc = new Scanner(new File(path, input))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
            System.out.println("Scanner OK.");
        } catch (FileNotFoundException e) {
            System.err.println("Scanner: " + e);
        }
        
        try (PrintWriter pw = new PrintWriter(new File(path, output))) {
            for (int i = lines.size(); i > 0; i--) {
                pw.println(lines.get(i - 1));
            }
            System.out.println("PrintWriter OK.");
        } catch (FileNotFoundException e) {
            System.err.println("PrintWriter: " + e);
        }
    }
}