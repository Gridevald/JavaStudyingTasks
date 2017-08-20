package org.home.chapter06.enrollee;

public class StudentMain {
    
    public static void main(String[] args) {
    
        Enrollee st = new DistanceStudent("Pavel", "Yudzitski", 7.1);
        System.out.println(st);
        st.eat();
        st.sleep();
    }
}
