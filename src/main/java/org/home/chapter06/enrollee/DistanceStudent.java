package org.home.chapter06.enrollee;

public class DistanceStudent extends Student {
    
    private String job;
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    /**
     * Constructors
     */
    public DistanceStudent(String firstName, String lastName) {
        super(firstName, lastName);
    }
    
    public DistanceStudent(String firstName, String lastName, double avgMark) {
        super(firstName, lastName, avgMark);
    }
    
    @Override
    public void eat() {
        System.out.println("Eat ^_^");
    }
    
    @Override
    public void sleep() {
        System.out.println("Sleep only at night.");
    }

    @Override
    public void study() {
        System.out.println("Study every evening after work.");
    }
    
    public void go() {
    
    }
}
