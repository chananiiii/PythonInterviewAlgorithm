package org.example;

import java.util.Arrays;

public class _561 {
    // 7장 1번
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int result = 0;

        // 정렬을 하고 앞에서 2개씩 차례대로 꺼내고
        // 2개 비교 후 값을 계속 더해주면 정답이 나온다.
        for (int i = 0; i < nums.length; i += 2) {
            result += Math.min(nums[i], nums[i + 1]);
        }

        return result;
    }
}
