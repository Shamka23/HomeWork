package org.example.practic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isStrong("Shama"));
        System.out.println(isStrong("ShaMa099"));
        System.out.println(isStrong("Shamashama"));
        System.out.println(isStrong("12374236123"));
        int[] result = charFreqLowerCase("abBA!");
        System.out.println(Arrays.toString(result));
    }

    private static boolean isStrong(String password) {
        StringBuilder sb = new StringBuilder(password);
        boolean hasLetters = false, hasDigits = false;
        if (sb.length() >= 8) {
            for (int i = 0; i < sb.length(); i++) {
                char lettersOrDigits = sb.charAt(i);
                if (Character.isLetter(lettersOrDigits)) {
                    hasLetters = true;
                } else if (Character.isDigit(lettersOrDigits)) {
                    hasDigits = true;
                }
                if (hasLetters && hasDigits) {
                    break;
                }
            }
            return hasLetters && hasDigits;
        } else {
            return false;
        }
    }

    private static int[] charFreqLowerCase(String text) {
        int[] result = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            symbol = Character.toLowerCase(symbol);

            if (symbol >= 'a' && symbol <= 'z') {
                int index = symbol - 'a';
                result[index]++;
            }
        }
        return result;
    }
}

