package org.example.methods;

import static org.example.methods.Score.averageScore;

public class Main{
    public static void main(String[] args) {
        Person person1 = new Person("Shamil", 23);
        Person person2 = new Person("Rupert", 19);

        System.out.println(person1);
        System.out.println(person2.getYear());

        int[] marks = {12, 23, 123};

        System.out.println(averageScore(marks));
    }
}
