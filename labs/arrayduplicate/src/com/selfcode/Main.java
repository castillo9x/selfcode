package com.selfcode;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] values = {1, 2, 2, 3, 4, 4};

        List<Integer> duplicates;

        Algoritm algoritm = new Algoritm();

        duplicates = algoritm.FindDuplicates(values);

        duplicates.forEach(i -> System.out.format("Se repite el %s¸\n", i));

        // write your code here
    }
}
