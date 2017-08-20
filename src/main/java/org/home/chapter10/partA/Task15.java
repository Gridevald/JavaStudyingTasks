package org.home.chapter10.partA;

import java.util.Stack;

/**
 *
 */
public class Task15 {
    
    public static void main(String[] args) {
        String line1 = "({[][()]})";
        String line2 = "}({[][()]})";
        String line3 = "(({[][()]})";
        String line4 = "({[][()]}))";
        String line5 = "()[]{}";
        Task15 t = new Task15();
        System.out.println(t.findOut(line1));
        System.out.println(t.findOut(line2));
        System.out.println(t.findOut(line3));
        System.out.println(t.findOut(line4));
        System.out.println(t.findOut(line5));
    }
    
    public boolean findOut(String line) {
        Stack<Character> chars = new Stack<>();
        for (char c : line.toCharArray()) {
            if (c == '(' || c == '[' || c =='{') {
                chars.push(c);
            } else {
                if (c == ')' || c == ']' || c == '}') {
                    if (chars.size() == 0) {
                        return false;
                    }
                    char temp = 0;
                    switch (c) {
                        case ')' :
                            temp = '(';
                            break;
                        case ']' :
                            temp = '[';
                            break;
                        case '}' :
                            temp = '{';
                            break;
                    }
                    if (temp == chars.peek()) {
                        chars.pop();
                    } else {
                        return false;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        if (chars.size() > 0) {
            return false;
        }
        return true;
    }
}
