package org.home.chapter06.employee;

public abstract class Worker implements Employee {
    
    protected AccessLevel accessLevel;
    
    private int id;
    
    private String firstName;
    
    private String lastName;
    
    private double salary;
    
    /**
     * Getters and Setters
     */
    
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }
    
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
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    
    /**
     * Constructors
     */
    
    protected Worker() {
    }
    
    public Worker(int id) {
        setId(id);
        accessLevel = AccessLevel.LOW;
    }
    
    public Worker(int id, String firstName, String lastName) {
        this(id);
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    public Worker(int id, String firstName, String lastName, double salary) {
        this(id, firstName, lastName);
        setSalary(salary);
    }
    
    /**
     * Methods
     */
    
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
