package org.home.chapter11.partA.task02;

public class BookException extends Exception {
    
    public BookException() {
        super();
    }
    
    public BookException(String message) {
        super(message);
    }
    
    public BookException(Throwable cause) {
        super(cause);
    }
    
    public BookException(String message, Throwable cause) {
        super(message, cause);
    }
}
