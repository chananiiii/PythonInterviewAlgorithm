package org.example;

import java.util.Arrays;

public class _1 {
    public static void main(String[] args) {
        twoSum(new int[]{0,3,-3,4,-1}, -1);
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];


        for(int i=0; i<nums.length; i++) {
            int second = indexOf(nums, target-nums[i]);
            if(hasValue(nums, target-nums[i]) && i != second ) {
                result[0] = i;
                result[1] = second;
            }
        }

        Arrays.sort(result);
        return result;
    }

    // 배열 안에 값이 있는지 확인
    // Arrays.asList(nums).contains(target); 하면 될텐데 왜 안되는거지
    public static boolean hasValue(int [] nums, int target) {
        for(int i : nums) {
            if(i == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(int [] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
