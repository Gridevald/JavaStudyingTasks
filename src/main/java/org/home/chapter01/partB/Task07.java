package org.home.chapter01.partB;

//Find GCD and LCM of input numbers
public class Task07 {
    
    public void go(int[] input) {
        
        //Calculate GCD of input array
        int firstArg = input[0];
        int secondArg;
        if (input.length > 1) {
            for (int i = 1; i < input.length; i++) {
                secondArg = input[i];
                firstArg = this.gcd(Math.abs(firstArg), Math.abs(secondArg));
            }
            
            
            //Calculate LCM of input array
            int lcm;
            if (firstArg != 0) {
                int gcd = this.gcd(Math.abs(input[0]), Math.abs(input[1]));
                lcm = (Math.abs(input[0] * input[1])) / gcd;
                for (int i = 2; i < input.length; i++) {
                    gcd = this.gcd(Math.abs(lcm), Math.abs(input[i]));
                    lcm = (Math.abs(lcm * input[i])) / gcd;
                }
            } else {
                lcm = 0;
            }
            
            System.out.println("Greatest Common Divisor: " + firstArg);
            System.out.println("Least Common Multiple: " + lcm);
        } else {
            System.out.println("GCD and LCM can't be calculated for less then 2 numbers");
        }
    }
    
    //Greatest common divisor
    private int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            a = 0;
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
        }
        return a;
    }
}
