package org.home.chapter09.partC.task04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Reads *.java file, makes word 3+ symbols UpperCase and
 * writes all the text in output *.txt file
 */
public class Task04 {
    
    private final String outPath = "src/main/java/org/home/chapter09/partC/task04/res";
    private final String fileName = "outFile.txt";
    
    public static void main(String[] args) {
        
        String path = "src/main/java/org/home/chapter09/partC/task01/task01.java";
        new Task04().changeToUpper(path);
    }
    
    private void changeToUpper(String path) {
        File dir = new File(outPath);
        boolean ok;
        if (!dir.exists()) {
            ok = dir.mkdir();
        } else {
            ok = true;
        }
        if (ok) {
            try (Scanner sc = new Scanner(new File(path));
                 PrintWriter pw = new PrintWriter(new File(outPath, fileName))) {
                while (sc.hasNextLine()) {
                    StringBuilder sb = new StringBuilder(sc.nextLine());
                    Matcher matcher = Pattern.compile("\\b[\\w'\\-]{4,}\\b").matcher(sb); // not perfect regex
                    while (matcher.find()) {
                        String tStr = sb.toString().replace(matcher.group(), matcher.group().toUpperCase());
                        sb.replace(0, sb.length(), tStr);
                    }
                    pw.println(sb);
                }
                System.out.println("It's OK. Check output file ;)");
            } catch (FileNotFoundException e) {
                System.err.println("ERROR: " + e);
            }
        } else {
            System.err.println("Can't make directory!");
        }
    }
}
