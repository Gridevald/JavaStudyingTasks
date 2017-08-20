package org.home.chapter04.partA.text;

import java.util.ArrayList;
import java.util.List;

/**
 * This is Class which consists of two parts:
 * - Title - ArrayList of Sentence;
 * - Text - ArrayList of Sentence.
 */
public class Text {
    
    private List<Sentence> title;
    
    private List<Sentence> text;
    
    public Text() {
        title = new ArrayList<Sentence>();
        text = new ArrayList<Sentence>();
    }
    
    public Text(List<Sentence> title) {
        this.title = title;
        text = new ArrayList<Sentence>();
    }
    
    public Text(List<Sentence> title, List<Sentence> text) {
        this.title = title;
        this.text = text;
    }
    
    
    public List<Sentence> getTitle() {
        return title;
    }
    
    public void setTitle(List<Sentence> title) {
        this.title = title;
    }
    
    public List<Sentence> getText() {
        return text;
    }
    
    public void setText(List<Sentence> text) {
        this.text = text;
    }
    
    public void addTitle(Sentence sentence) {
        title.add(sentence);
    }
    
    public void addText(Sentence sentence) {
        text.add(sentence);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : title) {
            sb.append(s.toString());
        }
        sb.append("\n").append("\n");
        for (Sentence s : text) {
            sb.append(s.toString());
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int output = 0;
        for (Sentence s : title) {
            output += 7 * s.hashCode();
        }
        for (Sentence s : text) {
            output += 3 * s.hashCode();
        }
        return output;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Text t = (Text) obj;
        if (title == null) {
            if (t.title != null) {
                return false;
            }
        } else {
            if(!title.equals(t.getTitle())) {
                return false;
            }
        }
        if (text == null) {
            if (t.text != null) {
                return false;
            }
        } else {
            if(!text.equals(t.getText())) {
                return false;
            }
        }
        return true;
    }
}
