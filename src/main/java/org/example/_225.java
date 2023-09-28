package org.example;

import java.util.LinkedList;
import java.util.List;

public class _225 {
    List<Integer> list;
    public _225() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int a = list.get(list.size()-1);
        list.remove(list.size()-1);
        return a;
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public boolean empty() {
        if(list.size() == 0){
            return true;
        }
        return false;
    }

}
