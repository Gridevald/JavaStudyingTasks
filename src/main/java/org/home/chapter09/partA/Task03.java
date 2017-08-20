package org.home.chapter09.partA;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Finds words starts with consonant letter
 */
public class Task03 {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(new File("src/main/java/org/home/chapter09/partA/data/task03_input.txt"));
             PrintWriter pw = new PrintWriter(new File("src/main/java/org/home/chapter09/partA/results/task03_output.txt"))){
            int number = 0;
            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                Matcher m = Pattern.compile("\\b[bcdfghjklmnpqrstvwzxBCDFGHJKLMNPQRSTVWZX][\\w']+\\b").matcher(temp);
                StringBuilder sb = new StringBuilder("Words in line #" + number + ": ");
                while (m.find()) {
                    sb.append(m.group()).append(", ");
                }
                sb.setLength(sb.length() - 2);
                sb.append(";");
                pw.println(sb);
                number++;
            }
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
        }
    
        System.out.println("Well done. Look at Output file! :)");
    }
}
