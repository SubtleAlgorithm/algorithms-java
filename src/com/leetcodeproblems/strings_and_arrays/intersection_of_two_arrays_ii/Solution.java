package com.leetcodeproblems.strings_and_arrays.intersection_of_two_arrays_ii;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null) {
            return new int[] {};
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i] && nums2[j + 1] == nums1[i + 1]) {
                    return new int[] { nums1[i], nums1[i + 1] };
                }
            }
            return new int[] {};


        }

        return new int[] {};

    }
}
