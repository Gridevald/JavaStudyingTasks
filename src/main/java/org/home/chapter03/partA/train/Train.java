package org.home.chapter03.partA.train;

import java.time.LocalTime;

public class Train {
    
    private int trainID;
    
    private String destination;
    
    private LocalTime departureTime;
    
    private Seats seats;
    
    public Train(int trainID) {
        this.trainID = trainID;
    }
    
    public Train(int trainID, String destination) {
        this.trainID = trainID;
        this.destination = destination;
    }
    
    public Train(int trainID, String destination, LocalTime departureTime) {
        this.trainID = trainID;
        this.destination = destination;
        this.departureTime = departureTime;
    }
    
    public Train(int trainID, String destination, LocalTime departureTime, Seats seats) {
        this.trainID = trainID;
        this.destination = destination;
        this.departureTime = departureTime;
        this.seats = seats;
    }
    
    public int getTrainID() {
        return trainID;
    }
    
    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public LocalTime getDepartureTime() {
        return departureTime;
    }
    
    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
    
    public Seats getSeats() {
        return seats;
    }
    
    public void setSeats(Seats seats) {
        this.seats = seats;
    }
    
    @Override
    public String toString() {
        return ("train #" + getTrainID() + " (Dest.: " + getDestination() +
                ", Dep.Time: " + getDepartureTime().getHour() + ":" + getDepartureTime().getMinute() + ")");
    }
}
