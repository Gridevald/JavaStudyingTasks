package org.home.chapter07.examples;

public class DemoIntern {
    
    public static void main(String[] args) {
        
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println("s1 == s2 : " + (s1 == s2));
        s2 = s2.intern(); //search s2 in String pool and return link to found string
        System.out.println("s1 == s2 : " + (s1 == s2));
    }
}
