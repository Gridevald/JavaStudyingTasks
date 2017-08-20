package org.home.chapter03.partB.interval;

import java.util.ArrayList;
import java.util.List;

public class IntervalMain {
    
    public static void main(String[] args) {
        
        IntervalHandler handler = new IntervalHandler();
        
        Interval i1 = new Interval(1, true, 5, false);
        Interval i2 = new Interval(4, true, 9, true);
        Interval i3 = new Interval(-2, true, 9, false);
        Interval i4 = new Interval(0, true, 10, true);
        Interval i5 = new Interval(4, true, 5, false);
    
        List<Interval> list = new ArrayList<Interval>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        
        if (handler.cross(i1, i2)) {
            System.out.println(i1 + " and " + i2 + " is crossing");
            System.out.println(i1 + " connected with " + i2 + " is " + handler.connect(i1, i2));
        } else {
            System.out.println(i1 + " and " + i2 + " is not crossing");
        }
    
        System.out.println("Intervals in List are:");
        for (Interval i : list) {
            System.out.println(i + " Length: " + i.length());
        }
        System.out.println("Max length of intervals in List is " + handler.longest(list));
    }
}
