package org.home.chapter07.partB.text;

public class Symbol {
    
    private char symbol;
    
    public char getSymbol() {
        return symbol;
    }
    
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    
    public Symbol() {
    }
    
    public Symbol(char c) {
        setSymbol(c);
    }
    
    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
