package com.selfcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));

        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            n.add(scan.nextInt());
        }

        n.forEach(System.out::println);
    }

}