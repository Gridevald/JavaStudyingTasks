package org.home.chapter02.partB;

//Intervals
public class Task01 {
    
    public static void main(String[] args) {
        
        int k = 13;
        int n = 10;
        int m = 25;
        
        if (k > n && k < m) {
            System.out.println(k + " lies in interval (" + n + ", " + m + ").");
        }
        if (k > n && k <= m) {
            System.out.println(k + " lies in interval (" + n + ", " + m + "].");
        }
        if (k >= n && k < m) {
            System.out.println(k + " lies in interval [" + n + ", " + m + ").");
        }
        if (k >= n && k <= m) {
            System.out.println(k + " lies in interval [" + n + ", " + m + "].");
        }
        if (k < n || k > m) {
            System.out.println(k + " don't lies in any interval");
        }
    }
}

