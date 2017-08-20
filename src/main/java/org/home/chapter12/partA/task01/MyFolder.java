package org.home.chapter12.partA.task01;

public class MyFolder extends BasicFile{
    
    public MyFolder(String name) {
        setName(name);
    }
    
    public MyFolder(String name, String parentFolder) {
        setName(name);
        setParentFolder(parentFolder);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
