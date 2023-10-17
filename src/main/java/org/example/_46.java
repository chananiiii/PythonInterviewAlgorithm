package org.example;

import java.util.ArrayList;
import java.util.List;

class _46 {
    public static List <List<Integer>> result = null;
    public List<List<Integer>> permute(int[] nums) {
        int [] check = new int[nums.length];
        result = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            search(nums, check, i, String.valueOf(nums[i]));
        }

        return result;
    }

    public static void search(int [] nums, int [] check, int index, String str) {
        check[index] = 1;
        for(int i=0; i<check.length; i++) {
            if(check[i] != 1) {
                search(nums, check, i, str + " " + String.valueOf(nums[i]));
            }
        }
        check[index] = 0;

        if(List.of(str.split(" ")).stream().count() == check.length) {
            result.add((List.of(str.split(" "))).stream().map(a -> Integer.parseInt(a)).toList());
        }
    }
}