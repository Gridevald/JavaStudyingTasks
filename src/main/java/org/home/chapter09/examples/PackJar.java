package org.home.chapter09.examples;

import java.io.*;
import java.util.ArrayList;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.Deflater;

public class PackJar {

    private String jarFileName;
    
    public final int BUFFER = 2_048;
    
    public PackJar(String jarFileName) {
        this.jarFileName = jarFileName;
    }
    
    public void pack(String dirName) throws FileNotFoundException {
        // getting list of names of files in directory
        File dir = new File(dirName);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new FileNotFoundException(dir + " not found");
        }
        File[] files = dir.listFiles(); // array of files in directory
        ArrayList<String> listFilesToJar = new ArrayList<>();
        for (int i = 0; i < files.length; i++) { //getting names
            if (!files[i].isDirectory()) {
                listFilesToJar.add(files[i].getPath());
            }
        }
        String[] temp = {};
        String[] filesToJar = listFilesToJar.toArray(temp);
        // making archive
        try (FileOutputStream fos = new FileOutputStream(jarFileName);
             JarOutputStream jos = new JarOutputStream(fos)){
            byte[] buffer = new byte[BUFFER];
            //archivation method
            jos.setLevel(Deflater.DEFAULT_COMPRESSION);
            for (int i = 0; i < filesToJar.length; i++) {
                jos.putNextEntry(new JarEntry(filesToJar[i])); //this constructor takes name, in our case path in project
                try (FileInputStream in = new FileInputStream(filesToJar[i])){ //path to file
                    int len;
                    while ((len = in.read(buffer)) > 0) { //method read reads bytes from file to byte-array
                        jos.write(buffer, 0, len); //writes bytes from byte-array to file in archive
                    }
                    jos.closeEntry();
                } catch (FileNotFoundException e) {
                    System.err.println("File not found: " + e);
                }
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Bad argument: " + e);
        } catch (IOException e) {
            System.err.println("Access fail: " + e);
        }
    }
}
