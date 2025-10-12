package org.example.cicles;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumToN(0));
        System.out.println(sumToN(5));
        System.out.println();

        System.out.println(mulRow(3));
        System.out.println(mulRow(9));
    }

    private static long sumToN(int n) {
        int sum = 0;
        while (n >= 0) {
            sum = sum + n;
            n--;
        }
        return sum;
    }

    private static String mulRow(int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(n).append(" * ").append(i).append(" = ").append(n * i).append("\n");
        }
        return sb.toString();
    }
}
