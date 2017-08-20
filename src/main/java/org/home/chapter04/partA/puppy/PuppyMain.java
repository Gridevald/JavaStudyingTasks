package org.home.chapter04.partA.puppy;

public class PuppyMain {
    
    public static void main(String[] args) {
        
        Puppy blackPaw = new Puppy("Black Paw");
        System.out.println(blackPaw.getName());
        blackPaw.voice();
        blackPaw.jump();
        blackPaw.run();
        blackPaw.bite();
    
        System.out.println(blackPaw);
    }
}
