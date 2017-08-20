package org.home.chapter10.partB;

import java.util.ArrayList;

/**
 * This class represents duplicate of ArrayList,
 * but has additional method - search(finds closest number to N).
 */
public class Task05<T extends Number> extends ArrayList<T>{
    
    public T search(T n) {
        if (contains(n)) {
            return n;
        }
        Double min = Math.abs(get(0).doubleValue() - n.doubleValue());
        int iMin = 0;
        for (int i = 0; i < size(); i++) {
            if (Math.abs(get(i).doubleValue() - n.doubleValue()) < min) {
                min = Math.abs(get(i).doubleValue() - n.doubleValue());
                iMin = i;
            }
        }
        return get(iMin);
    }
}
