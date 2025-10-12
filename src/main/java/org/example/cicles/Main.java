package org.example.cicles;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumToN(0));
        System.out.println(sumToN(5));
        System.out.println();
    }

    private static long sumToN(int n) {
        int sum = 0;
        while (n >= 0) {
            sum = sum + n;
            n--;
        }
        return sum;
    }
}
