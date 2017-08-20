package org.home.chapter03.enumPractice;

public class EnumMain {
    
    public static void main(String[] args) {
        
        MusicStyle ms = MusicStyle.METAL;
        System.out.print(ms);
        switch (ms) {
            case CLASSIC:
                System.out.println(" is Classic");
                break;
            case ROCK:
                System.out.println(" is Rock");
                break;
            case METAL:
                System.out.println(" is Metal");
                break;
            case JAZZ:
                System.out.println(" is Jazz");
                break;
            default:
                System.out.println("Unknown music style");
        }
        Enum[] asd = MusicStyle.values();
        System.out.println("Enum MusicStyle: ");
        for (Enum i : asd) {
            System.out.println("- " + i);
        }
        
        double x = 2, y = 3;
        Shape shape;
        shape = Shape.RECTANGLE;
        System.out.printf("%10s = %5.2f%n", shape, shape.defineSquare(x, y));
        shape = Shape.TRIANGLE;
        System.out.printf("%10s = %5.2f%n", shape, shape.defineSquare(x, y));
        shape = Shape.CIRCLE;
        System.out.printf("%10s = %5.2f%n", shape, shape.defineSquare(x, y));
        
        TaxiStation ts = TaxiStation.valueOf(TaxiStation.class, "Audi".toUpperCase());
        System.out.println(ts + " ordinal -> " + ts.ordinal());
        ts.setFreeCabs(3);
        System.out.println(ts);
        ts.add();
        System.out.println(ts);
        TaxiStation[] station = TaxiStation.values();
        for (Enum i : station) {
            System.out.println(i);
        }
    }
}
