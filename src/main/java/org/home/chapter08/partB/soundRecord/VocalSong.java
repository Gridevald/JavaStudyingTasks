package org.home.chapter08.partB.soundRecord;

import org.home.chapter08.partB.soundRecord.soundExceptions.SoundException;
import org.home.chapter08.partB.soundRecord.soundExceptions.SoundSetterException;

import java.util.List;
import java.util.Objects;

public class VocalSong extends Song{
    
    private List<Instrument> instruments;
    
    private List<Vocalist> vocalists;
    
    public VocalSong() {
    }
    
    public VocalSong(String performer) throws SoundException {
        super(performer);
    }
    
    public VocalSong(String performer, String name) throws SoundException {
        super(performer, name);
    }
    
    @Override
    public void setStyle(String style) throws SoundSetterException {
        if (style != null) {
            super.setStyle(style);
        } else {
            throw new SoundSetterException("SET vocalSong style as null");
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
            System.err.println("removeInstrument vocalSong: " + e);
        }
    }
    
    public void addVocalist(Vocalist vocalist) throws SoundSetterException{
        if (vocalist != null) {
            vocalists.add(vocalist);
        } else {
            throw new SoundSetterException("Adding null vocalist");
        }
    }
    
    public void removeVocalist(int index) {
        try {
            vocalists.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("removeVocalist vocalSong: " + e);
        }
    }
    
    public void removeVocalis(Vocalist vocalist) {
        try {
            vocalists.remove(vocalist);
        } catch (NullPointerException e) {
            System.err.println("Something with removing vocalist by object: " + e);
        }
    }
    
    @Override
    public String toString() {
        return "VocalSong{" +
                "Performer=" + getPerformer() +
                ", Name=" + getName() +
                ", Length=" + getLength() +
                '}';
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof VocalSong)) return false;
        VocalSong vocalSong = (VocalSong) object;
        return Objects.equals(instruments, vocalSong.instruments) &&
                Objects.equals(vocalists, vocalSong.vocalists);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(instruments, vocalists);
    }
}
