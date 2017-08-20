package org.home.chapter09.partA;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Finds and calculates different letters and words in Pushkin's poem.
 */
public class Task08 {
    
    public static void main(String[] args) {
        String path = "src/main/java/org/home/chapter09/partA/";
        String letter = "йцукенгшщзхъфывапролджэячсмитьбю";
        String regexLetter = "[" + letter + "]";
        String regexWord = "\\b[" + letter + "]+[-]?[" + letter + "]*\\b";
    
        Map<String, Integer> mapLetters = new HashMap<>();
        Map<String, Integer> mapWords = new HashMap<>();
        
        try (Scanner sc = new Scanner(new File(path + "data/task08_input.txt"))) {
            while (sc.hasNext()) {
                String scWord = sc.next().toLowerCase();
                
                // Finds words in poem
                Matcher m1 = Pattern.compile(regexWord).matcher(scWord);
                if (m1.find()) {
                    if (mapWords.containsKey(m1.group())) {
                        mapWords.put(m1.group(), mapWords.get(m1.group()) + 1);
                    } else {
                        mapWords.put(m1.group(), 1);
                    }
                }
                
                // Finds letters in poem
                Matcher m2 = Pattern.compile(regexLetter).matcher(scWord);
                while (m2.find()) {
                    if (mapLetters.containsKey(m2.group())) {
                        mapLetters.put(m2.group(), mapLetters.get(m2.group()) + 1);
                    } else {
                        mapLetters.put(m2.group(), 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
        }
        
        // Sorts data by value descent
        List<Map.Entry<String, Integer>> listLetter = new LinkedList<>(mapLetters.entrySet());
        listLetter.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        List<Map.Entry<String, Integer>> listWords = new LinkedList<>(mapWords.entrySet());
        listWords.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        
        // Writes data into output file
        try (PrintWriter pw = new PrintWriter(new File(path + "results/task08_output.txt"))) {
            pw.println("Letters in poem:");
            for (Map.Entry entry : listLetter) {
                pw.println(entry.getKey() + " - " + entry.getValue());
            }
            pw.println("Words in poem:");
            for (Map.Entry entry : listWords) {
                pw.println(entry.getKey() + " - " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
        }
    
        System.out.println("Great work, man! Check output file :)");
    }
}
