package com.leetcodeproblems.strings_and_arrays.contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class IntuitiveSolution {
    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> referenceMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            referenceMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (referenceMap.containsKey(nums[i]) && referenceMap.get(nums[i]) != i) {
                return true;
            }
        }

        return false;
    }
}
