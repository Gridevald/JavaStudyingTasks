package org.home.chapter11.examples.pool;

public class AudioChannel {

    private int channelId;
    
    public AudioChannel(int id) {
        super();
        setChannelId(id);
    }
    
    public int getChannelId() {
        return channelId;
    }
    
    public void setChannelId(int id) {
        this.channelId = id;
    }
    
    public void using() {
        try {
            Thread.sleep(new java.util.Random().nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
