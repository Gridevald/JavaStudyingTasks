package org.home.chapter10.partA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task10 {
    
    public static void main(String[] args) {
        
        Set<Double> sum = new HashSet<>();
        sum.add(0.1);
        sum.add(0.2);
        sum.add(0.3);
        sum.add(0.4);
        sum.add(0.5);
        
        System.out.printf("%.3f", new Task10().getSum(sum));
        
        Set<Integer> integers = new HashSet<>();
        
    }
    
    public double getSum(Set<Double> input) {
        //copy input set to avoid changing if input set
        Set<Double> inner = new HashSet<>(input);
        //sum couples of elements till one element left
        while (inner.size() > 1) {
            Set<Double> tempSet = new HashSet<>(); //new set with sum elements
            Iterator it = inner.iterator();
            double tempNum = 0;
            int count = 0;
            while (it.hasNext()) {
                tempNum += (Double) it.next();
                count++;
                if (count > 1) {
                    tempSet.add(tempNum);
                    tempNum = 0;
                    count = 0;
                } else {
                    if (!it.hasNext()) {
                        tempSet.add(tempNum);
                    }
                }
            }
            //assign tempSet as inner to make while loop come true!
            inner = tempSet;
        }
        return inner.iterator().next();
    }
}
