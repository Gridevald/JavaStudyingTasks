package org.home.chapter04.partA.text;

/**
 * It's key object of Sentence and Text.
 * It consists of String "word".
 */
public class Word {
    
    private String word;
    
    public Word(String word) {
        this.word = word;
    }
    
    public String getWord() {
        return word;
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    @Override
    public String toString() {
        return word;
    }
    
    @Override
    public int hashCode() {
        return word.hashCode();
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
        Word w = (Word) obj;
        if (word == null) {
            if (w.getWord() != null) {
                return false;
            }
        } else {
            if (!word.equals(w.getWord())) {
                return false;
            }
        }
        return true;
    }
}
