package org.home.chapter10.partA;

import java.util.*;

public class Task10generic {
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        
        Set<Double> sum = new HashSet<>();
        sum.add(0.1);
        sum.add(0.2);
        sum.add(0.3);
        sum.add(0.4);
        sum.add(0.5);
        
        
        System.out.println(new Task10generic().getSum(sum));
    }
    
    @SuppressWarnings("unchecked")
    public <T extends Number> T getSum(Set<T> input) throws IllegalAccessException, InstantiationException {
        //copy input set to avoid changing if input set
        Set<T> inner = new HashSet<>(input);
        while (inner.size() > 1) {
            Set<T> tempSet = new HashSet<>();
            Iterator<T> it = inner.iterator();
            Double tempNum = 0.0;
            int count = 0;
            while (it.hasNext()) {
            tempNum += it.next().doubleValue();
                count++;
                if (count > 1) {
                tempSet.add((T) tempNum);
                tempNum = 0.0;
                    count = 0;
                } else {
                    if (!it.hasNext()) {
                        tempSet.add((T) tempNum);
                    }
                }
            }
            inner = tempSet;
        }
        return inner.iterator().next();
    }
}
