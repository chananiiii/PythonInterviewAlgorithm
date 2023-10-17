package org.example;

import java.util.ArrayList;
import java.util.List;

class _77 {
    public static List <List<Integer>> result = null;
    public List<List<Integer>> combine(int n, int k) {
        int [] nums = new int[n];
        result = new ArrayList<>();
        for(int i=1; i<n+1; i++) {
            nums[i-1] = i;
        }
        int [] check = new int[n];
        for(int i=0; i<n; i++) {
            search(nums, check, i, String.valueOf(nums[i]), k);
        }

        return result;
    }

    public static void search(int [] nums, int [] check, int i, String str, int k) {
        if((List.of(str.split(" "))).stream().count() == k) {
            result.add((List.of(str.split(" "))).stream().map(a -> Integer.parseInt(a)).toList());
        }
        check[i] = 1;
        for(int j=i+1; j<nums.length; j++) {
            search(nums, check, j, str + " " + String.valueOf(nums[j]), k);
        }
        check[i] = 0;
    }
}