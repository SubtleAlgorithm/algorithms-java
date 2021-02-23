package com.leetcodeproblems.strings_and_arrays.two_sum;

public class BruteForceSolution {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            int complementaryNumber = target - nums[i];

            for (int j = 1; j < nums.length; j++) {
                if (nums[j] == complementaryNumber && i != j) {
                    return new int[] { i, j };
                }
            }
        }

        return null;
    }
}
