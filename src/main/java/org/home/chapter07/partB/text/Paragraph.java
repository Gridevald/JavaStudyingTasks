package org.home.chapter07.partB.text;

import java.util.LinkedList;
import java.util.List;

public class Paragraph extends TextPart {
    
    private List<Sentence> sentences;
    
    public Paragraph() {
        sentences = new LinkedList<>();
    }
    
    public Paragraph(List<Sentence> sentences) {
        setSentences(sentences);
    }
    
    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }
    
    public List<Sentence> getSentences() {
        sentences.remove(0);
        return sentences;
    }
    
    public void pushSentence(Sentence sentence) {
        sentences.add(sentence);
    }
    
    public boolean popSentence() {
        if (sentences.size() > 1) {
            sentences.remove(sentences.size() - 1);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\t");
        for (Sentence s : sentences) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
