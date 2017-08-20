package org.home.chapter11.partA.task01;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Phaser;

public class Ship implements Runnable {
    
    private Phaser phaser;
    private String name;
    private int capacity;
    private Harbor fromHarbor;
    private Harbor toHarbor;
    private Queue<Container> shipStorage;
    
    public Ship(Phaser phaser, String name, int capacity, Harbor fromHarbor, Harbor toHarbor) {
        this.phaser = phaser;
        this.name = name;
        this.capacity = capacity;
        shipStorage = new LinkedBlockingQueue<>(capacity);
        this.fromHarbor = fromHarbor;
        this.toHarbor = toHarbor;
        this.phaser.register();
    }
    
    @Override
    public void run() {
        loadShip();
        phaser.arriveAndAwaitAdvance();
        
        goShip();
        phaser.arriveAndAwaitAdvance();
        
        unloadShip();
        phaser.arriveAndDeregister();
    }
    
    private void loadShip() {
        for (int i = 0; i < capacity; i++) {
            Container c = fromHarbor.getContainer();
            
            if (c != null) {
                shipStorage.add(c);
                System.out.println("Ship " + name + " loaded " + c.getId());
            } else {
                return;
            }
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("ERROR: " + e);
            }
        }
    }
    
    private void unloadShip() {
        int temp = shipStorage.size();
        for (int i = 0; i < temp; i++) {
            Container c = shipStorage.poll();
            toHarbor.setContainer(c);
            System.out.println("Ship " + name + " unloaded " + c.getId());
        }
        
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.err.println("ERROR: " + e);
        }
    }
    
    private void goShip() {
        try {
            Thread.sleep(new Random().nextInt(500));
            System.out.println("Ship " + name + " started ride.");
            Thread.sleep(new Random().nextInt(2_000));
            System.out.println("Ship " + name + " finished ride.");
        } catch (InterruptedException e) {
            System.err.println("ERROR: " + e);
        }
    }
}
