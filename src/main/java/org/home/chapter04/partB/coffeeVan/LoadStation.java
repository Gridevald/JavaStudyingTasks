package org.home.chapter04.partB.coffeeVan;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.*;

public class LoadStation {
    
    public static void main(String[] args) {
        
        Coffee coffee1 = new Coffee(CoffeeBrand.ARABICA, CoffeeCondition.GROUND);
        Coffee coffee2 = new Coffee(CoffeeBrand.ROBUSTA, CoffeeCondition.BEAN);
        Coffee coffee3 = new Coffee(CoffeeBrand.ARABICA, CoffeeCondition.BEAN);
        Coffee coffee4 = new Coffee(CoffeeBrand.ROBUSTA, CoffeeCondition.INSTANT);
        Package pack1 = new Package(coffee1, PackageTare.PACK, PackageMass.BIG);
        Package pack2 = new Package(coffee3, PackageTare.PACK, PackageMass.XL);
        Package pack3 = new Package(coffee2, PackageTare.CAN, PackageMass.XL);
        Package pack4 = new Package(coffee4, PackageTare.CAN, PackageMass.SMALL);
        Package pack5 = new Package(coffee4, PackageTare.PACK, PackageMass.MIDDLE);
        
        List<Package> packages = new ArrayList<>();
        packages.add(pack1);
        packages.add(pack2);
        packages.add(pack3);
        packages.add(pack4);
        packages.add(pack5);
    
        LoadStation loadStation = new LoadStation();
        loadStation.sortMassPrice(packages);
        
        System.out.println("We have next coffee packages: ");
        Format format = new DecimalFormat("###.##");
        for (Package p : packages) {
            double temp = p.getMass().getMass() / p.price();
            System.out.println(" - "+ p + " (price - " + p.price() + ", M/P = " + format.format(temp) + ")");
        }
        System.out.println();
    

        System.out.println("Best ratio mass/price");
        
    
        Van van = new Van();
        double sum = 0;
        
        //Console menu
        Scanner sc = new Scanner(System.in);

        while (van.getMass() == 0) {
            System.out.print("Enter mass value: ");
            double temp = new Double(sc.next());
            if (temp > 0) {
                van.setMass(temp);
            } else {
                System.out.println("Wrong value!");
            }
        }
        while (sum == 0) {
            System.out.print("Enter sum value: ");
            double temp = new Double(sc.next());
            if (temp > 0) {
                sum = temp;
            } else {
                System.out.println("Wrong value!");
            }
        }

        loadStation.load(van, packages, sum);
        System.out.println(van);
    }
    
    public void load(Van van, List<Package> packageList, double sum) {
        Package small = packageList.get(0);
        Package chip = packageList.get(0);
        for (Package p : packageList) {
            if (p.getMass().getMass() < small.getMass().getMass()) {
                small = p;
            }
            if (p.price() < chip.price()) {
                chip = p;
            }
        }
        double sumRest = sum;
        double massRest = van.getMass();
        while (sumRest >= chip.price() && massRest >= small.getMass().getMass()) {
            for (Package p : packageList) {
                if (sumRest >= p.price() && massRest >= p.getMass().getMass()) {
                    van.add(p);
                    sumRest -= p.price();
                    massRest -= p.getMass().getMass();
                }
            }
        }
    }
    
    public void sortMassPrice(List<Package> packageList) {
        Collections.sort(packageList, new Comparator<Package>() {
            @Override
            public int compare(Package o1, Package o2) {
                int temp;
                double mp1 = o1.getMass().getMass()/o1.price();
                double mp2 = o2.getMass().getMass()/o2.price();
                if (mp1 == mp2) {
                    temp = 0;
                } else {
                    if (mp1 < mp2) {
                        temp = 1;
                    } else {
                        temp = -1;
                    }
                }
                return temp;
            }
        });
    }
}
