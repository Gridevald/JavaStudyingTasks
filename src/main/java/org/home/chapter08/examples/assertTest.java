package org.home.chapter08.examples;

public class assertTest {
    
    public static void main(String[] args) {
        
        int age = (int) (Math.random() * 20 - 10);
        System.out.println(age);
        assert age >= 0 : "Negative age!";
    }
}
