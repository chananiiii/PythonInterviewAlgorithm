package org.example;

import java.util.Arrays;

public class _1 {
    public static void main(String[] args) {
        twoSum(new int[]{0,3,-3,4,-1}, -1);
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];

        for(int i=0; i<nums.length; i++) {
            int second = Arrays.binarySearch(nums, target-nums[i]);
            if(hasValue(nums, target-nums[i]) && second != i && second > -1) {
                result[0] = i;
                result[1] = second;
                System.out.println(result[0]);
                System.out.println(result[1]);
            }
        }

        Arrays.sort(result);
        return result;
    }

    public static boolean hasValue(int [] nums, int target) {
        for(int i : nums) {
            if(i == target) {
                return true;
            }
        }
        return false;
    }
}
