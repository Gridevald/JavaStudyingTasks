package org.home.chapter09.partA;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Makes all words in Shakespear's Sonnet capitalized.
 */
public class Task07 {
    
    public static void main(String[] args) {
        String path = "src/main/java/org/home/chapter09/partA/";
        
        try(Scanner sc = new Scanner(new File(path + "data/task07_input.txt"));
            PrintWriter pw = new PrintWriter(new File(path + "results/task07_output.txt"))) {
            StringBuilder sbOut = new StringBuilder();
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split("\\s");
                StringBuilder sb = new StringBuilder();
                for (String s : line) {
                    Matcher m1 = Pattern.compile("\\p{Punct}*").matcher(s);
                    Matcher m2 = Pattern.compile("\\w+[-']?\\w*\\p{Punct}*").matcher(s);
                    String temp = "";
                    if (m1.find()) {
                        temp += m1.group();
                    }
                    if (m2.find()) {
                        temp += m2.group().substring(0, 1).toUpperCase();
                        temp += m2.group().substring(1);
                    }
                    sb.append(temp).append(" ");
                }
                sb.setLength(sb.length() - 1);
                sbOut.append(sb).append("\n");
            }
            sbOut.setLength(sbOut.length() - 1);
            pw.append(sbOut);
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
        }
    
        System.out.println("Successfully! Look at output file :)");
    }
}
