package org.home.chapter08.partB.soundRecord.soundExceptions;

public class SoundSetterException extends SoundException{
    
    public SoundSetterException() {
    }
    
    public SoundSetterException(String message) {
        super(message);
    }
    
    public SoundSetterException(Throwable exception) {
        super(exception);
    }
    
    public SoundSetterException(String message, Throwable exception) {
        super(message, exception);
    }
}
