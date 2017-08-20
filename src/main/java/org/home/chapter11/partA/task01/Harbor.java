package org.home.chapter11.partA.task01;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;


public class Harbor {

    private static final int DEFAULT_CAPACITY = 30;
    
    Queue<Container> containers = null;
    
    public Harbor() {
        containers = new LinkedBlockingQueue<>(DEFAULT_CAPACITY);
    }
    
    public Harbor(int capacity) {
        containers = new LinkedBlockingQueue<>(capacity);
    }
    
    public Harbor(int capacity, Collection<Container> input) {
        containers = new LinkedBlockingQueue<>(capacity);
        containers.addAll(input);
    }
    
    public Container getContainer() {
        return containers.poll();
    }
    
    public boolean setContainer(Container container) {
        return containers.add(container);
    }
}
