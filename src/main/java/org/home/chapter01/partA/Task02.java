package org.home.chapter01.partA;

public class Task02 {
    
    public static void main(String[] args) {
        
        for(int i = 1; i <= args.length; i++) {
            System.out.print(args[args.length-i] + " ");
        }
        
    }
}
