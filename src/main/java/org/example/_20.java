package org.example;

import java.util.Stack;

public class _20 {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        boolean result = true;
        for(int i=0; i<s.length(); i++) {
            if(stack.size() == 0) {
                stack.add(s.substring(i, i+1));
            }
            else {
                String a = s.substring(i, i+1);
                String b = stack.pop();
                if(a.equals(")") && b.equals("(")) {

                }
                else if(a.equals("]") && b.equals("[")) {

                }
                else if(a.equals("}") && b.equals("{")) {

                }
                else {
                    stack.add(b);
                    stack.add(a);
                }
            }
        }
        if(stack.size() > 0) {
            result = false;
        }

        return result;
    }
}
