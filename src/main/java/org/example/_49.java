package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.DoubleStream;

public class _49 {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"stop","pots","reed","","tops","deer","opts",""});
    }

    // String 넣으면 sort 진행
    public static String sort(String str) {
        char[] charArr = str.toCharArray(); // String to Char Array
        Arrays.sort(charArr); // Char Array 알파벳 순 정렬
        str = new String(charArr); // 또는 String.valueOf(charArr);

        return str;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new LinkedList<>();
        LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
        for(String str : strs) {
            String sortedStr = sort(str);
            if(!linkedHashMap.containsKey(sortedStr)){
                List<String> set = new LinkedList<>();
                set.add(str);
                linkedHashMap.put(sortedStr, set);
            }
            else {
                linkedHashMap.get(sortedStr).add(str);
            }
        }

        for(String key : linkedHashMap.keySet()) {
            resultList.add(linkedHashMap.get(key));
        }

        return resultList;
    }
}
