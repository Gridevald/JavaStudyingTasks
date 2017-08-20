package org.home.chapter12.partA.task02.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Man {
    
    @Id
    @GeneratedValue
    private int id;
    
    private String name;
    
    @Temporal(TemporalType.DATE)
    private Calendar birthDay;
    
    /**
     * Constructors
     */
    
    public Man() {
    }
    
    /**
     * Getters and Setters
     */
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Calendar getBirthDay() {
        return birthDay;
    }
    
    public void setBirthDay(Calendar birthDay) {
        this.birthDay = birthDay;
    }
}
