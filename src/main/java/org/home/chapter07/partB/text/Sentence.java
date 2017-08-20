package org.home.chapter07.partB.text;

import java.util.LinkedList;
import java.util.List;

public class Sentence {
    
    private List<SentencePart> parts;
    
    public List<SentencePart> getParts() {
        return parts;
    }
    
    public void setParts(List<SentencePart> parts) {
        this.parts = parts;
    }
    
    public Sentence() {
        parts = new LinkedList<>();
    }
    
    public Sentence(List<SentencePart> parts) {
        setParts(parts);
    }
    
    public void pushPart(SentencePart part) {
        parts.add(part);
    }
    
    public boolean popPart() {
        if (parts.size() > 0) {
            parts.remove(parts.size() - 1);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (SentencePart p : parts) {
            sb.append(p);
        }
        return sb.toString();
    }
}
