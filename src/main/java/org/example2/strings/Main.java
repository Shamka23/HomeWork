package org.example2.strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFirstWord("     hi there"));
        System.out.println(getRepeatWords("ab", 3));
        System.out.println(setNewVowels("Hello"));
        System.out.println(squeezeSpaces("    a   b  c   "));
    }

    private static String getFirstWord(String text) {
        String[] words = text.trim().split("\\s+");
        return words[0];
    }

    private static String getRepeatWords(String text, int times) {
        return text.repeat(times);
    }

    private static String setNewVowels(String text) {
        return text.replaceAll("[aiueoAIUEO]", "*");
    }

    private static String squeezeSpaces(String text) {
        return text.trim().replaceAll("\\s+", " ");
    }
}
