package org.home.chapter07.partA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Finds shortest and longest words in text.
 */
public class Task14 {
    
    public static void main(String[] args) {
        String text = "Hello world! I bought new fountain pen. The quick brown fox jumps world over the lazy dog.";
        
        Pattern pattern = Pattern.compile("[\\w-]+");
        Matcher matcher = pattern.matcher(text);
        
        int min = 100; //strange moment!
        int max = 0;
        
        while (matcher.find()) {
            if (matcher.group().length() > max) {
                max = matcher.group().length();
            }
    
            if (matcher.group().length() < min) {
                min = matcher.group().length();
            }
        }
        
        matcher.reset();
        System.out.println("Shortest words (length " + min + "):");
        while (matcher.find()) {
            if (matcher.group().length() == min) {
                System.out.println(matcher.group());
            }
        }
    
        matcher.reset();
        System.out.println("Longest words (length " + max + "):");
        while (matcher.find()) {
            if (matcher.group().length() == max) {
                System.out.println(matcher.group());
            }
        }
    }
}
