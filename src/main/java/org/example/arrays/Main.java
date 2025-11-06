package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(min(new int[]{5, 2, 7}));
        System.out.println(sumEven(new int[]{1, 2, 3, 4}));
        System.out.println(positives(new int[]{-1, 0, 2, 5}));
    }

    private static int min(int[] numberArray) {
        int max = Integer.MAX_VALUE;
        for (int value : numberArray) {
            if (value < max) {
                max = value;
            }
        }
        return max;
    }

    private static int sumEven(int[] numberArray) {
        int sum = 0;
        for (int value : numberArray) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }

    private static List<Integer> positives(int[] numberArray) {
        List<Integer> result = new ArrayList<>();
        for (int value : numberArray) {
            if(value > 0) {
                result.add(value);
            }
        }
        return result;
    }
}
