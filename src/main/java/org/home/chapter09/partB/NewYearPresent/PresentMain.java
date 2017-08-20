package org.home.chapter09.partB.NewYearPresent;

import java.io.InvalidObjectException;

public class PresentMain {
    
    public static void main(String[] args) {
    
        // create some additions
        Addition nuts = new Addition(AdditionType.NUT, 10);
        Addition nougat = new Addition(AdditionType.NOUGAT, 3);
        Addition caramel = new Addition(AdditionType.CARAMEL, 5);
        Addition cream = new Addition(AdditionType.CREAM, 15);
    
        // create som candies
        Candy c1 = new Candy(CandyType.CHOCOLATE);
        c1.addAddition(nuts);
        c1.addAddition(cream);
        c1.addAddition(nougat);
    
        Candy c2 = new Candy(CandyType.LOLLIPOP);
        c2.addAddition(caramel);
        c2.addAddition(nuts);
    
        Candy c3 = new Candy(CandyType.WAFFLE);
        c3.addAddition(cream);
        c3.addAddition(nougat);
        
        // here comes new present!
        SweetPresent present = new SweetPresent();
    
        // add candies to the present
        present.addCandy(c1);
        present.addCandy(c1);
        present.addCandy(c1);
        present.addCandy(c1);
        present.addCandy(c2);
        present.addCandy(c2);
        present.addCandy(c2);
        present.addCandy(c3);
        present.addCandy(c3);
        present.addCandy(c3);
    
        // show what our present is
        System.out.println(present);
    
        // save present via serialization
        String path = "src/main/java/org/home/chapter09/partB/NewYearPresent/save.data";
        PresentSaver saverLoader = new PresentSaver();
        saverLoader.save(present, path);
    
        // make some change in present
        present.popCandy(6);
        present.popCandy(1);
    
        // show new present
        System.out.println(present);
    
        // load old present!
        try {
            present = saverLoader.load(path);
        } catch (InvalidObjectException e) {
            System.err.println("ERROR: " + e);
        }
    
        // show final present :)
        System.out.println(present);
    }
}
