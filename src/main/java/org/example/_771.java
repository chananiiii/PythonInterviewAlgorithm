package org.example;

import java.util.HashMap;

public class _771 {
}

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<stones.length(); i++) {
            if (!hashMap.containsKey(stones.charAt(i))) {
                hashMap.put(stones.charAt(i), 1);
            } else {
                hashMap.put(stones.charAt(i), hashMap.get(stones.charAt(i)) + 1);
            }
        }
        int result = 0;
        for(int i=0; i<jewels.length(); i++) {
            if(hashMap.containsKey(jewels.charAt(i))) {
                result += hashMap.get(jewels.charAt(i));
            }
        }
        return result;
    }
}