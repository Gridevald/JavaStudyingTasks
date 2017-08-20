package org.home.chapter11.examples.threds;

public class WalkTalk {
    
    public static void main(String[] args) {
        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());
        
        talk.start();
        walk.start();
    }
}
