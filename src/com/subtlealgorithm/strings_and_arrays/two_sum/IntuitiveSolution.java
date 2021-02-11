package com.subtlealgorithm.strings_and_arrays.two_sum;

import java.util.HashMap;
import java.util.Map;

public class IntuitiveSolution {

    // Time = O(n)
    // Space = O(n) *Hashmap reduces lookup time*
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> referenceMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            referenceMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complementaryNumber = target - nums[i];

            if (referenceMap.containsKey(complementaryNumber) && referenceMap.get(complementaryNumber) != i) {
                return new int[] { i, referenceMap.get(complementaryNumber) };
            }
        }

        return null;
    }
}
