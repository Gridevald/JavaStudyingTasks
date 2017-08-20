package org.home.chapter10.partA;

import java.util.LinkedList;
import java.util.List;

/**
 * Moves negative numbers to the end of the List.
 */
public class Task13 {
    
    public static void main(String[] args) {
        List<Integer> ints = new LinkedList<>();
        ints.add(-1);
        ints.add(1);
        ints.add(0);
        ints.add(-3);
        ints.add(2);
        ints.add(5);
        ints.add(-1);
        ints.add(7);
        System.out.println(ints);
        Task13 task = new Task13();
        task.doSort(ints);
        System.out.println(ints);
    }
    
    public <T extends Number> void doSort(List<T> input) {
        int length = input.size();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (input.get(i).doubleValue() < 0) {
                input.add(length + count, input.get(i));
            }
        }
        // we need to decrease number of iterations on number of negative numbers
        // because length of list would change after every removing
        int newLength = length - (input.size() - length);
        for (int i = 0; i < newLength; i++) {
            if (input.get(i).doubleValue() < 0) {
                input.remove(i);
            }
        }
    }
}
