package org.home.chapter11.examples.priority;

public class PriorityRunner {
    
    public static void main(String[] args) {
        PriorThread min = new PriorThread("Min");
        PriorThread mid = new PriorThread("Mid");
        PriorThread max = new PriorThread("Max");
        
        min.setPriority(Thread.MIN_PRIORITY);
        mid.setPriority(Thread.NORM_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        
        min.start();
        mid.start();
        max.start();
    }
}
