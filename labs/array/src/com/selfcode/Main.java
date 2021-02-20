package com.selfcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //  Array one dimention
        int[] values = new int[5];
        // Option 1
        for (int i = 0; i < 5; i++) {
            values[i] = i;
            System.out.println(values[i]);
        }

        //values[0] = 100;
        // Option 2

        Arrays.stream(values).forEach(System.out::println);

        // LINEAR SEARCH

        // Option 1

        for (int i = 0; i < 5; i++) {
            if (values[i] == 6) {
                System.out.format(" Found %s ", i);
            }
        }

        // Option 2

        Arrays.stream(values)
                .filter(i -> i == 6)
                .forEach(i -> System.out.format(" Found %s", i));

        // Option 3

        System.out.format(" Found %s",
                Arrays.stream(values)
                        .filter(i -> i == 6)
                        .findFirst().isPresent());

        // ArrayList


        List<String> stringList = new ArrayList<>();
        stringList.add("s");
        stringList.add("s2");
        stringList.add("s3");
        stringList.add("s4");

        // Imprimir primero
        System.out.println(stringList.get(0));

        // Option 1
        for (String s : stringList) {
            System.out.println(s);
        }

        // Option 2

        stringList.forEach(System.out::println);

        int j = values.length - 1;
        int swap;
        for (int i = 0; i < values.length - values.length/2; i++) {
            swap = values[i];
            values[i] = values[j];
            values[j] = swap;
            j--;
        }

        Arrays.stream(values)
                .forEach(i -> System.out.format(" i = %s", i));

    }
}
