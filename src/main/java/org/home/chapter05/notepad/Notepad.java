package org.home.chapter05.notepad;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Notepad {
    
    private Calendar date;
    
    private List<Note> notes;
    
    /**
     * Constructors
     */
    public Notepad() {
        notes = new ArrayList<>();
    }
    
    public Notepad(Calendar calendar) {
        this();
        setDate(calendar);
    }
    
    /**
     * Setters and Getters
     */
    public Calendar getDate() {
        return date;
    }
    
    public void setDate(Calendar date) {
        this.date = date;
    }
    
    public List<Note> getNotes() {
        return notes;
    }
    
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
    
    /**
     * Inner Class Note
     * It is Note, which contains in Notepad List
     */
    private class Note {
        
        private String string;
    
        protected Note() {
        }
        
        private Note(String string) {
            setString(string);
        }
    
        public String getString() {
            return string;
        }
    
        public void setString(String string) {
            this.string = string;
        }
        
        @Override
        public String toString() {
            return string;
        }
    }
    
    /**
     * Methods
     */
    public void addNote(String string) {
        notes.add(new Note(string));
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Date of notes: ");
        sb.append(new SimpleDateFormat("yyyy-MM-dd - HH:mm").format(date.getTime())).append("\n");
        for (Note n : notes) {
            sb.append(n).append("\n");
        }
        return sb.toString();
    }
}
