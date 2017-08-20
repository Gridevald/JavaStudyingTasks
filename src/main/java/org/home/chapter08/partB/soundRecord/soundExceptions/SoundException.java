package org.home.chapter08.partB.soundRecord.soundExceptions;

public class SoundException extends Exception{
    
    public SoundException() {
    }
    
    public SoundException(String message) {
        super(message);
    }
    
    public SoundException(Throwable exception) {
        super(exception);
    }
    
    public SoundException(String message, Throwable exception) {
        super(message, exception);
    }
}
