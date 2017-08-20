package org.home.chapter02.partA;

//Find numbers which contains only even numerals
//and numbers with equal number of even and odd numerals
public class Task05 {
    
    public void go(int[] input) {
        
        System.out.print("Numbers which contains only even numerals: ");
        for (int i : input) {
            if (this.even(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        System.out.print("Numbers with equal number of even and odd numerals: ");
        for (int i : input) {
            if (this.evenAndOdd(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    private boolean even(int input) {
        boolean out = true;
        while (input != 0) {
            int temp = input % 10;
            if (temp % 2 == 0 && temp != 0) {
                input /= 10;
            } else {
                out = false;
                break;
            }
        }
        return out;
    }
    
    private boolean evenAndOdd(int input) {
        boolean out = true;
        int even = 0;
        int odd = 0;
        while (input != 0) {
            int temp = input % 10;
            if (temp != 0) {
                if (temp % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            input /= 10;
        }
        if (even != odd) {
            out = false;
        }
        return out;
    }
}
