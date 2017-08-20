package org.home.chapter02.partA;

//Find numbers with ascent ordered numerals
public class Task06 {
    
    public void go(int[] input) {
    
        System.out.print("Numbers with numerals in ascent order: ");
        for (int i : input) {
            if (this.order(Math.abs(i))) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    private boolean order(int input) {
        boolean out = true;
        while (input != 0) {
            int last = input % 10;
            int prelast = (input / 10) % 10;
            if (last >= prelast) {
                input /= 10;
            } else {
                out = false;
                break;
            }
        }
        return out;
    }
}
