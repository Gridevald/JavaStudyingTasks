package org.home.chapter12.partA.task01;

import java.util.Objects;

public class MyFile extends BasicFile{
    
    private int size;
    
    public MyFile(String name, String parentFolder, int size) {
        setName(name);
        setParentFolder(parentFolder);
        setSize(size);
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object == null) return false;
        if (object.getClass() != getClass()) return false;
        MyFile mf = (MyFile) object;
        return Objects.equals(getName(), mf.getName()) &&
                Objects.equals(getParentFolder(), mf.getParentFolder()) &&
                Objects.equals(getSize(), mf.getSize());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getParentFolder(), getSize());
    }
}
