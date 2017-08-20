package org.home.chapter06.publication;

public class BookMain {
    
    public static void main(String[] args) {
        
        Book b1 = new Encyclopedia();
        b1.setId(1);
        b1.setTitle("Encyclopedia about World!");
        b1.addText("Hello my little reader! today you will learn something new about World. ");
        b1.addText("Java is a programming language. It is used very wide in many different ways. ");
        
        Book b2 = new Directory(2, "Phone directory");
        b2.addText("Pavel Yudzitski +375-33-630-35-92.");
        b2.addText("Pavel Sadovski +375-44-743-12-67");
        b2.addText("Sergey Pugach +375-29-272-39-77");
    
        System.out.println(b1);
        System.out.println(b2);
    }
}
