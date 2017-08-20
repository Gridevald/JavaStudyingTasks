package org.home.chapter07.partA;

/**
 * Delete or insert Character in text by boolean flag
 */
public class Task06 {
    
    public static void main(String[] args) {
        String text = "Hello world!\nI bought new fountain pen.\nThe quick brown fox jumps over the lazy dog\n";
        
        new Task06().go(text, true, 'o', 8);
        System.out.println();
        new Task06().go(text, false, 'O', 8);
    }
    
    public void go(String text, boolean action, char s, int k) { //action true - delete, false - insert
        if (action) {
            delete(text, s);
        } else {
            insert(text, s, k);
        }
    }
    
    private void delete(String text, char s) {
        System.out.println(text.replace(String.valueOf(s), ""));
    }
    
    private void insert(String text, char s, int k) {
        String[] textArray = text.split("\\n");
        StringBuilder sb = new StringBuilder();
        for (String str : textArray) {
            if (validate(str, k)) {
                sb.append(str.substring(0, k)).append(s).append(str.substring(k, str.length())).append("\n");
            } else {
                sb.append(str).append("\n");
            }
        }
        System.out.println(sb);
    }
    
    private static boolean validate(String input, int k) {
        return k >= 0 && input.length() > k;
    }
}
