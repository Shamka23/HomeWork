package org.example.condition;

public class Main {
    public static void main(String[] args) {
        System.out.println(sign(-10));
        System.out.println(sign(0));
        System.out.println(sign(10));
        System.out.println();

        System.out.println(isLeap(2000));
        System.out.println(isLeap(1900));
        System.out.println(isLeap(2024));
        System.out.println();
    }

    private static String sign(int n) {
        if (n == 0) {
            return "zero";
        } else if (n < 0) {
            return "negative";
        } else {
            return "positive";
        }
    }

    private static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
