package org.example;

import java.util.*;

public class _15 {
    public static void main(String[] args) {
        threeSum(new int[]{1, 2, -2, -1});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // 정렬 진행
        Arrays.sort(nums);
        List<List<Integer>> resultList = new LinkedList<>();

        // 중복값 체크 Set 으로..
        Set <List <Integer>> checkSet = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // 좌측, 우측 기준 생성
            int left = i+1;
            int right = nums.length-1;

            int sum = 0;
            // 좌측이 우측을 넘어가면 안된다.
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];

                // 0 이면 정답처리, Set에 넣기
                if (sum == 0) {
                    if(!checkSet.contains(Arrays.asList(nums[i], nums[left], nums[right]))) {
                        resultList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        checkSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    }

                    // 좌측은 +1, 우측은 -1 진행
                    left += 1;
                    right -= 1;
                }
                // 만약 세 합이 0보다 작다면 좌측을 우측으로 확장시켜서 크게 만들어줘야한다.
                else if (sum < 0) {
                    left += 1;
                }
                // 만약 세 합이 0보다 크다면 우측을 좌측으로 확장시켜서 작게 만들어줘야한다.
                else {
                    right -= 1;
                }
            }
        }
        return resultList;
    }
}
