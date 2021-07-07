package com.leetcodeproblems.strings_and_arrays.longest_palindromic_substring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public String longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<>();

        Set<Character> set = new HashSet<>();

        char[] characters = s.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            map.put(characters[i], i);
        }

        String backwardsString = reverse(s);

        char[] backwardsChars = backwardsString.toCharArray();

        for (int i = 0; i < backwardsChars.length; i++) {
            if (map.containsKey(backwardsChars[i]) && map.get(backwardsChars[i]) == i) {
                set.add(backwardsChars[i]);
            }
        }

        return set.toString();
    }

    public String reverse(String s) {

        char[] characters = s.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            char temp = characters[start];
            characters[start++] = characters[end];
            characters[end--] = temp;
        }

        return characters.toString();
    }
}