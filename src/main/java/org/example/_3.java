package org.example;

import java.util.HashMap;

public class _3 {
    public int lengthOfLongestSubstring(String s) {

        int prev = 0;
        int idx = 0;
        int max = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();

        while(idx < s.length()) {
            String str = s.substring(idx, idx+1);
            if(!hashMap.containsKey(str)) {
                hashMap.put(str, 1);
                max = Math.max(max, hashMap.size());
                idx ++;
            }
            else {
                hashMap.remove(s.substring(prev, prev+1));
                prev++;
            }
        }
        return max;
    }
}
