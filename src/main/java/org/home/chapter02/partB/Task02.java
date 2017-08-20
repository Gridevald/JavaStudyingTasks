package org.home.chapter02.partB;

//Fill array N x N by numbers from 1 to k
public class Task02 {
    
    public static void main(String[] args) {
        
        int k = 25;
        int n;
        double s = Math.sqrt(k);
        if (s % 1 == 0) {
            n = (int) s;
        } else {
            n = (int) s + 1;
        }
        
        int temp = 1;
        
        OUT:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(temp + "\t");
                temp++;
                if (temp > k) {
                    break OUT;
                }
            }
            System.out.println();
        }
    }
}
