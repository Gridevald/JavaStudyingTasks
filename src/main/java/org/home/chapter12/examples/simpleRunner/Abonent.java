package org.home.chapter12.examples.simpleRunner;

public class Abonent extends Entity {

    private int phone;
    private String lastName;
    
    public Abonent() {
    }
    
    public Abonent(int id, String lastName, int phone) {
        super(id);
        setLastName(lastName);
        setPhone(phone);
    }
    
    public int getPhone() {
        return phone;
    }
    
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString() {
        return "ID:" + getId() + ", LastName:" + lastName + ", Phone:" + phone;
    }
}
