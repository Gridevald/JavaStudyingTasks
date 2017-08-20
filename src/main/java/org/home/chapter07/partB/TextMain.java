package org.home.chapter07.partB;

import org.home.chapter07.partB.text.*;

public class TextMain {
    
    public static void main(String[] args) {
        
        Symbol a = new Symbol('a');
        Symbol b = new Symbol('b');
        Symbol c = new Symbol('c');
        Symbol d = new Symbol('d');
        Symbol e = new Symbol('e');
        Symbol f = new Symbol('f');
        Symbol g = new Symbol('g');
        Symbol h = new Symbol('h');
        Symbol i = new Symbol('i');
        Symbol j = new Symbol('j');
        Symbol k = new Symbol('k');
        Symbol l = new Symbol('l');
        Symbol m = new Symbol('m');
        Symbol n = new Symbol('n');
        Symbol o = new Symbol('o');
        Symbol p = new Symbol('p');
        Symbol q = new Symbol('q');
        Symbol r = new Symbol('r');
        Symbol s = new Symbol('s');
        Symbol t = new Symbol('t');
        Symbol u = new Symbol('u');
        Symbol v = new Symbol('v');
        Symbol w = new Symbol('w');
        Symbol x = new Symbol('x');
        Symbol y = new Symbol('y');
        Symbol z = new Symbol('z');
        
        Punctuation dot = new Punctuation(new Symbol('.'));
        Punctuation comma = new Punctuation(new Symbol(','));
        Punctuation colon = new Punctuation(new Symbol(':'));
        Punctuation semicolon = new Punctuation(new Symbol(';'));
        Punctuation leftRoundBracket = new Punctuation(new Symbol('('));
        Punctuation rightRoundBracket = new Punctuation(new Symbol(')'));
        Punctuation quote = new Punctuation(new Symbol('"'));
        Punctuation exclamation = new Punctuation(new Symbol('!'));
        SpaceSymbol space = new SpaceSymbol();
        
        Word hello = new Word();
        hello.pushSymbol(new Symbol('H'));
        hello.pushSymbol(e);
        hello.pushSymbol(l);
        hello.pushSymbol(l);
        hello.pushSymbol(o);
        Word friend = new Word();
        friend.pushSymbol(f);
        friend.pushSymbol(r);
        friend.pushSymbol(i);
        friend.pushSymbol(e);
        friend.pushSymbol(n);
        friend.pushSymbol(d);
        
        Sentence s1 = new Sentence();
        s1.pushPart(hello);
        s1.pushPart(comma);
        s1.pushPart(space);
        s1.pushPart(friend);
        s1.pushPart(exclamation);
        
        Paragraph p1 = new Paragraph();
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
        p1.pushSentence(s1);
    
        Word system = new Word();
        system.pushSymbol(new Symbol('S'));
        system.pushSymbol(y);
        system.pushSymbol(s);
        system.pushSymbol(t);
        system.pushSymbol(e);
        system.pushSymbol(m);
        Word out = new Word();
        out.pushSymbol(o);
        out.pushSymbol(u);
        out.pushSymbol(t);
        Word  print = new Word();
        print.pushSymbol(p);
        print.pushSymbol(r);
        print.pushSymbol(i);
        print.pushSymbol(n);
        print.pushSymbol(t);
        
        Lexeme l1 = new Lexeme();
        l1.pushPart(system);
        l1.pushPart(dot);
        l1.pushPart(out);
        l1.pushPart(dot);
        l1.pushPart(print);
        l1.pushPart(leftRoundBracket);
        l1.pushPart(quote);
        l1.pushPart(hello);
        l1.pushPart(comma);
        l1.pushPart(space);
        l1.pushPart(friend);
        l1.pushPart(exclamation);
        l1.pushPart(quote);
        l1.pushPart(rightRoundBracket);
        l1.pushPart(semicolon);
        
        Listing li1 = new Listing();
        li1.pushSentence(l1);
        li1.pushSentence(l1);
        li1.pushSentence(l1);
        
        Text text = new Text();
        text.pushPart(p1);
        text.pushPart(li1);
    
        System.out.println(text);
    }
}
