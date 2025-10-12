package org.example.numvar;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(2, 5));

        System.out.println();

        System.out.println(isEven(4));
        System.out.println(isEven(7));

        System.out.println();

        System.out.println(max(109, 28, 89));

        System.out.println();

        System.out.println(convertTempToFahrenheitfromCelcius(0));
        System.out.println(convertTempToFahrenheitfromCelcius(100));
    }

    private static int sum(int firstNumber, int secondNumber) {
      return firstNumber + secondNumber;
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

    private static double convertTempToFahrenheitfromCelcius(double c) {
        return (c * 9 / 5) + 32;
    }
}
