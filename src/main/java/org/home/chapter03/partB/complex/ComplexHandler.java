package org.home.chapter03.partB.complex;

import java.util.List;

public class ComplexHandler {
    
    public Complex sumComplex(Complex c1, Complex c2) {
        double x = c1.getX() + c2.getX();
        double y = c1.getY() + c2.getY();
        return new Complex(x, y);
    }
    
    public Complex sumComplex(List<Complex> list) {
        Complex temp = null;
        if (list.size() > 0) {
            temp = new Complex(list.get(0).getX(), list.get(0).getY());
            if (list.size() > 1) {
                for (int i = 1; i < list.size(); i++) {
                    temp = sumComplex(temp, list.get(i));
                }
            }
        }
        return temp;
    }
    
    public Complex multComplex(Complex c1, Complex c2) {
        double x = c1.getX() * c2.getX() - c1.getY() * c2.getY();
        double y = c1.getY() * c2.getX() + c1.getX() * c2.getY();
        return new Complex(x, y);
    }
    
    public Complex multComplex(List<Complex> list) {
        Complex temp = null;
        if (list.size() > 0) {
            temp = new Complex(list.get(0).getX(), list.get(0).getY());
            if (list.size() > 1) {
                for (int i = 1; i < list.size(); i++) {
                    temp = multComplex(temp, list.get(i));
                }
            }
        }
        return temp;
    }
}
