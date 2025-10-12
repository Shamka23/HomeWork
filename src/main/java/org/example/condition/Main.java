package org.example.condition;

public class Main {
    public static void main(String[] args) {
        System.out.println(sign(-10));
        System.out.println(sign(0));
        System.out.println(sign(10));
        System.out.println();


    }

    private static String sign(int n){
        if (n == 0){
            return "zero";
        } else if (n < 0){
            return "negative";
        } else {
            return "positive";
        }
    }
}
