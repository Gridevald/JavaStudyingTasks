package org.home.chapter03.partA.student;

import java.util.*;

public class StudentProcessor {
    
    public void studentsOfFaculty(Student[] students, String faculty) {
        
        System.out.println("Students of faculty " + faculty + " :");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                System.out.println((i + 1) + ". " + students[i].getFirstName() + " " +
                        students[i].getPatronymic() + " " + students[i].getLastName());
            }
        }
        System.out.println();
    }
    
    public void eachStudent(Student[] students) {
        
        List<String> facultiesList = this.getFaculties(students);
        
        for (int i = 0; i < facultiesList.size(); i++) {
            System.out.println("Faculty " + facultiesList.get(i) + " :");
            List<Integer> temp = this.getCourses(facultiesList.get(i), students);
            for (int j = 0; j < temp.size(); j++) {
                System.out.println("Course " + temp.get(j) + " :");
                for (int q = 0; q < students.length; q++) {
                    if (students[q].getFaculty().equals(facultiesList.get(i)) &&
                            students[q].getCourse() == temp.get(j)) {
                        System.out.println((q + 1) + ". " + students[q].getFirstName() + " " +
                                students[q].getPatronymic() + " " + students[q].getLastName());
                    }
                }
            }
        }
    }
    
    private List<String> getFaculties(Student[] students) {
        
        Set<String> faculties = new HashSet<String>();
    
        for (int i = 0; i < students.length; i++) {
            faculties.add(students[i].getFaculty());
        }
        
        return (new ArrayList<String>(faculties));
    }
    
    private List<Integer> getCourses(String faculty, Student[] students) {
    
        Set<Integer> courses = new TreeSet<Integer>();
        
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                courses.add(students[i].getCourse());
            }
        }
        
        return (new ArrayList<Integer>(courses));
    }
    
    public void studentsBirth(Student[] students, int year) {
        
        System.out.println("Students born after " + year + " :");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getBirthday().get(Calendar.YEAR) > year) {
                System.out.println((i + 1) + ". " + students[i].getFirstName() + " " +
                        students[i].getPatronymic() + " " + students[i].getLastName());
            }
        }
        System.out.println();
    }
    
    public void studentsOfGroup(Student[] students, int group) {
        
        System.out.println("Students of group " + group + " :");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup() == group) {
                System.out.println((i + 1) + ". " + students[i].getFirstName() + " " +
                        students[i].getPatronymic() + " " + students[i].getLastName());
            }
        }
        System.out.println();
    }
}
