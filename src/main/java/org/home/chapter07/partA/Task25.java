package org.home.chapter07.partA;

/**
 * Replaces excess spaces.
 */
public class Task25 {
    
    public static void main(String[] args) {
        String text = "Hello    world!  It is my. . . new program.";
        
        String s1 = text.replaceAll("\\s+", " ");
        String s2 = s1.replaceAll("(?<=\\p{Punct})\\s+(?=\\p{Punct})", "");
        
        System.out.println(s2);
    }
}
