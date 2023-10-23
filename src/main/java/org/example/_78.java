package org.example;

import java.util.ArrayList;
import java.util.List;

class _78 {
    public static List<List<Integer>> result = null;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        result.add(List.of());
        List <Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            check(nums, i, list);
            list.remove(Integer.valueOf(nums[i]));
        }
        return result;
    }

    public static void check(int [] nums, int i, List <Integer> list) {
        for(int j=i+1; j<nums.length; j++) {
            list.add(nums[j]);
            result.add(new ArrayList<>(list));
            check(nums, j, list);
            list.remove(Integer.valueOf(nums[j]));
        }
    }
}