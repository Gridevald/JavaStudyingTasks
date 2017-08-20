package org.home.chapter07.partB.text;

import java.util.LinkedList;
import java.util.List;

public class Text {
    
    private List<TextPart> parts;
    
    /**
     * Constructors
     */
    public Text(){
        parts = new LinkedList<>();
    }
    
    public Text(List<TextPart> parts) {
        setParts(parts);
    }
    
    /**
     * Getters & Setters
     */
    public List<TextPart> getParts() {
        return parts;
    }
    
    public void setParts(List<TextPart> parts) {
        this.parts = parts;
    }
    
    /**
     * Methods
     */
    public void pushPart(TextPart part) {
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
        for (TextPart p : parts) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
