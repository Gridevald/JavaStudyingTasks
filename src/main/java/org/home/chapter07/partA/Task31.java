package org.home.chapter07.partA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculates number of words started with cursive letter.
 */
public class Task31 {
    
    public static void main(String[] args) {
        String text = "The quick brown Fox jumps over the lazy Dog.";
        int count = 0;
        
        Matcher matcher = Pattern.compile("\\b\\p{Upper}\\w+\\b").matcher(text);
        while (matcher.find()) {
            count++;
        }
    
        System.out.println("Number of words started with cursive letter: " + count + ".");
    }
}
