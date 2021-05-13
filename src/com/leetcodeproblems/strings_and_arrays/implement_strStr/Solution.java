package com.leetcodeproblems.strings_and_arrays.implement_strStr;

public class Solution {

    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.contains(needle)) {
                return haystack.indexOf(needle.substring(0, needle.length()));
            }
        }

        return -1;
    }
}
