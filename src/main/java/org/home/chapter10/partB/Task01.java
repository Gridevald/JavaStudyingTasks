package org.home.chapter10.partB;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Finds out number of last man in the circle of n men,
 * if every second man deletes.
 */
public class Task01 {
    
    public static void main(String[] args) {
        
        Task01 t = new Task01();
        
        ArrayList<Integer> aList = t.makeList(300_000);
        LinkedList<Integer> lList = new LinkedList<>(aList);
        
        long start = System.currentTimeMillis();
        System.out.print(t.kickA(aList));
        long finish = System.currentTimeMillis();
        System.out.println(" - ArrayList, time " + (finish - start) + " ms.");
        
        start = System.currentTimeMillis();
        System.out.print(t.kickL(lList));
        finish = System.currentTimeMillis();
        System.out.println(" - LinkedList, time " + (finish - start) + " ms.");
    }
    
    public int kickA(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>(list);
        int i = 1;
        while (temp.size() > 1) {
            while (i < temp.size()) {
                temp.remove(i);
                i++;
            }
            if (i > temp.size()) {
                i = 1;
            } else {
                i = 0;
            }
        }
        return temp.get(0);
    }
    
    public int kickL(LinkedList<Integer> list) {
        LinkedList<Integer> temp = new LinkedList<>(list);
        int i = 1;
        while (temp.size() > 1) {
            while (i < temp.size()) {
                temp.remove(i);
                i++;
            }
            if (i > temp.size()) {
                i = 1;
            } else {
                i = 0;
            }
        }
        return temp.get(0);
    }
    
    /**
     * Makes ArrayList filled with int numbers from 1 to n.
     */
    public ArrayList<Integer> makeList(int n) {
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            out.add(i);
        }
        return out;
    }
}
