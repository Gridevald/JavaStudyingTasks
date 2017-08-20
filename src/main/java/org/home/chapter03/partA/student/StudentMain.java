package org.home.chapter03.partA.student;

import org.home.chapter03.partA.Address;

import java.util.GregorianCalendar;

public class StudentMain {
    
    public static void main(String[] args) {
        
        Student[] students = new Student[5];
        
        Student student00 = new Student(10001,
                "Pavel",
                "Ivanovich",
                "Yudzitski",
                new GregorianCalendar(1991, 8, 5));
        student00.setAddress(new Address("Belarus",
                "Minsk",
                "Yuana Chechota",
                "7",
                "71"));
        student00.setTelNumber("+375-33-630-35-91");
        student00.setFaculty("ATF");
        student00.setCourse(4);
        student00.setGroup(101129);
        
        Student student01 = new Student(10002,
                "Pavel",
                "Petrovich",
                "Sadovski");
        student01.setBirthday(new GregorianCalendar(1990, 6, 19));
        student01.setAddress(new Address("Belarus",
                "Borisov"));
        student01.setTelNumber("+375-44-743-12-66");
        student01.setFaculty("ATF");
        student01.setCourse(4);
        student01.setGroup(101129);
        
        Student student02 = new Student(10003,
                "Sergey",
                "Victorovich",
                "Pugach",
                "ATF",
                5,
                101128);
        student02.setBirthday(new GregorianCalendar(1990, 5, 18));
        student02.setAddress(new Address("Belarus",
                "Dzerzhinsk"));
        student02.setFaculty("ATF");
        student02.setCourse(5);
        student02.setGroup(101128);
        
        Student student03 = new Student(10004,
                "Maxim",
                "",
                "Radkevich",
                "GD",
                5,
                121118);
        student03.setBirthday(new GregorianCalendar(1990, 7, 7));
        student03.setAddress(new Address("Belarus",
                "Soligorsk"));
        
        Student student04 = new Student(10005,
                "Julia",
                "",
                "Plevako",
                "ATF",
                5,
                101118);
        student04.setBirthday(new GregorianCalendar(1990, 5, 25));
        student04.setAddress(new Address("India"));
        
        students[0] = student00;
        students[1] = student01;
        students[2] = student02;
        students[3] = student03;
        students[4] = student04;
        
        StudentProcessor processor = new StudentProcessor();
        processor.studentsOfFaculty(students, "ATF");
        processor.studentsOfGroup(students, 101118);
        processor.studentsBirth(students, 1989);
        processor.studentsBirth(students, 1990);
        processor.eachStudent(students);
    }
}
