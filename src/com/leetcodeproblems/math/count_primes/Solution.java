package com.leetcodeproblems.math.count_primes;

public class Solution {
    public int countPrimes(int n) {

        int counter = 0;

        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }

        return counter;
    }

    private boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
