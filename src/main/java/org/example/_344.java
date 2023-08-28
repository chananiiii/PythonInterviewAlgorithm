package org.example;

import java.util.LinkedList;

public class _344 {
    public static void main(String[] args) {

    }
    public static void reverseString(char[] s) {
        LinkedList<Character> list = new LinkedList<>();
        for(char temp : s) {
            list.add(temp);
        }

        for(int i=0; i<list.size(); i++) {
            s[i] = list.get(i);
        }
    }
}