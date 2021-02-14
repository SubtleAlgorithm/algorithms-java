package com.subtlealgorithm.strings_and_arrays.contains_duplicate;

import com.subtlealgorithm.strings_and_arrays.contains_duplicate.OptimalSolution;

import java.util.Arrays;

public class Main {
    static int[] someNumbers = new int[] {1,2,3,8,5,6};

    public static void main(String args[]) {

        final long startTime = System.currentTimeMillis();
        boolean result = OptimalSolution.containsDuplicate(someNumbers);

        System.out.println("The answer is: " + result);
        final long lengthOfProcess = System.currentTimeMillis() - startTime;

        System.out.println("Our method ran for: " + lengthOfProcess + " ms");
    }
}
