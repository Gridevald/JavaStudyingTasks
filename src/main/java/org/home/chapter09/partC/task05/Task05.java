package org.home.chapter09.partC.task05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Reads file with students FirstNames and their marks.
 * Writes file with students FirstNames in UpperCase
 */
public class Task05 {
    
    public static void main(String[] args) {
        String inFile = "src/main/java/org/home/chapter09/partC/task05/data/students.txt";
        String outPath = "src/main/java/org/home/chapter09/partC/task05/results";
        String outFile = "studentsOut.txt";
        
        File outDir = new File(outPath);
        boolean ok;
        if (outDir.exists()) {
            ok = true;
        } else {
            ok = outDir.mkdir();
        }
        
        if (ok) {
            try (Scanner sc = new Scanner(new File(inFile));
                 PrintWriter pw = new PrintWriter(new File(outPath, outFile))) {
                while (sc.hasNextLine()) {
                    String[] temp = sc.nextLine().split("\\s");
                    String firstName = temp[0];
                    double sumMark = 0;
                    for (int i = 1; i < temp.length; i++) {
                        sumMark += new Integer(temp[i]);
                    }
                    
                    StringBuilder sb = new StringBuilder();
                    if ((sumMark / (temp.length - 1)) > 7) {
                        sb.append(firstName.toUpperCase()).append(" ");
                    } else {
                        sb.append(firstName).append(" ");
                    }
                    for (int i = 1; i < temp.length; i++) {
                        sb.append(temp[i]).append(" ");
                    }
                    pw.println(sb.toString().trim());
                }
                System.out.println("Everything is fine! Check out results.");
            } catch (FileNotFoundException e) {
                System.err.println("Something goes wrong with files. " + e);
            } catch (NumberFormatException e) {
                System.err.println("Wrong cast. " + e);
            }
        } else {
            System.err.println("Something goes wrong with directories.");
        }
    }
}
