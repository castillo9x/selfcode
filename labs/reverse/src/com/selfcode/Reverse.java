package com.selfcode;

import java.util.Arrays;

public class Reverse {
    public int[] reverseFor(int[] values, int startIndex, int endIndex) {
        int j = values.length - 1;
        int swap;
        for (int i = 0; i < values.length - values.length / 2; i++) {
            swap = values[i];
            values[i] = values[j];
            values[j] = swap;
            j--;
        }
        return values;
    }

    public int[] reverse(int[] values, int startIndex, int endIndex) {
        int i = startIndex;
        int j = endIndex;
        while (i < j) {
            swap(values, i, j);
            i++;
            j--;
        }
        String w
        return values;
    }

    private int[] swap (int[] values, int startIndex, int endIndex) {
        int swap;
        swap = values[startIndex];
        values[startIndex] = values[endIndex];
        values[endIndex] = swap;
        return  values;
    }


}
