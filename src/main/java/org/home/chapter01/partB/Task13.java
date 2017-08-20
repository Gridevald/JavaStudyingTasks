package org.home.chapter01.partB;

//
public class Task13 {
    
    public void go(int[] input) {
        
        System.out.print("Palindromes: ");
        for (int i : input) {
            if (this.isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    private boolean isPalindrome(int value) {
        if (value < 0) {
            return false;
        } else {
            if (value < 10) {
                return true;
            } else {
                return String.valueOf(value).equals(new StringBuilder(String.valueOf(value)).reverse().toString());
            }
        }
    }
}
