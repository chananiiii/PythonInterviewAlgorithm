package org.example;

import java.util.*;

public class _819 {
    public static void main(String[] args) {

        mostCommonWord( "Bob. hIt, baLl", new String[]{"bob", "hit"});
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        // 소문자 진행, 특수문자 공백으로 대체
        // 정규식 [^a-z] 의미 : 알파벳이 아닌 모든 것
        // [^0-9] : 숫자가 아닌 모든 것
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        // 공백기준으로 split 진행
        List<String> targetList = Arrays.stream(paragraph.split(" ")).toList();
        List<String> banList = new LinkedList<>();
        for(String str : banned) {
            banList.add(str.toLowerCase());
        }
        HashMap<String, Integer> hashMap = new HashMap<>();


        Iterator<String> iterator = targetList.iterator();
        while(iterator.hasNext()) {
            String str = iterator.next();
            // str 이 banned 에 포함되어 있지 않으면, 특수문자가 연이어 나올 경우 빈 값이 들어가있기 때문에 "" 제외
            if (!banList.contains(str) && !str.equals("")) {
                if (hashMap.containsKey(str)) {
                    hashMap.put(str, hashMap.get(str) + 1);
                } else {
                    hashMap.put(str, 1);
                }
            }
        }

        int max = 0;
        for(String key : hashMap.keySet()) {
            if(hashMap.get(key) > max) {
                paragraph = key;
                max = hashMap.get(key);
            }
        }

        return paragraph;
    }
}
