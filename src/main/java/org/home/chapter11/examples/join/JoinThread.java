package org.home.chapter11.examples.join;

public class JoinThread extends Thread {
    
    public JoinThread(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        String nameT = getName();
        long timeout = 0;
        System.out.println("Start of thread " + nameT);
        
        try {
            switch (nameT) {
                case "First" :
                    timeout = 5000;
                    break;
                case "Second" :
                    timeout = 1000;
                    break;
            }
            Thread.sleep(timeout);
            System.out.println("Finish of thread " + nameT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
