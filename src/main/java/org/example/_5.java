package org.example;

import java.util.LinkedList;

public class _5 {
    public static void main(String[] args) {
        longestPalindrome("babad");
    }

    public static LinkedList <String> memoization = new LinkedList<>();
    public static String longestPalindrome(String s) {
        // babad
        // cbbdd
        logic(s, "", 0);


        return s;
    }

    public static void logic(String s, String presentStr, int seq) {
        if(s.length()-1 == seq) {
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            presentStr += s.substring(i, i+1);
        }
    }

    public static boolean isPalindrome(String s) {
        for(int i=0; i<s.length()/2; i++) {
            if (s.substring(i, i + 1).equals(s.substring(s.length() - i - 1))) {

            } else {
                return false;
            }
        }

        return true;
    }
}
