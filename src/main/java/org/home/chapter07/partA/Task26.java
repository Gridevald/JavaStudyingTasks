package org.home.chapter07.partA;

/**
 * Finds substring [m, n] in text 0...100000. I don't know other solution :(
 */
public class Task26 {
    
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i <= 100000; i++) {
            text.append(i);
        }
        
        int m = 555;
        int n = 600;
        
        String subStr = text.substring(m, n);
        System.out.println(subStr);
    }
}
