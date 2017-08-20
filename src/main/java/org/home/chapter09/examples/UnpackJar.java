package org.home.chapter09.examples;

import java.io.*;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class UnpackJar {
    
    private File destFile;
    
    public final int BUFFER = 2_048;
    
    public void unpack(String destinationDirectory, String nameJar) {
        File sourceJarFile = new File(nameJar); // source file (.jar)
        try (JarFile jFile = new JarFile(sourceJarFile)) { // wrap source file in JarFile
            File unzipDir = new File(destinationDirectory); // destination directory
            // opening
            Enumeration<JarEntry> jarFileEntries = jFile.entries(); // enum of Entries in source JarFile
            while (jarFileEntries.hasMoreElements()) { // while there are files in JarFile
                // open current element from archive
                JarEntry entry = jarFileEntries.nextElement(); // get current file
                String entryName = entry.getName(); //get name(with path) of file
                System.out.println("Extracting: " + entryName);
                destFile = new File(unzipDir, entryName); // initialize dest file
                // spot directory
                File destinationParent = destFile.getParentFile(); // finds path of dest file
                // make directory structure
                destinationParent.mkdirs();
                // unpack file if it's not a directory
                if (!entry.isDirectory()) {
                    writeFile(jFile, entry);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void writeFile(JarFile jFile, JarEntry entry) {
        int currentByte;
        byte[] data = new byte[BUFFER];
        try (BufferedInputStream is = new BufferedInputStream(jFile.getInputStream(entry));
             FileOutputStream fos = new FileOutputStream(destFile);
             BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER)) {
            // write file on hard-disk
            while ((currentByte = is.read(data, 0, BUFFER)) > 0) {
                dest.write(data, 0, currentByte);
            }
            dest.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
