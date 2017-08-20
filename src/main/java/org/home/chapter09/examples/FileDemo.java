package org.home.chapter09.examples;

import java.io.File;

/**
 * HashCode of File objects are CONSTANT! WHY?
 */
public class FileDemo {
    
    public static void main(String[] args) {
        File f = new File("src/main/java/org/home/chapter09/examples/data");
        if (f.exists() || f.isDirectory()) {
            File[] files = f.listFiles();
            for (File temp : files) {
                if (!temp.isDirectory()) {
                    System.out.println(temp.getName() + " HASH: " + temp.hashCode());
                }
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
