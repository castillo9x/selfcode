package com.selfcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int inputInt = Integer.parseInt(scan.nextLine());
        double inputDouble = Double.parseDouble(scan.nextLine());
        String inputString = scan.nextLine();

        System.out.println(i + inputInt);
        System.out.println(d + inputDouble);
        System.out.println("HackerRank " + inputString);

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();


    }
}
