package org.example.numvar;

public class Main {
    public static void main(String[] args) {
        sum(2, 3);
        sum(-1, 5);

        System.out.println(isEven(4));
        System.out.println(isEven(7));

        System.out.println(max(9, 28, 1));
    }

    private static void sum(int firstCount, int secondCount) {
        System.out.println(firstCount + secondCount);
    }

    private static boolean isEven(int equivalent) {
        if (equivalent % 2 == 1) {
            return false;
        }
        return true;
    }

    private static int max(int firstCount, int secondCount, int thirdCount) {
        if (firstCount > secondCount && firstCount > thirdCount) {
            return firstCount;
        } else if (secondCount > firstCount && secondCount > thirdCount) {
            return secondCount;
        } else if (thirdCount > firstCount && thirdCount > secondCount) {
            return thirdCount;
        }
        return 0;
    }
}
