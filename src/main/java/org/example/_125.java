package org.example;

import java.util.ArrayList;
import java.util.List;

public class _125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        // business logic
        // 공백제거
        s.replace(" ", "");

        List<String> list = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                list.add(s.substring(i, i+1).toLowerCase());
            }
        }

        while(!list.isEmpty()) {
            if(list.size() == 1) {
                return true;
            }

            if(list.get(0).equals(list.get((list.size()-1)))) {
                list.remove(0);
                list.remove(list.size()-1);
            }
            else {
                break;
            }
        }

        if(list.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
