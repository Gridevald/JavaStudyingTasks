package org.home.chapter04.partA.automobile;

public class Wheel {
    
    private String tireModel;
    
    private String tireMarking;
    
    private int diskDiameter;
    
    public Wheel(int diskDiameter, String tireModel, String tireMarking) {
        this.diskDiameter = diskDiameter;
        this.tireModel = tireModel;
        this.tireMarking = tireMarking;
    }
    
    public String getTireModel() {
        return tireModel;
    }

    public String getTireMarking() {
        return tireMarking;
    }

    public int getDiskDiameter() {
        return diskDiameter;
    }
    
    @Override
    public String toString() {
        return "Wheel: disk diameter " + diskDiameter + "'', tire " + tireModel + " " + tireMarking + ".";
    }
    
    @Override
    public int hashCode() {
        return 3 * diskDiameter + tireModel.hashCode() + tireMarking.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Wheel w = (Wheel) obj;
        if (diskDiameter != w.diskDiameter) {
            return false;
        }
        if (!tireModel.equals(w.tireModel)) {
            return false;
        }
        if (!tireMarking.equals(w.tireMarking)) {
            return false;
        }
        return true;
    }
}
