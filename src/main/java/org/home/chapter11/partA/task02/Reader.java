package org.home.chapter11.partA.task02;

import java.util.Random;

public class Reader implements Runnable {
    
    private String name;
    private static final int MY_BOOKS = 3;
    private Library library;
    
    public Reader(String name, Library library) {
        this.name = name;
        this.library = library;
    }
    
    @Override
    public void run() {
        Book temp = null;
        int times = new Random().nextInt(MY_BOOKS);
        for (int i = 0; i < times; i++) {
            try {
                temp = library.takeBook();
                System.out.println("Reader " + name + " took book " + temp);
                System.out.println("Reader " + name + " reading book " + temp);
                Thread.sleep(100);
            } catch (BookException | InterruptedException e) {
                System.err.println("Reader " + name + " -> " + e.getMessage());
            } finally {
                if (temp != null) {
                    library.returnBook(temp);
                    System.out.println("Reader " + name + " returned book " + temp);
                }
            }
        }
    }
}
