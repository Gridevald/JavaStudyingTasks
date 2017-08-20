package org.home.chapter07.partB.text;

public class TabSymbol extends SentencePart {
    
    public final static Symbol TAB = new Symbol('\t');
    
    @Override
    public String toString() {
        return String.valueOf(TAB);
    }
}
