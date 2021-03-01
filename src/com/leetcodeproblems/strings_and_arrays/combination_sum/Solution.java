package com.leetcodeproblems.strings_and_arrays.combination_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// Put candidates in map
// Create complement variable
// Iterate through candidates and see if complement is in map.
// If so return the combination
// If not, find the difference between the added numbers
public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> listOfLists = new ArrayList<>();

        List<Integer> combinations = new ArrayList<>();

        Map<Integer, Integer> referenceMap = new HashMap<>();

        for (int i = 0; i < candidates.length; i++) {
            referenceMap.put(candidates[i], i);
        }

        for (int i = 0; i < candidates.length; i++) {
            int complementaryNumber =
        }
    }
}
