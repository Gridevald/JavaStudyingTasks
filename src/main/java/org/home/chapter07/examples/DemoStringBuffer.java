package org.home.chapter07.examples;

public class DemoStringBuffer {
    
    public static void main(String[] args) {
    
        StringBuffer sb = new StringBuffer();
        System.out.println("length -> " + sb.length());
        System.out.println("capacity -> " + sb.capacity());
        
        sb.append("Java");
        System.out.println("line -> " + sb);
        System.out.println("length -> " + sb.length());
        System.out.println("capacity -> " + sb.capacity());
        
        sb.append("Internationalization");
        System.out.println("line -> " + sb);
        System.out.println("length -> " + sb.length());
        System.out.println("capacity -> " + sb.capacity());
    
        System.out.println("reverse -> " + sb.reverse());
    }
}
