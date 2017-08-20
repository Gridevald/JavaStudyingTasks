package org.home.chapter05.payment;

public class PaymentMain {
    
    public static void main(String[] args) {
        
        Payment payment = new Payment();
        Payment.Thing thing = new Payment().new Thing(1, "Car", 50);
        payment.addThing(thing);
        payment.addThing(new Payment().new Thing(2, "Doll", 30));
        System.out.println(payment);
    }
}
