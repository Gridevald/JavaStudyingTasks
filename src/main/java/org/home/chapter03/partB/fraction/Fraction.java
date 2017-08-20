package org.home.chapter03.partB.fraction;

/**
 * This class represents rational fraction p = (m/n).
 * M is integer number.
 * N is natural number.
 * Constructor with 1 parameter leeds to fraction p = (m/1)
 * which is equivalent of integer number m.
 */
public class Fraction {
    
    private int m;
    
    private int n;
    
    public Fraction (int m) {
        this.m = m;
        this.n = 1;
    }
    
    public Fraction(int m, int n) {
        this.m = m;
        if (checkN(n)) {
            this.n = n;
        }
    }
    
    public int getM() {
        return m;
    }
    
    public void setM(int m) {
        this.m = m;
    }
    
    public int getN() {
        return n;
    }
    
    public void setN(int n) {
        if (checkN(n)) {
            this.n = n;
        }
    }
    
    private boolean checkN(int value) {
        return (value > 0);
    }
    
    public String toString() {
        if (m != 0) {
            return (m + "/" + n);
        } else {
            return "0";
        }
        
    }
    
    public double toDecimal() {
        return (m / n);
    }
}
