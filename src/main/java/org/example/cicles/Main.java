package org.example.cicles;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumNumbersFromOneToOur(0));
        System.out.println(sumNumbersFromOneToOur(5));
        System.out.println();

        System.out.println(multiplicationRow(3));
        System.out.println(multiplicationRow(9));

        System.out.println(digitsCount(-9876));
        System.out.println(digitsCount(1));
    }

    private static long sumNumbersFromOneToOur(int number) {
        int sum = 1;
        while (number >= 0) {
            sum = sum + number;
            number--;
        }
        return sum;
    }

    private static String multiplicationRow(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            sb.append(number).append(" * ").append(i).append(" = ").append(number * i).append("\n");
        }
        return sb.toString();
    }

    private static int digitsCount(int number) {
        int length = 0;
        if (number > 0) {
            while (number > 0) {
                number = number / 10;
                length++;
            }
            return length;
        } else if (number < 0) {
            while (number < 0){
                number = number /10;
                length ++;
            }
            return length;
        }
        return 1;
    }
}
