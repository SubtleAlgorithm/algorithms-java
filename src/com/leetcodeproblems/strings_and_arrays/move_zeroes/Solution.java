package com.leetcodeproblems.strings_and_arrays.move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {

        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ) {
                int placeholder = nums[pointer];
                nums[pointer] = nums[i];
                nums[i] = placeholder;
                pointer++;
            }
        }
    }
}
