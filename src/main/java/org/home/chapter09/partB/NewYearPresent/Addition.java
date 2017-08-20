package org.home.chapter09.partB.NewYearPresent;

import java.io.Serializable;
import java.util.Objects;

public class Addition implements Serializable{
    
    private AdditionType additionType;
    
    private double mas;
    
    public Addition() {
    }
    
    public Addition(AdditionType additionType, double mas) {
        setAdditionType(additionType);
        setMas(mas);
    }
    
    public AdditionType getAdditionType() {
        return additionType;
    }
    
    public void setAdditionType(AdditionType additionType) {
        this.additionType = additionType;
    }
    
    public double getMas() {
        return mas;
    }
    
    public void setMas(double mas) {
        this.mas = mas;
    }
    
    @Override
    public String toString() {
        return "Addition{" +
                "additionType=" + additionType +
                ", mas=" + mas +
                '}';
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Addition)) return false;
        Addition addition = (Addition) object;
        return Double.compare(addition.getMas(), getMas()) == 0 &&
                getAdditionType() == addition.getAdditionType();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getAdditionType(), getMas());
    }
}
