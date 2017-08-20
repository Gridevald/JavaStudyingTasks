package org.home.chapter04.partB.flowerShop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FlowerShop {
    
    public static void main(String[] args) {
        
        Bouquet bouquet = new Bouquet();
        
        //Reading flowers from file
        try {
            Scanner sc = new Scanner(new File("src/main/java/org/home/chapter04/partB/flowerShop/resources/flowers.txt"));
            while (sc.hasNextLine()) {
                Flower temp = new Flower(sc.next(), sc.next());
                temp.setLength(sc.nextInt());
                temp.setPrice(new Double(sc.next()));
                temp.setDate(new GregorianCalendar(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                bouquet.addFlower(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Flowers not found");
        }
        //Reading accessories from file
        try {
            Scanner sc = new Scanner((new File("src/main/java/org/home/chapter04/partB/flowerShop/resources/accessories.txt")));
            while (sc.hasNextLine()) {
                Accessory temp = new Accessory(sc.next(), sc.next(), sc.next(), new Double(sc.next()));
                bouquet.addAccessory(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Accessories not found");
        }
    
        System.out.println(bouquet);
        
        //Console menu
        while (true) {
            System.out.print("Enter your command (sort, price, findFile): ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case ("sort"):
                    bouquet.sortDate();
                    System.out.println("Flowers sorted by freshness (starts with most fresh):");
                    for (Flower f : bouquet.getFlowers()) {
                        System.out.println(" - " + f);
                    }
                    break;
                case ("price"):
                    System.out.println("Sum price of bouquet is " + bouquet.price() + " BYN");
                    break;
                case ("findFile"):
                    System.out.println("Enter interval of length (int positive number)");
                    System.out.print("MIN length: ");
                    int min = new Integer(sc.next());
                    System.out.print("MAX length: ");
                    int max = new Integer(sc.next());
                    bouquet.findLength(min, max);
                    break;
                default:
                    System.out.println("Wrong command...");
            }
            System.out.println();
        }
    }
}
