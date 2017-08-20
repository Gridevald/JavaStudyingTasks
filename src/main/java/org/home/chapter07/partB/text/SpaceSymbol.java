package org.home.chapter07.partB.text;

public class SpaceSymbol extends SentencePart {
    
    public final static Symbol SPACE = new Symbol(' ');
    
    @Override
    public String toString() {
        return String.valueOf(SPACE);
    }
}
