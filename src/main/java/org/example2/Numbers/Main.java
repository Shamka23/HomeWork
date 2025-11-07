package org.example2.Numbers;

public class Main {
    public static void main(String[] args) {
        System.out.println(getAbsolute(-7));
        System.out.println(getAbsolute(0));
        System.out.println();
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(1));
        System.out.println();
        System.out.println(getFactorial(0));
        System.out.println(getFactorial(10));
//        System.out.println(getFactorial(-1));
        System.out.println();
        System.out.println(safeAvg(4, 5));
    }

    private static int getAbsolute(int number) {
        if (number >= 0) {
            return number;
        } else {
            return -number;
        }
//        return Math.abs(number); // Либо можно так
    }

    private static boolean isPowerOfTwo(int number) {
        return number % 2 == 0 || number - 1 == 0;
    }

    private static long getFactorial(int number) {
        long result = 1;
        int count = 1;
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно вывести факториал для отрицательного числа");
        } else {
            while (count <= number) {
                result = result * count;
                count++;
            }
//            for (int i = 1; i <= number; i++) { так тоже можно
//                result = result * i;
//            }
            return result;
        }
    }

    private static int safeAvg(int firstNumber, int secondNumber) {
        return firstNumber +(secondNumber - firstNumber) / 2;
    }
}
