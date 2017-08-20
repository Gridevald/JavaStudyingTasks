package org.home.chapter04.partA.automobile;

public class AutoMain {
    
    public static void main(String[] args) {
        
        Engine engine = new Engine("Ferrari V10", "petrol", 5.2);
//        System.out.println(engine);
        
        Wheel wheel = new Wheel(19, "Michlen", "215/60 R19");
//        System.out.println(wheel);
        
        Automobile auto = new Automobile("Ferrari F430", engine, wheel, 4);
        System.out.println(auto);
        
        Automobile auto1 = new Automobile("Ferrari F430", engine, wheel, 4);
    
        System.out.println(auto.equals(auto1));
        System.out.println(auto.hashCode() + " " + auto1.hashCode());
        System.out.println();
        
        auto.drive();
        auto.stop();
        auto.addFuel();
        auto.showCarModel();
    }
}
