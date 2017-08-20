package org.home.chapter01.partB;

//Find numbers which divides by 5 and 7
public class Task04 {
    
    private String numbers = "";
    
    public void go(int[] input) {
        
        for (int i : input) {
            if (i != 0) {
                if ((i%5 == 0) && (i%7==0)) {
                    numbers += i + " ";
                }
            }
        }
        
        System.out.println("Numbers which divides by 5 and 7: " + numbers);
        
    }
}
