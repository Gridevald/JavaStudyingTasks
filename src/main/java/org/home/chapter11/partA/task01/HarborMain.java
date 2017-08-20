package org.home.chapter11.partA.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

public class HarborMain {
    
    public static void main(String[] args) {
        List<Container> containers = new ArrayList<Container>() {
            {
                for (int i = 0; i < 25; i++) {
                    add(new Container(i + 1));
                }
            }
        };
        
        Harbor aHarbor = new Harbor(containers.size(), containers);
        Harbor bHarbor = new Harbor(containers.size());
        
        int counter = 0;
        while (aHarbor.containers.size() > 0) {
            counter++;
            
            Phaser phaser = new Phaser();
            phaser.register();
    
            Ship s1 = new Ship(phaser, "s1", 5, aHarbor, bHarbor);
            Ship s2 = new Ship(phaser, "s2", 6, aHarbor, bHarbor);
//            Ship s3 = new Ship(phaser, "s3", 15, aHarbor, bHarbor);
            
            Thread t1 = new Thread(s1);
            Thread t2 = new Thread(s2);
//            Thread t3 = new Thread(s3);
    
            System.out.println("--- " + counter + " round started ---");
            printHarbor("Harbor A", aHarbor);
            printHarbor("Harbor B", bHarbor);
            
            
            t1.start();
            t2.start();
//            t3.start();
            
            phaser.arriveAndAwaitAdvance();
            System.out.println("----- Ships are loaded.");
            
            phaser.arriveAndAwaitAdvance();
            System.out.println("----- Ships came.");
            
            phaser.arriveAndAwaitAdvance();
            System.out.println("----- Ships are unloaded.");
            
            phaser.arriveAndDeregister();
            
            printHarbor("Harbor A", aHarbor);
            printHarbor("Harbor B", bHarbor);
            System.out.println("--- " + counter + " round finished ---");
        }
    }
    
    private static void printHarbor(String name, Harbor harbor) {
        System.out.println(name);
        for (Container c : harbor.containers) {
            System.out.print(c.getId() + " ");
        }
        System.out.println();
    }
}
