package org.home.chapter03.partA.train;

import java.time.LocalTime;

public class TrainProcessor {
    
    public void destination(Train[] trains, String destination) {
    
        System.out.println("Trains follows to " + destination + ":");
        for (Train train : trains) {
            if (train.getDestination().equals(destination)) {
                System.out.println("- " + train);
            }
        }
        System.out.println();
    }
    
    public void destAndTime(Train[] trains, String destination, LocalTime departureTime) {
    
        System.out.println("Trains follows to " + destination + " after " + departureTime.getHour() + ":" + departureTime.getMinute() + " :");
        for (Train train : trains) {
            if (train.getDestination().equals(destination)) {
                if (train.getDepartureTime().getHour() > departureTime.getHour() ||
                        (train.getDepartureTime().getHour() == departureTime.getHour() &&
                                train.getDepartureTime().getMinute() > departureTime.getMinute())) {
                    System.out.println("- " + train);
                }
            }
        }
        System.out.println();
    }
    
    public void destAndCommonSeats(Train[] trains, String destination) {
    
        System.out.println("Trains follows to " + destination + " and has common seats:");
        for (Train train : trains) {
            if (train.getDestination().equals(destination) && train.getSeats().getCommon() > 0) {
                System.out.println("- " + train);
            }
        }
    }
}
