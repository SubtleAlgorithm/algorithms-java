package com.leetcodeproblems.strings_and_arrays.valid_palindrome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public boolean isPalindrome(String s) {

        s = s.replaceAll("(\\s)(\"^[a-zA-Z0-9])", "").toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            char firstCharacter = s.charAt(start);
            char lastCharacter = s.charAt(end);

            if (firstCharacter != lastCharacter) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
