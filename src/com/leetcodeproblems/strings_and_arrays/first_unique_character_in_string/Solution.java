package com.leetcodeproblems.strings_and_arrays.first_unique_character_in_string;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int firstUniqChar(String s) {

        char[] sChars = s.toCharArray();

        Map<Character, Integer> referenceMap = new HashMap<>();

        for (int i = 0; i < sChars.length; i++) {
            referenceMap.put(sChars[i], referenceMap.getOrDefault(sChars[i], 0) + 1);
        }

        for (int i = 0; i < sChars.length; i++) {
            if (referenceMap.get(sChars[i]) == 1) {
                return i;
            }
        }

        return -1;
    }

}
