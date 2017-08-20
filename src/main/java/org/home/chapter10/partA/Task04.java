package org.home.chapter10.partA;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Prints all file's and directory's names from
 * current directory and subdirectories.
 */
public class Task04 {
    
    private List<File> list = new ArrayList<>();
    
    public static void main(String[] args) {
        
        String path = "src/main/java/org/home/chapter08";
        
        Task04 task = new Task04();
        task.doList(path);
        task.printFiles();
    }
    
    public void doList(String path) {
        File f = new File(path);
        if (f.isDirectory()) {
            list.add(f);
            File[] inner = f.listFiles();
            for (File fi : inner) {
                doList(fi.getPath());
            }
        } else {
            list.add(f);
        }
    }
    
    public void printFiles() {
        for (File fi : list) {
            if (fi.isDirectory()) {
                System.out.println(fi.getName() + "(dir)");
            } else {
                System.out.println(fi.getName() + "(file)");
            }
        }
    }
}
