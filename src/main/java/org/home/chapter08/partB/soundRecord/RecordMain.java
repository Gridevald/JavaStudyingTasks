package org.home.chapter08.partB.soundRecord;

import org.home.chapter08.partB.soundRecord.soundExceptions.SoundException;
import org.home.chapter08.partB.soundRecord.soundExceptions.SoundLengthException;

public class RecordMain {
    
    public static void main(String[] args) {
        Song s1 = null;
        String s1Performer = "Christina Aguilera";
        String s1Name = null;
        try {
            s1 = new VocalSong(s1Performer, s1Name);
        } catch (SoundException e) {
            System.err.println("Attempt to do new vocal song: " + e);
        }
        int s1Length = 302;
        try {
            s1.setLength(s1Length);
        } catch (SoundLengthException e) {
            System.err.println("Length");
        }
        System.out.println(s1);
    }
}
