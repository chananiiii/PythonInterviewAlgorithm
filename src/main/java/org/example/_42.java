package org.example;

import java.util.*;

public class _42 {
    public static void main(String[] args) {
        // [0,1,0,2,1,0,1,3,2,1,2,1]
        trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }

    public static int trap(int[] height) {
        if(height.length == 0) return 0;
        int answer=0;
        int[] left=new int[height.length];
        int[] right=new int[height.length];

        // 왼쪽으로 max 높이 저장
        left[0]=height[0];
        for(int i=1; i<height.length; i++){
            left[i]=Math.max(height[i], left[i-1]);
        }

        // 오른쪽
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            right[i]=Math.max(height[i], right[i+1]);
        }

        // 물 영역 계산
        for(int i=0; i<height.length; i++){
            answer+=Math.min(left[i], right[i])-height[i];
        }

        return answer;
    }

}
