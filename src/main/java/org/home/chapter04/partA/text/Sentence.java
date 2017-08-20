package org.home.chapter04.partA.text;

import java.util.ArrayList;
import java.util.List;

/**
 * Object of Sentence consists of ArrayList of Word-s.
 */
public class Sentence {
    
    private final Word SPACE = new Word(" ");
    
    private final Word COMMA = new Word(", ");
    
    private final Word DOT = new Word(". ");
    
    private final Word EXCLAMATION = new Word("! ");
    
    private final Word QUESTION = new Word("? ");
    
    private final Word COLON = new Word(": ");
    
    private final Word SEMICOLON = new Word("; ");
    
    private final Word DASH = new Word(" - ");
    
    private List<Word> sentence;
    
    public Sentence() {
        sentence = new ArrayList<Word>();
    }
    
    public Sentence(List<Word> sentence) {
        this.sentence = sentence;
    }
    
    public List<Word> getSentence() {
        return sentence;
    }
    
    public void setSentence(List<Word> list) {
        this.sentence = list;
    }
    
    public void addWord(Word word, String sign) {
        sentence.add(word);
        switch (sign.toUpperCase()) {
            case "SPACE":
                sentence.add(SPACE);
                break;
            case "COMMA":
                sentence.add(COMMA);
                break;
            case "DOT":
                sentence.add(DOT);
                break;
            case "EXCLAMATION":
                sentence.add(EXCLAMATION);
                break;
            case "QUESTION":
                sentence.add(QUESTION);
                break;
            case "COLON":
                sentence.add(COLON);
                break;
            case "SEMICOLON":
                sentence.add(SEMICOLON);
                break;
            case "DASH":
                sentence.add(DASH);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word w : sentence) {
            sb.append(w.toString());
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int output = 0;
        for (int i = 0; i < sentence.size(); i++) {
            output += sentence.get(i).hashCode();
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
        Sentence s = (Sentence) obj;
        if (sentence == null) {
            if (s.getSentence() != null) {
                return false;
            }
        } else {
            if (!sentence.equals(s.getSentence())) {
                return false;
            }
        }
        return true;
    }
}
