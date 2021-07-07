package com.leetcodeproblems.strings_and_arrays.longest_substring_without_repeating_characters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] chars = new int[128];

        int pointer1 = 0;
        int pointer2 = 0;

        int result = 0;

        while (pointer2 < s.length()) {
            char second = s.charAt(pointer2);
            chars[second]++;

            while (chars[second] > 1) {
                char first = s.charAt(pointer1);
                chars[first]--;
                pointer1++;
            }

            result = Math.max(result, pointer2 - pointer1 + 1);
            pointer2++;
        }

        return result;
    }
}
