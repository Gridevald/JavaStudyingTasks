package org.home.chapter08.partB.soundRecord.soundExceptions;

public class SoundLengthException extends SoundException {
    
    public SoundLengthException() {
    }
    
    public SoundLengthException(String message) {
        super(message);
    }
    
    public SoundLengthException(Throwable exception) {
        super(exception);
    }
    
    public SoundLengthException(String message, Throwable exception) {
        super(message, exception);
    }
}
