package org.example;

import java.util.ArrayList;
import java.util.List;

class _17 {
    public static ArrayList<String> resultList;
    public List<String> letterCombinations(String digits) {
        resultList = new ArrayList<>();

        if(digits.equals("")) {

        }
        else {
            backtracking(digits, "");
        }
        return resultList;
    }
    public static void backtracking(String digits, String str) {
        if(digits.length() == 0) {
            resultList.add(str);
        }
        else {
            String target = alpha(Integer.parseInt(digits.substring(0, 1)));

            for(int i=0; i<target.length(); i++) {
                backtracking(digits.substring(1), str + target.substring(i, i+1));
            }

        }
    }


    public static String alpha(int number) {
        if(number == 2) {
            return "abc";
        }
        else if(number == 3){
            return "def";
        }
        else if(number == 4){
            return "ghi";
        }
        else if(number == 5){
            return "jkl";
        }
        else if(number == 6){
            return "mno";
        }
        else if(number == 7){
            return "pqrs";
        }
        else if(number == 8){
            return "tuv";
        }
        else if(number == 9){
            return "wxyz";
        }

        return "";
    }
}