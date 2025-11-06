package org.example.condition;

public class Main {
    private static final String ZERO = "zero";
    private static final String NEGATIVE = "negative";
    private static final String POSITIVE = "positive";

    public static void main(String[] args) {
        System.out.println(getSign(-10));
        System.out.println(getSign(0));
        System.out.println(getSign(10));
        System.out.println();

        System.out.println(isLeap(2000));
        System.out.println(isLeap(1900));
        System.out.println(isLeap(2024));
        System.out.println();

        System.out.println(ticketPrice(80));

    }

    private static String getSign(int number) {
        if (number == 0) {
            return ZERO;
        } else if (number < 0) {
            return NEGATIVE;
        } else {
            return POSITIVE;
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

    private static int ticketPrice(int age) {
        if (age < 6) {
            return 0;
        } else if (age <= 17) {
            return 50;
        } else if (age <= 64) {
            return 100;
        } else {
            return 60;
        }
    }
}
