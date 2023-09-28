package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int[temperatures.length];
        List<String> tempAndIndex = new ArrayList<>();
        for(int i=0; i<temperatures.length; i++) {
            tempAndIndex.add(temperatures[i] + " " + i);
        }
        Stack<String> stack = new Stack<>();
        for(int i=0; i<tempAndIndex.size(); i++) {
            if(stack.isEmpty()) {
                stack.add(tempAndIndex.get(i));
            }
            else {
                while(!stack.isEmpty()) {
                    String [] a = (stack.pop()).split(" ");
                    String [] b = tempAndIndex.get(i).split(" ");
                    int num1 = Integer.parseInt(a[0]);
                    int num2 = Integer.parseInt(b[0]);
                    int index1 = Integer.parseInt(a[1]);
                    int index2 = Integer.parseInt(b[1]);

                    if(num1 < num2) {
                        result[index1] = index2 - index1;
                    }
                    else {
                        stack.add(a[0] + " " + a[1]);
                        stack.add(b[0] + " " + b[1]);
                        break;
                    }
                }
                if(stack.isEmpty()) {
                    String [] a = tempAndIndex.get(i).split(" ");
                    stack.add(a[0] + " " + a[1]);
                }
            }

        }
        return result;
    }
}
