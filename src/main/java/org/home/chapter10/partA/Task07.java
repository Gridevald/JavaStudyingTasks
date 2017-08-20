package org.home.chapter10.partA;

import java.util.Stack;

/**
 * Swaps stacks elements.
 */
public class Task07 {

    public static void main(String[] args) {
        
        Stack<String> s1 = new Stack<String>() {
            {
                push("fHello");
                push("fMy");
                push("fDear");
                push("fFriend");
            }
        };
        
        Stack<String> s2 = new Stack<String>() {
            {
                push("sHello");
                push("sWorld");
            }
        };
    
        System.out.println(s1);
        System.out.println(s2);
        
        Task07 task = new Task07();
        task.swapStacks(s1, s2);
    
        System.out.println("After swap:");
        System.out.println(s1);
        System.out.println(s2);
    }
    
    public <T> void swapStacks(Stack<T> s1, Stack<T> s2) {
        Stack<T> temp1 = new Stack<>();
        Stack<T> temp2 = new Stack<>();
        
        //pop elements from input stacks to temporary
        //we will get 2 reversed stacks and empty input stacks
        while (!s1.empty()) {
            temp1.push(s1.pop());
        }
        while (!s2.empty()) {
            temp2.push(s2.pop());
        }
        //now swap temp stacks and push elements in input stacks
        while (!temp1.empty()) {
            s2.push(temp1.pop());
        }
        while (!temp2.empty()) {
            s1.push(temp2.pop());
        }
    }
}
