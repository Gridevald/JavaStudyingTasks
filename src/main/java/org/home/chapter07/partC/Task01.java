package org.home.chapter07.partC;

/**
 * Code some text by rules described in comments below.
 */
public class Task01 {
    
    public static void main(String[] args) {
        Task01 task = new Task01();
        String input = "Hello my friend!";
//        String input = "The quick brown fox jumps over the lazy dog! Paul";
//        System.out.println(task.validate(input));
        task.go(input);
    }
    
    public void go(String str) {
        if (validate(str)) {
            System.out.println(code(str));
        } else {
            System.out.println("Wrong input. Length is " + str.length());
        }
    }
    
    private String code(String str) {
        //write string in the array NxX
        int n = (int) Math.sqrt(str.length());
        char[][] charArray = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                charArray[i][j] = str.charAt(n * i + j);
            }
        }
        //Rotate array 90 deg. clockwise
        char[][] temp = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][n - 1 - i] = charArray[i][j];
            }
        }
        charArray = temp;
        //switch rows: first-last, 2nd-pre-last...
        int l = n / 2;
        for (int i = 0; i < l; i++) {
            char[] copy = charArray[i];
            charArray[i] = charArray[n - 1 - i];
            charArray[n - 1 - i] = copy;
        }
        //switch columns: 1st-2nd, 3rd-4th...
        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                char copy = charArray[j][i];
                charArray[j][i] = charArray[j][i + 1];
                charArray[j][i + 1] = copy;
            }
        }

        //print by spiral, starting at [0][0]
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int finish = n; finish > 0; finish--, start++) {
            for (int i = start; i < finish; i++) {
                sb.append(charArray[start][i]);
            }
            for (int i = start + 1; i < finish; i++) {
                sb.append(charArray[i][finish - 1]);
            }
            for (int i = finish - 2; i > start - 1; i--) {
                sb.append(charArray[finish - 1][i]);
            }
            for (int i = finish - 2; i > start; i--) {
                sb.append(charArray[i][start]);
            }
        }
        return sb.toString();
    }
    
    private boolean validate(String str) {
        return Math.sqrt(str.length()) % 1 == 0;
    }
}
