package org.home.chapter07.examples;

public class RefString {
    
    public static void main(String[] args) {
    
        String str = new String("Java");
        changeStr(str);
        System.out.println("Old str : " + str);
    }
    
    public static void changeStr(String s) {
        s = s.concat(" Certified");
        System.out.println("New str : " + s);
    }
}
