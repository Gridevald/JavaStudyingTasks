package org.home.chapter06.employee;

public class Engineer extends Worker {
    
    /**
     * Constructors
     */
    
    protected Engineer() {
    }
    
    public Engineer(int id) {
        accessLevel = AccessLevel.MEDIUM;
        setId(id);
    }
    
    public Engineer(int id, String firstName, String lastName) {
        this(id);
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    public Engineer(int id, String firstName, String lastName, double salary) {
        this(id, firstName, lastName);
        setSalary(salary);
    }
    
    @Override
    public void work() {
        System.out.println("Engineer is working.");
    }
    
    @Override
    public void rest() {
        System.out.println("Engineer is relaxing.");
    }
}
