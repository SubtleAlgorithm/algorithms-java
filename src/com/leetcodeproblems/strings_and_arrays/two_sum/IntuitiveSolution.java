package com.leetcodeproblems.strings_and_arrays.two_sum;

import java.util.HashMap;
import java.util.Map;

public class IntuitiveSolution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> referenceMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            referenceMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complementaryNumber = target - nums[i];

            if (referenceMap.containsKey(complementaryNumber) && referenceMap.get(complementaryNumber) != i) {
                return new int[] { referenceMap.get(complementaryNumber), i };
            }
        }

        return null;
    }
}
