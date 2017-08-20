package org.home.chapter09.partA;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Finds words from words.txt file in each row in input.txt file
 * and prints out this words into output.txt file sorted by
 * number of that words in the row.
 */
public class Task06 {
    
    public static void main(String[] args) {
        String path = "src/main/java/org/home/chapter09/partA/";
        String regex = "\\b[йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХФВАПРОЛДЖЭЯЧСМИТБЮ]+\\b";
    
        List<String> words = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(path + "data/task06_words.txt"))) {
            while (sc.hasNext()) {
                words.add(sc.next().toLowerCase());
            }
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
        }
        
        try (Scanner sc = new Scanner(new File(path + "data/task06_input.txt"));
             PrintWriter pw = new PrintWriter(new File(path + "results/task06_output.txt"))) {
            while (sc.hasNextLine()) {
                Matcher matcher = Pattern.compile(regex).matcher(sc.nextLine());
                List<String> wordsList = new ArrayList<>();
                while (matcher.find()) {
                    wordsList.add(matcher.group());
                }
                Map<String, Integer> wordsMap = new HashMap<>();
                for (String w : words) {
                    for (String l : wordsList) {
                        if (w.equalsIgnoreCase(l)) {
                            if (wordsMap.containsKey(w)) {
                                wordsMap.put(w, wordsMap.get(w) + 1);
                            } else {
                                wordsMap.put(w, 1);
                            }
                        }
                    }
                }
                List<Map.Entry<String, Integer>> outputList = new ArrayList<>(wordsMap.entrySet());
                outputList.sort(((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
                for(Map.Entry e : outputList) {
                    pw.append(e.getKey().toString()).append(" = ").append(e.getValue().toString()).append("; ");
                }
                pw.append("\n");
            }
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
        }
    
        System.out.println("Successfully! Look at output file :)");
    }
}
