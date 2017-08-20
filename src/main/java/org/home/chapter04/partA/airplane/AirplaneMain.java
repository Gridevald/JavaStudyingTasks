package org.home.chapter04.partA.airplane;

public class AirplaneMain {
    
    public static void main(String[] args) {
        
        Chassis c = new Chassis(2768, 618);
//        System.out.println(c);
        
        Wing w = new Wing(25771, 2115);
//        System.out.println(w);
        
        Engine e = new Engine(3289, 2990);
//        System.out.println(e);
        
        Airplane airplane = new Airplane("YPI Maxi", e, 6, w, 2, c, 8);
        airplane.setRoute("Minsk", "New-York");
//        airplane.fly();
    
        System.out.println(airplane);
        System.out.println(airplane.hashCode());
    
        Airplane airplane1 = new Airplane("YPI Maxi", e, 6, w, 2, c, 8);
        airplane1.setRoute("Minsk", "New-York");
    
        System.out.println(airplane1);
        System.out.println(airplane1.hashCode());
    
        System.out.println(airplane.equals(airplane1));
    }
}
