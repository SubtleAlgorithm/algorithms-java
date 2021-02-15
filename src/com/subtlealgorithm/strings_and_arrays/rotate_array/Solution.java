package com.subtlealgorithm.strings_and_arrays.rotate_array;

public class Solution {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverseArray(nums, 0, nums.length - k - 1);
        reverseArray(nums, nums.length - k, nums.length - 1);
        reverseArray(nums, 0, nums.length - 1);
    }

    private void reverseArray(int[] nums, int start, int end) {

        while (start < end) {

            int placeholder = 0;

            placeholder = nums[start];
            nums[start] = nums[end];
            nums[end] = placeholder;
            start++;
            end--;
        }
    }
}
