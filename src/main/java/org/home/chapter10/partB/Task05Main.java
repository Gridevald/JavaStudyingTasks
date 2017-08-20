package org.home.chapter10.partB;

public class Task05Main {
    
    public static void main(String[] args) {
        Task05<Integer> t = new Task05<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
            }
        };
    
        System.out.println(t.search(1));
        System.out.println(t.search(7));
    }
}
