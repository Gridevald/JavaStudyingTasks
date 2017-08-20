package org.home.chapter06.employee;

public class EmployeeMain {
    
    public static void main(String[] args) {
        
        Worker engineer = new Engineer(131504, "Pavel", "Yudzitski", 600);
        engineer.work();
        engineer.rest();
        
        Worker manager = new Manager(131533, "Oleg", "Petrov", 1700);
        manager.work();
        manager.rest();
        ((Manager) manager).manage();
        changeSalary(engineer, engineer, 1000);
        changeSalary(manager, engineer, 1200);
    }
    
    public static void changeSalary(Worker worker, Worker target, double salary) {
        if (worker.accessLevel.equals(AccessLevel.HIGH)) {
            target.setSalary(salary);
            System.out.println("New salary of " + target + " $" + salary);
        } else {
            System.out.println("Your access level is lower than necessary.");
        }
    }
}
