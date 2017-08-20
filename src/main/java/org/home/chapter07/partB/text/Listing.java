package org.home.chapter07.partB.text;

import java.util.LinkedList;
import java.util.List;

public class Listing extends TextPart {
    
    private List<Lexeme> lexemes;
    
    /**
     * Constructors
     */
    public Listing() {
        lexemes = new LinkedList<>();
    }
    
    public Listing(List<Lexeme> lexemes) {
        setLexemes(lexemes);
    }
    
    /**
     * Getters & Setters
     */
    public void setLexemes(List<Lexeme> lexemes) {
        this.lexemes = lexemes;
    }
    
    public List<Lexeme> getLexemes() {
        return lexemes;
    }
    
    /**
     * Methods
     */
    public void pushSentence(Lexeme lexeme) {
        lexemes.add(lexeme);
    }
    
    public boolean popSentence() {
        if (lexemes.size() > 0) {
            lexemes.remove(lexemes.size() - 1);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Lexeme l : lexemes) {
            sb.append("\t").append(l).append("\n");
        }
        return sb.toString();
    }
}
