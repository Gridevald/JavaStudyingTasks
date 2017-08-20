package org.home.chapter09.partA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Finds word-couples in input file, where last letter in first word equals to first letter in second word.
 * (Ignoring case)
 */
public class Task04 {
    
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        
        // finding words in input file
        try (Scanner sc = new Scanner(new File("src/main/java/org/home/chapter09/partA/data/task04_input.txt"))) {
            while (sc.hasNext()) {
                String temp = sc.next();
                Matcher matcher = Pattern.compile("\\b\\w+['-]?\\w+\\b").matcher(temp);
                if (matcher.find()) {
                    words.add(matcher.group());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e);
        }
        
        // finding out if last letter of the word equals to first letter of the next word
        try (PrintWriter pw = new PrintWriter(new File("src/main/java/org/home/chapter09/partA/results/task04_output.txt"))) {
            for (int i = 0; i < words.size() - 1; i++) {
                if (words.get(i).toLowerCase().charAt(words.get(i).length() - 1) == words.get(i + 1).toLowerCase().charAt(0)) {
                    pw.append(words.get(i)).append(" ").append(words.get(i + 1)).append("\n");
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e);
        }
    
        System.out.println("Well done. Look at Output file! :)");
    }
}
