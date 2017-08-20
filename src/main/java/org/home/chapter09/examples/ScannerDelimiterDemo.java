package org.home.chapter09.examples;

import java.util.Locale;
import java.util.Scanner;

public class ScannerDelimiterDemo {
    
    public static void main(String[] args) {
        double sum = 0;
        Scanner scan = new Scanner("1,3;2,0; 8,5; 4,8;9,0; 1; 10;");
//        scan.useLocale(Locale.FRANCE);
        scan.useLocale(Locale.US);
        scan.useDelimiter(";\\s*");
        while (scan.hasNext()) {
            if (scan.hasNextDouble()) {
                sum += scan.nextDouble();
            } else {
                System.out.println(scan.next());
            }
        }
        scan.close();
        System.out.println("Sum is " + sum);
    }
}
