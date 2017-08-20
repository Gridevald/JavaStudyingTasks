package org.home.chapter07.examples;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {
    
    public static void main(String[] args) {
        String text = "   ololo  1243   df23e    df2r .";
        
        String[] strSplit = text.split("(?<!\\s)\\b");
    
        Arrays.asList(strSplit).forEach(System.out::println);
//        System.out.println(Arrays.toString(strSplit));
        
        String str1 = "man-woman";
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}");
        Matcher m = p.matcher(str1);
//        if (m.findFile()) {
//            System.out.println(m.group());
//        } else {
//            System.out.println("No matches");
//        }
    
        System.out.println(m.find() ? m.group() : "No matches");
        
        String regex = "(@[a-z]+@)?";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher("@first@@second@");
        
        while (m1.find()) {
            System.out.println(m1.group());
        }
//        System.out.println(m1.matches() ? m1.group() : "no");
        
        Pattern p2 = Pattern.compile("[a-z&&[ef]]+");
        Matcher m2 = p2.matcher("a b c d de e f cde");
        while (m2.find()) {
            System.out.println(m2.group());
        }
        
        String bigText = "Hello\nmy little\nfriend.";
        String[] bigTextSplit = bigText.split("\n");
        Arrays.asList(bigTextSplit).forEach(System.out::println);
    }
}
