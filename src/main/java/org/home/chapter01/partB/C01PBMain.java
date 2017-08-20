package org.home.chapter01.partB;

import java.util.Scanner;

public class C01PBMain {
    
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
        
        //Even and Odd numbers
        new Task01().go(numbers);

        //Minimum and maximum numbers
        new Task02().go(numbers);

        //Numbers divides by 3 or 9
        new Task03().go(numbers);

        //Numbers divides by 5 and 7
        new Task04().go(numbers);

        //Numbers sorted by abs descent
        new Task05().go(numbers);

        //Unique 3-digit numbers
        new Task06().go(numbers);

        //gcd and lcm of numbers
        new Task07().go(numbers);

        //Simple numbers
        new Task08().go(numbers);

        //Sorted numbers
        new Task09().go(numbers);

        //Numbers sorted by frequency
        new Task10().go(numbers);

        //Palindromes
        new Task13().go(numbers);

        //Half sum of neighbors
        new Task14().go(numbers);

        //fraction
        new Task15().go(numbers);
        
        //Pascal's triangle
        new Task16().go(numbers);
    }
}
