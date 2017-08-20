package org.home.chapter02.partA;

import java.util.Scanner;

public class C02PAMain {
    
    public static void main(String[] args) {
    
        System.out.print("Enter integer numbers divided by space: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String[] strings = input.split(" ");
        int[] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.valueOf(strings[i]);
        }
        
        //Longest and shortest numbers
        new Task01().go(numbers);
        
        //Sorted by number length
        new Task02().go(numbers);
        
        //Number longer then average
        new Task03().go(numbers);
        
        //Number with minimum different numerals
        new Task04().go(numbers);
    
        //Numbers which contains only even numerals
        //and numbers with equal number of even and odd numerals
        new Task05().go(numbers);
        
        //Ordered numerals
        new Task06().go(numbers);
        
        //Unique numerals
        new Task07().go(numbers);
        
        //Palindrome
        new Task08().go(numbers);
    }
    
    //Used for tasks: 01, 02, 03
    public static int length(int input) {
        int length = 0;
        if (input != 0) {
            while (input != 0) {
                length++;
                input /= 10;
            }
        } else {
            length = 1;
        }
        return length;
    }
}
