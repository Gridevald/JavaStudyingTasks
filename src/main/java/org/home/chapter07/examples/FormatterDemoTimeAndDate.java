package org.home.chapter07.examples;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemoTimeAndDate {
    
    public static void main(String[] args) {
        Formatter f = new Formatter();
        Calendar c = Calendar.getInstance();
        
        f.format("%tr", c);
        System.out.println(f);
        
        f = new Formatter();
        f.format("%tc", c);
        System.out.println(f);
        
        f = new Formatter();
        f.format("%tl:%tM", c, c);
        System.out.println(f);
        
        f = new Formatter();
        f.format("%tB %tb %tm", c, c, c);
        System.out.println(f);
    }
}
