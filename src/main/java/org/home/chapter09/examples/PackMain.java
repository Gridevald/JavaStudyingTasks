package org.home.chapter09.examples;

import java.io.FileNotFoundException;

public class PackMain {
    
    public static void main(String[] args) {
        String path = "src/main/java/org/home/chapter09/examples/data";
        String jarName = "src/main/java/org/home/chapter09/examples/data/out.jar";
        PackJar pj = new PackJar(jarName);
        try {
            pj.pack(path);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e);
        }
        
        String destinationPath = "src/main/java/org/home/chapter09/examples/unpack";
        new UnpackJar().unpack(destinationPath, jarName);
    }
}
