package org.home.chapter11.examples.blocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingRunner {
    
    public static void main(String[] args) {
        
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        
        new Thread(() -> {
            for (int i = 1; i < 4; i++) {
                try {
                    queue.put("Java " + i);
                    System.out.println("Element " + i + " added.");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Element " + queue.take() + " took.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
