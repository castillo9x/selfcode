package com.selfcode;

import java.util.ArrayList;
import java.util.List;

public class Algoritm {
    public List<Integer> FindDuplicates(int[] values) {
        if (values.length == 0) return new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if (values[Math.abs(values[i])] > 0) {
                values[Math.abs(values[i])] = -values[Math.abs(values[i])];
            } else {
                duplicate.add(Math.abs(values[i]));
            }
        }
        return duplicate;
    }
}
