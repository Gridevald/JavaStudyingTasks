package org.home.chapter03.partA.customer;

import org.home.chapter03.partA.Address;

public class Customer {
    
    private int id;
    
    private String firstName;
    
    private String patronymic;
    
    private String lastName;
    
    private Address address;
    
    private int creditCardNumber;
    
    private int accountNumber;
    
    public Customer (int id, String firstName, String patronymic, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }
    
    public Customer (int id, String firstName, String patronymic, String lastName, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.address = address;
    }
    
    public Customer (int id, String firstName, String patronymic, String lastName, Address address, int creditCardNumber) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
    }
    
    public Customer (int id, String firstName, String patronymic, String lastName, Address address, int creditCardNumber, int accountNumber) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.accountNumber = accountNumber;
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
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public int getCreditCardNumber() {
        return creditCardNumber;
    }
    
    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String toString() {
        return ("customer #" + getId() + " " + getFirstName() + " " + getPatronymic() + " " + getLastName());
    }
}
