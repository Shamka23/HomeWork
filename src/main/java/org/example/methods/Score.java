package org.example.methods;

public class Score {
    public static double averageScore(int[] marks) {
        double average = 0.0;
        double sum = 0.0;
        if (marks == null) {
            return average;
        }
        for (int mark : marks) {
            sum = sum + mark;
        }
        average = sum / marks.length;
        return average;
    }
}
