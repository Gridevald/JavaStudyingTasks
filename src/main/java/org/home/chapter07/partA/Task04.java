package org.home.chapter07.partA;

/**
 * Insert substring after k character
 */
public class Task04 {
    
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String subStr = "YPI";
        int k = 10;
        
        Task04 t = new Task04();
        System.out.println(t.insert(text, subStr, k));
    }
    
    private boolean validate(int k, String text) {
        return k >= 0 && k < text.length();
    }
    
    private String insert(String text, String subStr, int k) {
        StringBuilder sb = new StringBuilder();
        if (validate(k, text)) {
            sb.append(text.substring(0, k + 1));
            sb.append(subStr);
            sb.append(text.substring(k + 1));
        } else {
            sb.append("Wrong k");
        }
        return sb.toString();
    }
}
