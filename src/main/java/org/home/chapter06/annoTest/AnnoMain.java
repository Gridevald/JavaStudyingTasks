package org.home.chapter06.annoTest;

public class AnnoMain {
    
    public static void main(String[] args) {
        
        SomeClass1 sc1 = new SomeClass1();
        SomeClass1 sc2 = new SomeClass2();
        SomeClass2 sc3 = new SomeClass2();
    
        System.out.println(sc1.getClass().getAnnotation(NewAnno.class));
        System.out.println(sc2.getClass().getAnnotation(NewAnno.class));
        System.out.println(sc3.getClass().getAnnotation(NewAnno.class));
    }
}
