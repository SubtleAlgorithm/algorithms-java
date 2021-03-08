package com.leetcodeproblems.strings_and_arrays.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {

        int numberResult = 0;
        numberResult += mapOfValues.get(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            int lastCharacter = s.charAt(i - 1);
            int currentCharacter = s.charAt(i);

            if (mapOfValues.get(lastCharacter) < mapOfValues.get(currentCharacter)) {
                numberResult = numberResult - mapOfValues.get(lastCharacter);
                numberResult = numberResult + mapOfValues.get(currentCharacter);
            } else {
                numberResult = numberResult + mapOfValues.get(currentCharacter);
            }
        }

        return numberResult;
    }

    static Map<String, Integer> mapOfValues = new HashMap<>();

    static {
        mapOfValues.put("I", 1);
        mapOfValues.put("V", 5);
        mapOfValues.put("X", 10);
        mapOfValues.put("L", 50);
        mapOfValues.put("C", 100);
        mapOfValues.put("D", 500);
        mapOfValues.put("M", 1000);
    }
}
