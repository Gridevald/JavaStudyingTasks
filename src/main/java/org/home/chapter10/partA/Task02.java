package org.home.chapter10.partA;

import java.util.Scanner;
import java.util.Stack;

/**
 * Fills Stack with entered number and prints this number reversed.
 */
public class Task02 {
    
    public static void main(String[] args) {
        
        String number = null;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            number = sc.nextLine();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        
        Stack<Integer> numbers = new Stack<>();
        
        if (number != null) {
            for (int i = 0; i < number.length(); i++) {
                try {
                    numbers.push(new Integer(number.substring(i, i + 1)));
                } catch (Exception e) {
                    throw new NumberFormatException("Bad cast!");
                }
            }
        }
        System.out.print("Reversed number: ");
        while (!numbers.isEmpty()) {
            System.out.print(numbers.pop());
        }
    }
}
