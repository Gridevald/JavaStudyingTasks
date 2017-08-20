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
 * Finds longest number in each line
 */
public class Task05 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("src/main/java/org/home/chapter09/partA/data/task05_input.txt"));
             PrintWriter pw = new PrintWriter(new File("src/main/java/org/home/chapter09/partA/results/task05_output.txt"))) {
            int counter = 0;
            while (sc.hasNextLine()) {
                List<String> numbers = new ArrayList<>();
                Matcher matcher = Pattern.compile("[0-9]+").matcher(sc.nextLine());
                while (matcher.find()) {
                    numbers.add(matcher.group());
                }
                numbers.sort((o1, o2) -> o2.length()-o1.length());
                pw.print("Longest number in line #" + counter + " : ");
                pw.println(numbers.get(0));
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e);
        }
    
        System.out.println("Well done. Look at Output file! :)");
    }
}
