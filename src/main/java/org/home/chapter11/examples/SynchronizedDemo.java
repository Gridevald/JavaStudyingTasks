package org.home.chapter11.examples;

public class SynchronizedDemo {
    
    public static void main(String[] args) throws InterruptedException{
    
        StringBuilder sb = new StringBuilder();
//        StringBuffer sb = new StringBuffer();
        
        new Thread(() -> {
            synchronized (sb) {
                for (int i = 0; i < 5; i++) {
                    sb.append("1");
                }
            }
        }).start();
        
        Thread.sleep(100);
        for (int i = 0; i < 5; i++) {
            sb.append("2");
        }
    
//        new Thread(() -> {
//            synchronized (sb) {
//                for (int i = 0; i < 5; i++) {
//                    sb.append("2");
//                }
//            }
//        }).start();
        
        Thread.sleep(1_000);
        System.out.println(sb);
    }
}
