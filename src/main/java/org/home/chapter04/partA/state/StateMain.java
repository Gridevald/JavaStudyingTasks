package org.home.chapter04.partA.state;

public class StateMain {
    
    public static void main(String[] args) {
    
        City city1 = new City("Minsk");
        City city2 = new City("Senica");
        City city3 = new City("Slootsk");
        City city4 = new City("Golchichi");
        District district1 = new District("Minskiy");
        district1.addCity(city1);
        district1.addCity(city2);
        district1.setDistrictCenter(city1);
        district1.setSquare(1902);
        District district2 = new District("Slootskiy");
        district2.addCity(city3);
        district2.addCity(city4);
        district2.setDistrictCenter(city3);
        district2.setSquare(1821);
        Region region1 = new Region("Minskaya obl.");
        region1.addDistrict(district1);
        region1.addDistrict(district2);
        region1.setRegionCenter(city1);
        
        City city5 = new City("Mogilev");
        City city6 = new City("Voshod");
        City city7 = new City("Bobruysk");
        City city8 = new City("Vishnevka");
        District district3 = new District("Mogilevskiy");
        district3.addCity(city5);
        district3.addCity(city6);
        district3.setDistrictCenter(city5);
        district3.setSquare(1895);
        District district4 = new District("Bobruyskiy");
        district4.addCity(city7);
        district4.addCity(city8);
        district4.setDistrictCenter(city7);
        district4.setSquare(1599);
        Region region2 = new Region("Mogilevskaya obl.");
        region2.addDistrict(district3);
        region2.addDistrict(district4);
        region2.setRegionCenter(city5);
        
        State state = new State("Belarus");
        state.addRegion(region1);
        state.addRegion(region2);
        state.setCapital(city1);
    
        System.out.println(state);
        System.out.println("Number of rigions: " + state.getRegions().size());
        System.out.println("Square of state is " + state.square() + " skm.");
        System.out.println("Region centers: ");
        for (Region r : state.getRegions()) {
            System.out.println(" - " + r.getRegionCenter() + ";");
        }
    }
}
