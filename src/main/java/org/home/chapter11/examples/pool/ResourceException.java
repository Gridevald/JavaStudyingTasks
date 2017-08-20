package org.home.chapter11.examples.pool;

public class ResourceException extends Exception {
    
    public ResourceException() {
        super();
    }
    
    public ResourceException(String message) {
        super(message);
    }
    
    public ResourceException(Throwable cause) {
        super(cause);
    }
    
    public ResourceException(String message, Throwable cause) {
        super(message, cause);
    }
}
