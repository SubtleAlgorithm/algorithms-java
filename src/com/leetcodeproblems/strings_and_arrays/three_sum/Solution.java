package com.leetcodeproblems.strings_and_arrays.three_sum;

import java.util.*;

public class Solution {

//    Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
//    Find all unique triplets in the array which gives the sum of zero.
//    Notice that the solution set must not contain duplicate triplets.

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; ++i) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, listOfLists);
            }
        }

        return listOfLists;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> listOfLists) {
        Set<Integer> valuesChecked = new HashSet<>();

        for (int pointer = i + 1; pointer < nums.length; ++pointer) {
            int complement = -nums[i] - nums[pointer];

            if (valuesChecked.contains(complement)) {
                listOfLists.add(Arrays.asList(nums[i], nums[pointer], complement));

                while (pointer + 1 < nums.length && nums[pointer] == nums[pointer + 1]) {
                    ++pointer;
                }

                valuesChecked.add(nums[pointer]);
            }
        }
    }


}
