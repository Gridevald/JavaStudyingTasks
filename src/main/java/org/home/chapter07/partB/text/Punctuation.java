package org.home.chapter07.partB.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Punctuation extends SentencePart {
    
    private Symbol mark;
    
    public Symbol getMark() {
        return mark;
    }
    
    public boolean setMark(Symbol mark) {
        Matcher m = Pattern.compile("\\p{Punct}").matcher(String.valueOf(mark));
        if (m.matches()) {
            this.mark = mark;
            return true;
        } else {
            return false;
        }
    }
    
    public Punctuation() {
    }
    
    public Punctuation(Symbol mark) {
        setMark(mark);
    }
    
    @Override
    public String toString() {
        return String.valueOf(mark);
    }
}
