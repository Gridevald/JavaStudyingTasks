package org.home.chapter03.partA;

public class Address {
    
    private String country;
    
    private String city;
    
    private String street;
    
    private String building;
    
    private String apartments;
    
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getBuilding() {
        return building;
    }
    
    public void setBuilding(String building) {
        this.building = building;
    }
    
    public String getApartments() {
        return apartments;
    }
    
    public void setApartments(String apartments) {
        this.apartments = apartments;
    }
    
    public Address() {
        
    }
    
    public Address(String country) {
        this.country = country;
    }
    
    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }
    
    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }
    
    public Address(String country, String city, String street, String building) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
    }
    
    public Address(String country, String city, String street, String building, String apartments) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartments = apartments;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Address:\n");
        builder.append("- Country: " + this.getCountry() + "\n");
        builder.append("- City: " + this.getCity() + "\n");
        builder.append("- Street: " + this.getStreet() + "\n");
        builder.append("- Building: " + this.getBuilding() + "\n");
        builder.append("- Apartments: " + this.getApartments() + "\n");
        
        return builder.toString();
    }
}
