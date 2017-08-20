package org.home.chapter07.partA;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculate number of every different word
 */
public class Task09 {
    
    public static void main(String[] args) {
        String text = "Hello (world! I) bought #new# dog fountain (pen.\n * Hello The quick) brown* fox jumps world #over the# lazy dog.";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text.toLowerCase());
    
        Map<String, Integer> words = new HashMap<>();
        
        while (matcher.find()) {
            if (words.containsKey(matcher.group())) {
                words.put(matcher.group(), (words.get(matcher.group()) + 1));
            } else {
                words.put(matcher.group(), 1);
            }
        }
        
        words.entrySet().forEach(System.out::println);
    }
}
