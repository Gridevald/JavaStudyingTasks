package org.home.chapter08.partB.soundRecord;

import java.util.Objects;

public class Vocalist {

    private String name;
    
    private String voice;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getVoice() {
        return voice;
    }
    
    public void setVoice(String voice) {
        this.voice = voice;
    }
    
    @Override
    public String toString() {
        return "Vocalist{" +
                "name='" + name + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Vocalist)) return false;
        Vocalist vocalist = (Vocalist) object;
        return Objects.equals(getName(), vocalist.getName()) &&
                Objects.equals(getVoice(), vocalist.getVoice());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getVoice());
    }
}
