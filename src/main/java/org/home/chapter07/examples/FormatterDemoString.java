package org.home.chapter07.examples;

import java.util.Formatter;

public class FormatterDemoString {
    
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("This %s is about %n%S %c", "book", "java", '8');
        System.out.print(f);
    }
}
