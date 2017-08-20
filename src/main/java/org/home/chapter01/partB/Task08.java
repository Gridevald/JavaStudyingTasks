package org.home.chapter01.partB;

//Find simple numbers
public class Task08 {
    
    public void go(int[] input) {
        
        String simple = "";
        
        for (int i : input) {
            if (i > 1) {
                int length = (int) Math.sqrt(i) + 1;
                boolean isSimple = true;
                int j = 2;
                while (isSimple && j <= length) {
                    if (i % j == 0) {
                        isSimple = false;
                    }
                    j++;
                }
                if (isSimple) {
                    simple += i + " ";
                }
            }
        }
        
        System.out.println("Simple numbers: " + simple);
    }
}
