package com.hackerrank.Java.Introduction.CurrencyFormatter;


import java.text.NumberFormat;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        printFormat("US", Locale.US, payment);
        printFormat("India", new Locale("en", "in"), payment);
        printFormat("China", Locale.CHINA, payment);
        printFormat("France", Locale.FRANCE, payment);
    }

    private static void printFormat(String countryName, Locale locale, double value) {
        String print = countryName
                .concat(": ")
                .concat(NumberFormat.getCurrencyInstance(locale)
                        .format(value));
        System.out.println(print);

    }
}
