package org.home.chapter11.partA.task02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Library {
    
    private static final int LIBRARY_SIZE = 5;
    private Semaphore semaphore = new Semaphore(LIBRARY_SIZE, true);
    private Queue<Book> libBooks = new LinkedList<>();
    
    public Library(Queue<Book> input) {
        libBooks.addAll(input);
    }
    
    public Book takeBook() throws BookException {
        try {
            if (semaphore.tryAcquire(1_00, TimeUnit.MILLISECONDS)) {
                Book out = libBooks.poll();
                if (out != null) {
                    return out;
                }
            }
        } catch (InterruptedException e) {
            throw new BookException(e);
        }
        throw new BookException("Too much time to wait book.");
    }
    
    public void returnBook(Book input) {
        libBooks.add(input);
        semaphore.release();
    }
}
