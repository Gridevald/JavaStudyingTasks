package org.home.chapter03.partA.customer;

import org.home.chapter03.partA.Address;

public class CustomerMain {
    
    public static void main(String[] args) {
        
        Customer customer00 = new Customer(1000,
                "Pavel",
                "Ivanovich",
                "Yudzitski",
                new Address("Belarus",
                        "Minsk",
                        "Yana Chechota",
                        "7",
                        "71"),
                10101010,
                12341234);
        
        Customer customer01 = new Customer(1001,
                "Eugene",
                "Ivanovich",
                "Yudzitski",
                new Address("USA",
                        "New York"),
                21231230,
                34134123);
        
        Customer customer02 = new Customer(1002,
                "Pavel",
                "Petrovich",
                "Sadovski",
                new Address("Belarus",
                        "Borisov"),
                912384723,
                64371283);
        
        Customer customer03 = new Customer(1003,
                "Yulia",
                "",
                "Plevako",
                new Address("India",
                        "Pune"),
                81728374,
                72847361);
        
        Customer[] customers = new Customer[4];
        customers[0] = customer00;
        customers[1] = customer01;
        customers[2] = customer02;
        customers[3] = customer03;
        
        CustomerProcessor processor = new CustomerProcessor();
        processor.customersAlphabet(customers);
        processor.creditCardInterval(customers, 10000000, 40000000);
    }
}
