package org.home.chapter11.examples.join;

public class YieldRunner {
    
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("Start of thread 1");
                Thread.yield();
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("Finish of thread 1");
            }
        }.start();
        
        new Thread(() -> {
            System.out.println("Start of thread 2");
            System.out.println("Finish of thread 2");
        }).start();
    }
}
