package org.example;

import java.util.*;

public class _5 {
    public static String result = "";
    public static int max = 0;

    public static void main(String[] args) {
        longestPalindrome("aacabdkacaa");
    }

    public static String longestPalindrome(String s) {
        result = "";
        max = 0;

        // 각각의 index 에서 확장 진행
        for(int i=0; i<s.length(); i++) {
            expand(s, i, i);
        }
        
        return result;
    }

    public static void expand(String s, int left, int right) {
        if (max < right+1 - left) {
            max = right+1 - left;
            result = s.substring(left, right+1);
        }
        // 값이 같을때, 좌, 우측으로 각각 확장시도 
        // 홀수갯수시작
        if(left == right) {
            // 좌측으로 확장시도
            if (left-1 > -1) {
                // 좌측으로 확장 될 값이랑, 우측 비교 후 확장 진행
                if (s.substring(left-1, left).equals(s.substring(right, right+1))) {
                    expand(s, left-1, right);
                }
            }
            // 우측으로 확장시도
            if (right+1 < s.length()) {
                if (s.substring(left, left+1).equals(s.substring(right+1, right+2))) {
                    expand(s, left, right+1);
                }
            }
        }
        // 짝수갯수 시작
        // 양쪽으로 확장시도
        if (left-1 > -1 && right+1 < s.length()) {
            if (s.substring(left-1, left).equals(s.substring(right+1, right+2))) {
                expand(s, left-1, right+1);
            }
        }
    }
}
