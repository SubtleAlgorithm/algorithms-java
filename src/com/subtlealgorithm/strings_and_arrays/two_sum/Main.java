package com.subtlealgorithm.strings_and_arrays.two_sum;

import java.util.Arrays;

public class Main {

    static int[] someNumbers = new int[] {1,2,3,4,5,6};

    static int someTargetNumber = 7;

    public static void main(String args[]) {

        final long startTime = System.currentTimeMillis();
        int[] result = OptimizedSolution.twoSum(someNumbers, someTargetNumber);

        System.out.println("The answer is: " + Arrays.toString(result));
        final long lengthOfProcess = System.currentTimeMillis() - startTime;

        System.out.println("Our method ran for: " + lengthOfProcess + " ms");
    }
}
