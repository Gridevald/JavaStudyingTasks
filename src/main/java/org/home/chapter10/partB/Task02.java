package org.home.chapter10.partB;

import java.util.ArrayList;
import java.util.List;

/**
 * Sorts list by following rule:
 * - the is number N;
 * - in the left part placed numbers less than or equal to N;
 * - in the right part placed numbers more than N.
 */
public class Task02 {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(7);
        list.add(0);
        list.add(1);
        list.add(7);
        list.add(-1);
        list.add(8);
        
        int n = 3;
        
        Task02 t = new Task02();
    
        System.out.println(list);
        t.doSort(list, n);
        System.out.println(list);
    }
    
    public void doSort(List<Integer> list, int n) {
        int i = 0;
        int last = list.size() - 1;
        while (i != last) {
            if (list.get(i) > n) {
                while (list.get(i) > n) {
                    int temp = list.get(i);
                    list.set(i, list.get(last));
                    list.set(last, temp);
                    last--;
                }
            } else {
                i++;
            }
        }
    }
}
