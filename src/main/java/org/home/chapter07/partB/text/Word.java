package org.home.chapter07.partB.text;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word extends SentencePart {
    
    private List<Symbol> symbols;
    
    public List<Symbol> getSymbols() {
        return symbols;
    }
    
    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }
    
    public Word() {
        symbols = new LinkedList<>();
    }
    
    public Word(List<Symbol> symbols) {
        setSymbols(symbols);
    }
    
    public boolean pushSymbol(Symbol s) {
        Matcher m = Pattern.compile("\\w").matcher(String.valueOf(s.getSymbol()));
        if (m.matches()) {
            symbols.add(s);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean popSymbol() {
        if (symbols.size() > 0) {
            symbols.remove(symbols.size() - 1);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Symbol s : symbols) {
            sb.append(s);
        }
        return sb.toString();
    }
}
