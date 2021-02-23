package com.leetcodeproblems.math.fizz_buzz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> fizzBuzzList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(Integer.toString(i));
            }
        }

        return fizzBuzzList;
    }
}
