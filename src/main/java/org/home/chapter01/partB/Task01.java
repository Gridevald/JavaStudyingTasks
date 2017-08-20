package org.home.chapter01.partB;

//Find even and odd numbers
public class Task01 {
    
    private String evenNum = "";
    private String oddNum = "";
    
    public void go(int[] input) {
        
        for (int i : input) {
            if (i != 0) {
                if (i % 2 != 0) {
                    oddNum += i + " ";
                } else {
                    evenNum += i + " ";
                }
            }
        }
        
        System.out.println("Even numbers: " + evenNum);
        System.out.println("Odd numbers: " + oddNum);
    }
}
