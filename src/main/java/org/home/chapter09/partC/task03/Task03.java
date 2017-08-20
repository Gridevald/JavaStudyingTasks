package org.home.chapter09.partC.task03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Makes file filled with reversed lines of the target file.
 */
public class Task03 {
    
    private final String outPath = "src/main/java/org/home/chapter09/partC/task03/res";
    private final String fileName = "outFile.txt";
    
    public static void main(String[] args) {
        String path = "src/main/java/org/home/chapter09/partC/task01/task01.java";
        new Task03().reverseStrings(path);
    }
    
    private void reverseStrings(String path) {
        File dir = new File(outPath);
        boolean ok;
        if (!dir.exists()) {
            ok = dir.mkdir();
        } else {
            ok = true;
        }
        if (ok) {
            try (Scanner sc = new Scanner(new File(path));
                 PrintWriter pw = new PrintWriter(new File(outPath, fileName))) {
                while (sc.hasNextLine()) {
                    pw.println(new StringBuilder(sc.nextLine()).reverse());
                }
            } catch (FileNotFoundException e) {
                System.err.println("ERROR: " + e);
            }
            System.out.println("Well done mate! :) Check out result file.");
        } else {
            System.err.println("Can't make directory!");
        }
    }
}
