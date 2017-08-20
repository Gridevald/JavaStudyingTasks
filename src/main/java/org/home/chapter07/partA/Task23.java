package org.home.chapter07.partA;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Finds first word which contained in text odd times.
 */
public class Task23 {
    
    public static void main(String[] args) {
        String text = "Hello World, hello world. New fountain pen, new pen.";
    
        Map<String, Integer> words= new HashMap<>();
    
        Matcher matcher = Pattern.compile("[\\w]+").matcher(text.toLowerCase());
        
        while (matcher.find()) {
            words.merge(matcher.group(), 1, Integer::sum);
//            words.merge(matcher.group(), 1, (v1, v2) -> Integer.sum(v1, v2));
        }
        System.out.print("Word which contained in text odd times: ");
        Set<String> wordsSet = new HashSet<>(words.keySet());
        for (String s : wordsSet) {
            if (words.get(s) % 2 != 0) {
                System.out.println(s);
                break;
            }
        }
    }
}
