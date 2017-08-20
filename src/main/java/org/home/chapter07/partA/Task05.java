package org.home.chapter07.partA;

/**
 * Replace end of word, if necessary
 */
public class Task05 {
    
    public static void main(String[] args) {
        String text = "The, quickooo brown... fox ooo jumps! over theooo? lazy dog";
        String[] textArray = text.split("(?<!^)\\b");
        
        String suffix = "ooo";
        String subStr = "aaa";
        
        StringBuilder sb = new StringBuilder();
        
        for (String str : textArray) {
            if (str.matches("\\w+") && str.length() >= suffix.length()) {
                int position = str.length()-suffix.length();
                if (str.substring(position).equals(suffix)) {
                    sb.append(str).append(subStr);
                } else {
                    sb.append(str);
                }
            } else {
                sb.append(str);
            }
        }
    
        System.out.println(sb);
    }
}
