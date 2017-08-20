package org.home.chapter01.partB;

//Array sorted descent by number's abs
public class Task05 {
    
    public void go(int[] input) {
        
        int[] inner = new int[input.length];
        System.arraycopy(input,0, inner,0, input.length);
        
        for (int i = 0; i < inner.length - 1; i++) {
            for (int j = 0; j < inner.length - 1; j++) {
                if (Math.abs(inner[j]) < Math.abs(inner[j + 1])) {
                    int temp = inner[j];
                    inner[j] = inner[j + 1];
                    inner[j + 1] = temp;
                }
            }
        }
    
        System.out.print("Sorted by abs descent: ");
        for(int i : inner) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
