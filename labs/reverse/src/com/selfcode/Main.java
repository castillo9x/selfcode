package com.selfcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int [] values = {1,2,3,4,5};
        Reverse reverse = new Reverse();
        values = reverse.reverse(values, 0, values.length-1);

        Arrays.stream(values)
                .forEach(i -> System.out.format(" i = %s", i));

    }
}
