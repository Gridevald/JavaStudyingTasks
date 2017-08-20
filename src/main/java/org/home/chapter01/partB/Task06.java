package org.home.chapter01.partB;

//Find unique 3-digit numbers
public class Task06 {
    
    private String numbers = "";
    
    public void go(int[] input) {
        
        for (int i : input) {
            if ((i > 101 && i < 988) || (i > -988 && i < -101)) {
                int a = i % 10;
                int temp = (i - a) / 10;
                int b = temp % 10;
                temp = (temp - b) / 10;
                int c = temp % 10;
                if (a != b && b != c && a != c) {
                    numbers += i + " ";
                }
            }
        }
        
        System.out.println("Unique 3-digit numbers: " + numbers);
    }
}
