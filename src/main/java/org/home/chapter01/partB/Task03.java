package org.home.chapter01.partB;

//Find numbers which divides by 3 or 9
public class Task03 {
    
    private String numbers = "";
    
    public void go(int[] input) {
        
        for (int i : input) {
            if (i != 0) {
                if ((i % 3 == 0) || (i % 9 == 0)) {
                    numbers += i + " ";
                }
            }
        }
        
        System.out.println("Numbers which divides by 3 or 9: " + numbers);
    }
}
