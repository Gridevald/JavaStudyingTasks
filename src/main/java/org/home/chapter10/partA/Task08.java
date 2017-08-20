package org.home.chapter10.partA;

import java.util.HashSet;
import java.util.Set;

public class Task08 extends HashSet<Integer> {
    
    /**
     * Finds out if input set cross at least by one element with current set.
     */
    public boolean cross(Set<Integer> input) {
        for (Integer i : input) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Adds input set in current set.
     */
    public void combine(Set<Integer> input) {
        this.addAll(input);
    }
}
