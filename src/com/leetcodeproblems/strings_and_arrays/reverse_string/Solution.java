package com.leetcodeproblems.strings_and_arrays.reverse_string;

public class Solution {
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char placeholder;
            placeholder = s[start];
            s[start] = s[end];
            s[end] = placeholder;
            end--;
            start++;
        }
    }
}
