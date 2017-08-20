package org.home.chapter02.partA;

//Find first or second palindrome
public class Task08 {
    
    public void go(int[] input) {
        int first = 0;
        int second = 0;
        for (int i : input) {
            if (this.isPalindrome(i)) {
                if (first == 0) {
                    first = i;
                } else {
                    second = i;
                    break;
                }
            }
        }
        if (second != 0) {
            System.out.print("Palindrome second: " + second);
        } else {
            if (first != 0) {
                System.out.print("Palindrome first: " + first);
            } else {
                System.out.println("Palindrome: no palindromes");
            }
        }
    }
    
    private boolean isPalindrome(int input) {
        if (input < 0) {
            return false;
        } else {
            if (input < 10) {
                return true;
            } else {
                return String.valueOf(input).equals(new StringBuilder(String.valueOf(input)).reverse().toString());
            }
        }
    }
}
