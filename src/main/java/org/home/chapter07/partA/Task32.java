package org.home.chapter07.partA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculates number of {input} words in {text}.
 */
public class Task32 {
    
    public static void main(String[] args) {
        String text = "Hello, my friend, hello.";
        String input = "hello";
        int count = 0;
        
        String regex = new String("\\b" + input + "\\b");
        Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(text);
        while (matcher.find()) {
            count++;
        }
    
        System.out.println("The word \"" + input + "\" occurs in text " + count + " time(s).");
    }
}
