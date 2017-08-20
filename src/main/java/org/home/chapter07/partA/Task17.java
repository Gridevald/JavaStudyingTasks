package org.home.chapter07.partA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Finds first max non-word sequence in te text.
 */
public class Task17 {
    
    public static void main(String[] args) {
        String text = "kjbu!##1jnkj3!@# jfnufn  fdfw42rf%$#!sdf";
    
        Pattern pattern = Pattern.compile("[\\W]+");
        Matcher matcher = pattern.matcher(text);
        
        int maxLength = 0;
        String str = null;
        
        while (matcher.find()) {
            if (matcher.group().length() > maxLength) {
                maxLength = matcher.group().length();
                str = matcher.group();
            }
        }
    
        System.out.println("First max non-word sequence is: " + str);
    }
}
