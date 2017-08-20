package org.home.chapter08.partB.soundRecord;

import org.home.chapter08.partB.soundRecord.soundExceptions.SoundException;
import org.home.chapter08.partB.soundRecord.soundExceptions.SoundSetterException;

import java.util.List;

public class InstrumentalSong extends Song {
    
    private List<Instrument> instruments;
    
    public InstrumentalSong() {
    }
    
    public InstrumentalSong(String performer) throws SoundException {
        super(performer);
    }
    
    public InstrumentalSong(String performer, String name) throws SoundException {
        super(performer, name);
    }
    
    @Override
    public void setStyle(String style) throws SoundSetterException {
        if (style != null) {
            super.setStyle(style);
        } else {
            throw new SoundSetterException("SET instrumentSong style as null");
        }
    }
    
    public void addInstrument(Instrument instrument) throws SoundSetterException{
        if (instrument != null) {
            instruments.add(instrument);
        } else {
            throw new SoundSetterException("Adding null instrument");
        }
    }
    
    public void removeInstrument(int index) {
        try {
            instruments.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("removeInstrument instrumentSong: " + e);
        }
    }
    
    @Override
    public String toString() {
        return "InstrumentalSong{" +
                "Performer=" + getPerformer() +
                "Name=" + getName() +
                "Length=" + getLength() +
                '}';
    }
}
