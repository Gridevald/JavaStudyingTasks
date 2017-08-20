package org.home.chapter02.partC;

import static org.home.chapter02.partC.C02PCMain.print;

//Turn matrix counter clock-wise
public class Task07 {
    
    public void go(double[][] input) {
        
        double[][] inner = new double[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            System.arraycopy(input[i], 0, inner[i], 0, input.length);
        }
    
        System.out.println("Matrix turned on 90 degrease counter clock-wise:");
        this.turn(inner);
        print(inner);
        System.out.println("Matrix turned on 180 degrease counter clock-wise:");
        this.turn(inner);
        print(inner);
        System.out.println("Matrix turned on 270 degrease counter clock-wise:");
        this.turn(inner);
        print(inner);
        
    }
    
    private void turn(double[][] input) {
        
        double[][] temp = new double[input.length][input.length];
        
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j ++) {
                temp[temp.length - 1 - j][i] = input[i][j];
            }
        }
        
        for (int i = 0; i < temp.length; i++) {
            System.arraycopy(temp[i], 0, input[i], 0, temp.length);
        }
    }
}
