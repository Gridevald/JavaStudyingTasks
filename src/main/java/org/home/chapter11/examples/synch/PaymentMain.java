package org.home.chapter11.examples.synch;

public class PaymentMain {
    
    public static void main(String[] args) throws InterruptedException{
        final Payment payment = new Payment();
        
        new Thread(payment::doPayment).start();
        
        Thread.sleep(200);
        
        synchronized (payment) {
            System.out.println("Init amount:");
            payment.initAmount();
            payment.notifyAll();
        }
        
        synchronized (payment) {
            payment.wait(1_000);
            System.out.println("OK.");
        }
    }
}
