package org.home.chapter07.partA;

import java.util.Arrays;

/**
 * Finds letters which contained in each word in text.
 */
public class Task16 {
    
    public static void main(String[] args) {
        String text = "Hello milord long split oil";
        
        String[] textArray = text.toLowerCase().split("[\\W]+");
//        Arrays.asList(textArray).forEach(System.out::println);
        
        int minLength = textArray[0].length();
        String minWord = textArray[0];
        
        for (String s : textArray) {
            if (s.length() < minLength) {
                minLength = s.length();
                minWord = s;
            }
        }

//        System.out.println("min word: " + minWord);
        
        StringBuilder sb = new StringBuilder("Letters which contained in each word in text: ");
        for (char c1 : minWord.toCharArray()) {
            boolean ok = true;
            for (String s : textArray) {
                if (!s.contains(String.valueOf(c1))) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                sb.append(c1).append(", ");
            }
        }
        
        
        if (sb.toString().equals("Letters which contained in each word in text: ")) {
            sb.delete(0, sb.length());
            sb.append("There are no letters which contained in each word in text.");
        } else {
            sb.setLength(sb.length() - 2);
            sb.append(".");
        }
        System.out.println(sb);
    }
}
