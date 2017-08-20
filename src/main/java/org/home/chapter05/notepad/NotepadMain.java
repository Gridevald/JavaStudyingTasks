package org.home.chapter05.notepad;

import java.util.GregorianCalendar;

public class NotepadMain {
    
    public static void main(String[] args) {
        
        Notepad notepad_01 = new Notepad(new GregorianCalendar());
        notepad_01.addNote("Hey there!");
        notepad_01.addNote("My name is Paul.");
        notepad_01.addNote("What is your name? :)");
    
        System.out.println(notepad_01);
        
        Notepad notepad_02 = new Notepad(new GregorianCalendar(2017, 3, 4, 22, 04));
        notepad_02.addNote("Hey, my future me.");
        notepad_02.addNote("Remember! You should be strong!");
        notepad_02.addNote("Don't crush under their actions and words.");
    
        System.out.println(notepad_02);
    }
}
