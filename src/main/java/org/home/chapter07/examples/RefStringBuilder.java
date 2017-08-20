package org.home.chapter07.examples;

public class RefStringBuilder {
    
    public static void main(String[] args) {
    
        StringBuilder sb = new StringBuilder("Oracle");
        System.out.println(sb);
        changeStr(sb);
        System.out.println(sb);
    }
    
    public static void changeStr(StringBuilder s) {
        s.append(" Certified");
    }
}
