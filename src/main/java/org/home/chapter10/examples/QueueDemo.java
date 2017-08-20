package org.home.chapter10.examples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    
    public static void main(String[] args) {
    
        LinkedList<String> list = new LinkedList<String>() {
            {
                add("Hello");
                add("World");
            }
        };
    
        Queue<String> queue = list;
        queue.offer("Pavel");
        queue.forEach(System.out::println);
    }
}
