package org.home.chapter03.partA.student;

import org.home.chapter03.partA.Address;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Student {
    
    private int id;
    
    private String firstName;
    
    private String patronymic;
    
    private String lastName;
    
    private GregorianCalendar birthday;
    
    private Address address;
    
    private String telNumber;
    
    private String faculty;
    
    private int course;
    
    private int group;
    
    public Student(int id, String firstName, String patronymic, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }
    
    public Student(int id, String firstName, String patronymic, String lastName, GregorianCalendar birthday) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    
    public Student(int id, String firstName, String patronymic, String lastName, int course, int group) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.course = course;
        this.group = group;
    }
    
    public Student(int id, String firstName, String patronymic, String lastName, String faculty, int course, int group) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getPatronymic() {
        return patronymic;
    }
    
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public GregorianCalendar getBirthday() {
        return birthday;
    }
    
    public void setBirthday(GregorianCalendar birthday) {
        this.birthday = birthday;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String getTelNumber() {
        return telNumber;
    }
    
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    
    public String getFaculty() {
        return faculty;
    }
    
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    public int getCourse() {
        return course;
    }
    
    public void setCourse(int course) {
        this.course = course;
    }
    
    public int getGroup() {
        return group;
    }
    
    public void setGroup(int group) {
        this.group = group;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("student #ID " + this.getId() + "\n");
        builder.append("First name: " + this.getFirstName() + "\n");
        builder.append("Patronymic: " + this.getPatronymic() + "\n");
        builder.append("Last name: " + this.getLastName() + "\n");
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
        builder.append("Birthday: " + sdFormat.format(this.getBirthday().getTime()) + "\n");
        builder.append(this.getAddress());
        builder.append("Telephone number: " + this.getTelNumber() + "\n");
        builder.append("Faculty: " + this.getFaculty() + "\n");
        builder.append("Course: " + this.getCourse() + "\n");
        builder.append("Group number: " + this.getGroup() + "\n");
        
        return builder.toString();
    }
}
