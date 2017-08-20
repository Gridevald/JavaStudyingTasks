package org.home.chapter12.partA.task01;

import java.util.Objects;

public class BasicFile {
    
    private String name;
    private String parentFolder;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getParentFolder() {
        return parentFolder;
    }
    
    public void setParentFolder(String parentFolder) {
        this.parentFolder = parentFolder;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BasicFile)) return false;
        BasicFile basicFile = (BasicFile) object;
        return Objects.equals(getName(), basicFile.getName()) &&
                Objects.equals(getParentFolder(), basicFile.getParentFolder());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getParentFolder());
    }
}
