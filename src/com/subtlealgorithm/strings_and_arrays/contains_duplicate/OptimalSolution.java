package com.subtlealgorithm.strings_and_arrays.contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class OptimalSolution {

    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> referenceMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (referenceMap.containsKey(nums[i]) && referenceMap.get(i) != i) {
                return true;
            }

            referenceMap.put(nums[i], i);
        }

        return false;
    }
}