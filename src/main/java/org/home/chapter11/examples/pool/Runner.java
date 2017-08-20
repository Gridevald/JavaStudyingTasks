package org.home.chapter11.examples.pool;

import java.util.LinkedList;

public class Runner {
    
    public static void main(String[] args) throws InterruptedException{
    
        LinkedList<AudioChannel> list = new LinkedList<AudioChannel>() {
            {
                add(new AudioChannel(771));
                add(new AudioChannel(654));
                add(new AudioChannel(831));
                add(new AudioChannel(100));
                add(new AudioChannel(999));
            }
        };
        
        ChannelPool<AudioChannel> pool = new ChannelPool<>(list);
        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
            Thread.sleep(50);
        }
    }
}
