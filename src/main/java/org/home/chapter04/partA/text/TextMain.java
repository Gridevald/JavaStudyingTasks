package org.home.chapter04.partA.text;

import java.util.ArrayList;
import java.util.List;

public class TextMain {
    
    public static void main(String[] args) {
    
        Word w1 = new Word("Hey");
        Word w2 = new Word("there");
    
        Sentence s1 = new Sentence();
        s1.addWord(w1, "space");
        s1.addWord(w2, "dot");
//        System.out.println(s1);
    
        Sentence s2 = new Sentence();
        s2.addWord(w1, "space");
        s2.addWord(w2, "exclamation");
//        System.out.println(s2);
    
//        System.out.println(s1.equals(s2));
        
        Text text = new Text();
        text.addTitle(s1);
        text.addText(s1);
        text.addText(s2);
        text.addText(s1);
        text.addText(s2);
        text.addText(s1);
        text.addText(s2);
        System.out.println(text);
        System.out.println();
    
        List<Sentence> titleList = new ArrayList<>();
        titleList.add(s1);
        List<Sentence> textList = new ArrayList<>();
        textList.add(s1);
        textList.add(s2);
        textList.add(s1);
        textList.add(s2);
        textList.add(s1);
        textList.add(s2);
        Text text1 = new Text(titleList, textList);
        System.out.println(text1);
        System.out.println();
    
        System.out.println(text.hashCode());
        System.out.println(text1.hashCode());
        System.out.println(text.equals(text1));
    }
}
