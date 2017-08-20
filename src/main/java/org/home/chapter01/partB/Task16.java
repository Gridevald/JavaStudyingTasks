package org.home.chapter01.partB;

//Pascal's triangle
public class Task16 {
    
    public void go(int[] input) {
        
        int level = 0;
        
        for (int i : input) {
            if (i > 0) {
                level = i;
                break;
            }
        }
        
        if (level > 0) {
            this.doTriangle(level);
        } else {
            System.out.println("Pascal's triangle: There is no positive integers.");
        }
    }
    
    private void doTriangle(int level) {
        
        int[][] triangle = new int[level][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i+1];
        }
        
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if ((i - 1 < 0) || (j - 1 < 0) || (j > triangle[i - 1].length - 1)) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
                }
            }
        }
    
        System.out.println("Pascal's triangle:");
        for (int[] i : triangle) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
