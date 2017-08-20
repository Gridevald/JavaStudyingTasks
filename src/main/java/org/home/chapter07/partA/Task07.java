package org.home.chapter07.partA;

/**
 * Replace not-letters and not-spaces with space.
 */
public class Task07 {
    
    public static void main(String[] args) {
        String text = "Hello12 world! I boug$ht ne5w fou%nta$in pen. The qu@ick br,own fox. jump&s ov^er the la#zy dog.";
        String clean = text.replaceAll("[^a-zA-Z\\s]+", " ");
        System.out.println(clean);
    }
}
