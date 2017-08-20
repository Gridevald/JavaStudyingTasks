package org.home.chapter07.examples;

public class SortArray {
    
    public static void main(String[] args) {
    
        String names = "  Alena  Alice    alina albina   Anastasya  ALLA Arina     ";
        names = names.trim();
        String[] a = names.split(" ");
        
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = j + 1; i < a.length; i++) {
                if (a[i].compareToIgnoreCase(a[j]) < 0) {
                    String temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        
        for (String arg : a) {
            if (!arg.isEmpty()) {
                System.out.print(arg + " ");
            }
        }
    }
}
