package org.home.chapter09.partC.task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Fills file with random numbers and sorts numbers in this file.
 */
public class Task01 {
    
    public static void main(String[] args) {
        String path = "src/main/java/org/home/chapter09/partC/task01/files";
        Task01 obj = new Task01();
        obj.doNewFile(path, 50, 50000);
        obj.doSortFile(path);
    }
    
    private void doNewFile(String path, int amount, int bound) {
        File dir = new File(path);
        boolean ok;
        if (!dir.exists()) {
            ok = dir.mkdir();
        } else {
            ok = true;
        }
        if (ok) {
            try (PrintWriter pw = new PrintWriter(new File(path, "task01.txt"))) {
                System.out.println("New file created (" + path + "/task01.txt).");
                Random random = new Random();
                for (int i = 0; i < amount; i++) {
                    pw.println(random.nextInt(bound));
                }
                System.out.println("File filled with " + amount + " random numbers in bounds [0; " + bound + "].");
            } catch (FileNotFoundException e) {
                System.err.println("ERROR: " + e);
                e.printStackTrace();
            }
        } else {
            System.err.println("Can't make directory!");
        }
    }
    
    private void doSortFile(String path) {
        List<Integer> numbers = new LinkedList<>();
        try (Scanner sc = new Scanner(new File(path, "task01.txt"))) {
            while (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e);
        }
        System.out.println("File are found.");
        numbers.sort(Integer::compareTo);
        System.out.println("Numbers are sorted.");
        try (PrintWriter pw = new PrintWriter(new File(path, "task01.txt"))) {
            numbers.forEach(pw::println);
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e);
        }
        System.out.println("File filled with sorted numbers");
    }
}
