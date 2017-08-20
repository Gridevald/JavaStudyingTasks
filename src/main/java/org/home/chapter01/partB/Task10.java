package org.home.chapter01.partB;

//Sort numbers by frequency
import java.util.*;
import java.util.Map.Entry;

public class Task10 {
    
    public void go(int[] input) {
        
        Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
        
        for (int i : input) {
            if (numbersMap.containsKey(i)) {
                numbersMap.put(i, numbersMap.get(i) + 1);
            } else {
                numbersMap.put(i, 1);
            }
        }
        
        List<Entry<Integer, Integer>> numberList = new LinkedList<Entry<Integer, Integer>>(numbersMap.entrySet());
        Collections.sort(numberList, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });
        
        System.out.print("Numbers sorted by frequency: ");
        for (Entry<Integer, Integer> list : numberList) {
            for (int i = 0; i < list.getValue(); i++) {
                System.out.print(list.getKey() + " ");
            }
        }
        System.out.println();
    }
}
