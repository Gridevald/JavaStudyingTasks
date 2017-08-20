package org.home.chapter07.partA;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Sorts words in alphabetic order.
 */
public class Task30 {
    
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        List<String> words = new ArrayList<>();
        
        Matcher matcher = Pattern.compile("\\b\\w+\\b", Pattern.CASE_INSENSITIVE).matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
    
        words.sort(String::compareToIgnoreCase);
        words.forEach(System.out::println);
    }
}
