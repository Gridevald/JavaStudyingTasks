package org.home.chapter03.partA.customer;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerProcessor {
    
    public void customersAlphabet(Customer[] customers) {
        
        Arrays.sort(customers, new Comparator<Customer>() {
            public int compare(Customer o1, Customer o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    
        System.out.println("Customers in alphabet order:");
        for (Customer cs : customers) {
            System.out.println("- " + cs);
        }
        System.out.println();
    }
    
    public void creditCardInterval(Customer[] customers, int lowBound, int highBound) {
    
        System.out.println("Customers with Credit Card number between " + lowBound + " and " + highBound + " :");
        for (Customer cs : customers) {
            if (cs.getCreditCardNumber() > lowBound && cs.getCreditCardNumber() < highBound) {
                System.out.println("- " + cs + " (CCN: " + cs.getCreditCardNumber() + ")    ");
            }
        }
        System.out.println();
    }
}
