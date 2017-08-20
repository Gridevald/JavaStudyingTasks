package org.home.chapter06.publication;

import java.util.Collections;
import java.util.Comparator;

public class Directory extends Book{
    
    public Directory() {
        super();
    }
    
    public Directory(int id, String title) {
        super(id, title);
    }
    
    @Override
    public void addText(String value) {
        super.addText(value);
        sort();
    }
    
    private void sort() {
        Collections.sort(getText(), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book #").append(getId()).append("\n");
        sb.append(getTitle()).append("\n");
        int count = 0;
        for (String s : getText()) {
            sb.append("#").append(count++).append(" - ").append(s).append("\n");
        }
        return sb.toString();
    }
}
