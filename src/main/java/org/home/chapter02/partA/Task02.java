package org.home.chapter02.partA;

import static org.home.chapter02.partA.C02PAMain.length;

//Sort array by number length
public class Task02 {
    
    public void go(int[] input) {
        
        int[] inner = new int[input.length];
        System.arraycopy(input, 0, inner, 0, input.length);
        
        for (int i = 0; i < inner.length - 1; i++) {
            for (int j = 0; j < inner.length - 1; j++) {
                if (length(inner[j]) < length(inner[j + 1])) {
                    int temp = inner[j];
                    inner[j] = inner[j + 1];
                    inner[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Numbers sorted by number length: ");
        for (int i : inner) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
