package org.home.chapter07.partA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task19 {
    
    public static void main(String[] args) {
        String text = "I don't like ... jump over the lazy-dog";
        
        StringBuilder sb = new StringBuilder();
        String[] words = text.split("\\s");
        
        for (String s : words) {
            Matcher matcher = Pattern.compile("\\p{Alpha}+\\p{Punct}*").matcher(s);
            if (matcher.matches()) {
                sb.append(matcher.group().substring(0, 1).toUpperCase()).append(matcher.group().substring(1)).append(" ");
            } else {
                sb.append(s).append(" ");
            }
        }
    
        System.out.println("Source text is:\n" + text);
        System.out.println("Fixed text is:\n" + sb);
    }
}
