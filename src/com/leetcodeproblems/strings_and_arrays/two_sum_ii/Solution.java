package com.leetcodeproblems.strings_and_arrays.two_sum_ii;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> referenceMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            referenceMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (referenceMap.containsKey(complement) && referenceMap.get(complement) != i) {
                return new int[]{i + 1, referenceMap.get(complement) + 1};
            }
        }

        return new int[]{};
    }
}
