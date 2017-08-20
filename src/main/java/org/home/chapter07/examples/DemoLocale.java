package org.home.chapter07.examples;

import java.util.Locale;

public class DemoLocale {
    
    public static void main(String[] args) {
        Locale current = Locale.getDefault();
        System.out.println(current.getCountry());
        System.out.println(current.getDisplayCountry());
        System.out.println(current.getLanguage());
        System.out.println(current.getDisplayLanguage());
        
        current = new Locale("be", "BY");
        System.out.println(current.getCountry());
        System.out.println(current.getDisplayCountry());
        System.out.println(current.getLanguage());
        System.out.println(current.getDisplayLanguage());
    }
}
