package org.home.chapter07.partA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculates number of vowel and consonant letters
 */
public class Task11 {
    
    public static void main(String[] args) {
        String text = "Hello world! I bought new fountain pen. The quick brown fox jumps world over the lazy dog.";
        String text1 = "ooooold";
        
        Pattern p1 = Pattern.compile("[aeiouAEIOU]");
        Pattern p2 = Pattern.compile("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]");
    
        Matcher m1 = p1.matcher(text);
        Matcher m2 = p2.matcher(text);
        
        int i1 = 0;
        int i2 = 0;
        
        while (m1.find()) {
            i1++;
        }
        while (m2.find()) {
            i2++;
        }
    
//        System.out.println(i1 + " " + i2);
        System.out.print("There are more ");
        System.out.println(i1 > i2 ? "vowel letters" : "consonant letters");
    }
}
