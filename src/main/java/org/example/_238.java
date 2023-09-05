package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _238 {
    public static void main(String[] args) {
        int [] result = productExceptSelf(new int[]{1,2,3,4});

        Arrays.stream(result).boxed().forEach(System.out::println);

    }
    public static int[] productExceptSelf(int[] nums) {
        int [] array1 = new int[nums.length];
        int [] array2 = new int[nums.length];
        int [] result = new int[nums.length];
        array1[0] = 1;
        array2[nums.length-1] = 1;

        for(int i=1; i<array1.length; i++) {
            array1[i] = nums[i-1] * array1[i-1];
        }

        for(int i=array2.length-2; i>-1; i--) {
            array2[i] = nums[i+1] * array2[i+1];
        }

        for(int i=0; i<result.length; i++) {
            result[i] = array1[i] * array2[i];
        }

        return result;
    }
}
