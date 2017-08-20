package org.home.chapter08.partB.soundRecord;

import org.home.chapter08.partB.soundRecord.soundExceptions.SoundLengthException;
import org.home.chapter08.partB.soundRecord.soundExceptions.SoundSetterException;

public abstract class Song {
    
    private String performer;
    
    private String name;
    
    private String style;
    
    private int length;
    
    public Song() {
    }
    
    public Song(String performer) throws SoundSetterException {
        setPerformer(performer);
    }
    
    public Song(String performer, String name) throws SoundSetterException {
        setPerformer(performer);
        setName(name);
    }
    
    public String getPerformer() {
        return performer;
    }
    
    public void setPerformer(String performer) throws SoundSetterException {
        if (performer != null) {
            this.performer = performer;
        } else {
            throw new SoundSetterException("SET performer as null");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) throws SoundSetterException {
        if (name != null) {
            this.name = name;
        } else {
            throw new SoundSetterException("SET name as null");
        }
    }
    
    public String getStyle() {
        return style;
    }
    
    public void setStyle(String style) throws SoundSetterException {
        this.style = style;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) throws SoundLengthException {
        if (length > 1) {
            this.length = length;
        } else {
            throw new SoundLengthException("Something wrong with length");
        }
    }
}
