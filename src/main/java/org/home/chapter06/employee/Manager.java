package org.home.chapter06.employee;

public class Manager extends Engineer {
    
    /**
     * Constructors
     */
    
    public Manager(int id) {
        setId(id);
        accessLevel = AccessLevel.HIGH;
    }
    
    public Manager(int id, String firstName, String lastName) {
        this(id);
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    public Manager(int id, String firstName, String lastName, double salary) {
        this(id, firstName, lastName);
        setSalary(salary);
    }
    
    /**
     * Methods
     */
    
    public void manage() {
        System.out.println("Do manage staff.");
    }
    
    @Override
    public void work() {
        System.out.println("Manager is working");
    }
    
    @Override
    public void rest() {
        System.out.println("Manager is relaxing");
    }
}
