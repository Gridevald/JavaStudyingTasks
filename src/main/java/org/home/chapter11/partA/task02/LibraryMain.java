package org.home.chapter11.partA.task02;

import java.util.LinkedList;

public class LibraryMain {
    public static void main(String[] args) throws InterruptedException{
    
        LinkedList<Book> books = new LinkedList<Book>() {
            {
                for (int i = 0; i < 5; i++) {
                    add(new Book("b_" + i));
                }
            }
        };
        
        Library library = new Library(books);
        
        for (int i = 0; i < 10; i++) {
            new Thread(new Reader("r_" + i, library)).start();
            Thread.sleep(100);
        }
    }
}
