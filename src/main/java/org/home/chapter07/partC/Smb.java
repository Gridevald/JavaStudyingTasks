package org.home.chapter07.partC;

public class Smb {
    
    public static void main(String[] args) {
//        int[][] array = {{1}};
//        int[][] array = {{1, 2}, {4, 3}};
//        int[][] array = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
//        int[][] array = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        int[][] array = {{1, 2, 3, 4, 5}, {16, 17, 18, 19, 6}, {15, 24, 25, 20, 7}, {14, 23, 22, 21, 8}, {13, 12, 11, 10, 9}};
        int n = array.length;
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int finish = n - 1; finish > 0; finish--, start++) {
            for (int i = start; i <= finish; i++) {
                sb.append(array[start][i]).append(" ");
            }
            for (int i = start + 1; i <= finish; i++) {
                sb.append(array[i][finish]).append(" ");
            }
            for (int i = finish - 1; i > start - 1; i--) {
                sb.append(array[finish][i]). append(" ");
            }
            for (int i = finish - 1; i > start; i--) {
                sb.append(array[i][start]). append(" ");
            }
        }
        System.out.println(sb);
    }
}
