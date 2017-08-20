package org.home.chapter03.partB.complex;

import java.util.ArrayList;
import java.util.List;

public class ComplexMain {
    
    public static void main(String[] args) {
        
        Complex complex00 = new Complex(1.15, 2.83);
        Complex complex01 = new Complex(-1.15, -1.83);
        System.out.println(complex00);
        System.out.println(complex01);
        
        ComplexHandler handler = new ComplexHandler();
        
        Complex complex02 = handler.sumComplex(complex00, complex01);
        System.out.println(complex02);
    
        List<Complex> list = new ArrayList<Complex>();
        list.add(complex00);
        list.add(complex01);
        list.add(complex02);
        Complex complex03 = handler.sumComplex(list);
        System.out.println(complex03);
        
        Complex complex04 = handler.multComplex(complex00, complex01);
        System.out.println(complex04);
        
        Complex complex05 = handler.multComplex(list);
        System.out.println(complex05);
    }
}
