package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
// 정렬용 Hash Class 생성
class Hash {
    int a;
    int b;
    Hash (int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class _347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Hash> arrayList = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            // 모든 nums 를 탐색하여, 총 몇번 나왔는지 hashMap에 넣어주는 작업 진행.
            if(hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            }
            else {
                hashMap.put(nums[i], 1);
            }
        }

        // 그렇게 나온 hashMap의 전부를 arrayList.add 를 통해 list 로 넣는다.
        for (Integer key : hashMap.keySet()) {
            arrayList.add(new Hash(key, hashMap.get(key)));
        }

        int [] result = new int[k];
        // arrayList 를 b(총 몇번나왔는지 담는 변수)를 기준으로 정렬 진행(역순)
        Collections.sort(arrayList, (a, b) -> {
            return b.b-a.b;
        });
        // k 번 반복을 진행하며, 결과값에 a값 넣기.
        for(int i=0; i<k; i++) {
            result[i] = (arrayList.get(i)).a;
        }

        return result;
    }
}