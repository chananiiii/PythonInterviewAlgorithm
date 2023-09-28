package org.example;

import java.util.Stack;

public class _232{
    Stack<Integer> stack;
    public _232() {
        stack = new Stack<>();
    }

    public void push(int x) {
        Stack <Integer> tempStack = new Stack<>();
        while(!stack.isEmpty()) {
            tempStack.add(stack.pop());
        }
        stack.add(x);
        while(!tempStack.isEmpty()) {
            stack.add(tempStack.pop());
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
