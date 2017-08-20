package org.home.chapter03.partA.train;

import java.time.LocalTime;

public class TrainMain {
    
    public static void main(String[] args) {
        
        Train[] trains = new Train[5];
        
        Train train00 = new Train(28);
        train00.setDestination("Slootsk");
        train00.setDepartureTime(LocalTime.of(13, 18));
        train00.setSeats(new Seats(15, 10, 4, 2));
    
        Train train01 = new Train(23);
        train01.setDestination("Slootsk");
        train01.setDepartureTime(LocalTime.of(12, 15));
        train01.setSeats(new Seats(15, 10, 4, 2));
    
        Train train02 = new Train(18);
        train02.setDestination("Minsk");
        train02.setDepartureTime(LocalTime.of(8, 18));
        train02.setSeats(new Seats(0, 10, 4, 2));
    
        Train train03 = new Train(35);
        train03.setDestination("Minsk");
        train03.setDepartureTime(LocalTime.of(10, 52));
        train03.setSeats(new Seats(15, 10, 4, 2));
    
        Train train04 = new Train(99);
        train04.setDestination("Slootsk");
        train04.setDepartureTime(LocalTime.of(23, 15));
        train04.setSeats(new Seats(0, 10, 4, 2));
        
        trains[0] = train00;
        trains[1] = train01;
        trains[2] = train02;
        trains[3] = train03;
        trains[4] = train04;
        
        TrainProcessor processor = new TrainProcessor();
        processor.destination(trains, "Minsk");
        processor.destination(trains, "Slootsk");
        
        processor.destAndTime(trains, "Slootsk", LocalTime.of(13, 15));
        processor.destAndTime(trains, "Minsk", LocalTime.of(9, 15));
        
        processor.destAndCommonSeats(trains, "Slootsk");
    }
}
