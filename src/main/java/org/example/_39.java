package org.example;

import java.util.ArrayList;
import java.util.List;

class _39 {
    public static List <List<Integer>> result = null;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        for(int i=0; i<candidates.length; i++) {
            search(candidates, i, target, String.valueOf(candidates[i]));
        }

        return result;
    }

    public static void search(int []candidates, int i, int target, String str) {
        if((List.of(str.split(" "))).stream().map(a -> Integer.parseInt(a)).mapToInt(a -> a).sum() > target) {
            return;
        }
        else if((List.of(str.split(" "))).stream().map(a -> Integer.parseInt(a)).mapToInt(Integer :: intValue).sum() == target) {
            result.add((List.of(str.split(" "))).stream().map(a -> Integer.parseInt(a)).toList());
        }
        else {
            for(int j=i; j<candidates.length; j++) {
                search(candidates, j, target, str + " " + String.valueOf(candidates[j]));
            }
        }
    }
}