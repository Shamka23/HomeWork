package org.example.numvar;

public class Main {
    public static void main(String[] args) {
        sum(2, 3);
        sum(-1, 5);

        System.out.println();

        System.out.println(isEven(4));
        System.out.println(isEven(7));

        System.out.println();

        System.out.println(max(109, 28, 89));

        System.out.println();

        System.out.println(cToF(0));
        System.out.println(cToF(100));
    }

    private static void sum(int firstCount, int secondCount) {
        System.out.println(firstCount + secondCount);
    }

    private static boolean isEven(int equivalent) {
        return equivalent % 2 == 0;
    }

    private static int max(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }

    }

    private static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
}
