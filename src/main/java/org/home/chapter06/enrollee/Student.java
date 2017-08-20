package org.home.chapter06.enrollee;

public abstract class Student implements Enrollee{
    
    private String firstName;
    
    private String lastName;
    
    private double avgMark;
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public double getAvgMark() {
        return avgMark;
    }
    
    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }
    
    public Student(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    public Student(String firstName, String lastName, double avgMark) {
        this(firstName, lastName);
        setAvgMark(avgMark);
    }
    
    @Override
    public String toString() {
        return "Student " + firstName + " " + lastName + ".";
    }
}
