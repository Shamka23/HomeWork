package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(min(new int[]{5, 2, 7}));
        System.out.println(sumEven(new int[]{1, 2, 3, 4}));
        System.out.println(positives(new int[]{-1, 0, 2, 5}));
    }

    private static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int sumEven(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static List<Integer> positives(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : array) {
            if(value > 0) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }
}
