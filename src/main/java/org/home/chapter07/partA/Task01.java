package org.home.chapter07.partA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Change (k) letter in each word of the text with current letter (s).
 */
public class Task01 {
    
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        Task01 o = new Task01();
        System.out.println(o.change(text, 3, "Y"));
    }
    
    public String change(String text, int k, String s) {
        StringBuilder output = new StringBuilder();
        String[] textArray;
        Pattern p1 = Pattern.compile("\\p{Blank}");
        textArray = p1.split(text);
        Pattern p2 = Pattern.compile("\\w");
        
        for (String string : textArray) {
            if (string.length() - 1 >= k) {
                Matcher m = p2.matcher(string.substring(k, k + 1));
                if (m.matches()) {
                    output.append(string.substring(0, k)).append(s).append(string.substring(k + 1, string.length())).append(" ");
                } else {
                    output.append(string).append(" ");
                }
            } else {
                output.append(string).append(" ");
            }
        }
        return output.toString();
    }
}
