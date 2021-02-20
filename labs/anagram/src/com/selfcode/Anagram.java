package com.selfcode;

import java.util.Arrays;

public class Anagram {
    public boolean Evaluate(String w1, String w2) {
        if (w1.length() != w2.length()) return false;

        String[] arrayWord1 = w1.split("");
        Arrays.sort(arrayWord1);
        Arrays.stream(arrayWord1).forEach(System.out::println);
        String[] arrayWord2 = w2.split("");
        Arrays.sort(arrayWord2);
        Arrays.stream(arrayWord1).forEach(System.out::println);
        for (int i = 0; i < arrayWord1.length; i++) {
            System.out.println(arrayWord1[i]);
            System.out.println(arrayWord2[i]);
            if (!arrayWord1[i].equals(arrayWord2[i])) {
                return false;
            }
        }
        return true;
    }
}
