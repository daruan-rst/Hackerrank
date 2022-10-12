package com.hackerrank.Java.Introduction.CurrencyFormatter;



import java.text.NumberFormat;
import java.util.*;


public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Double value = sc.nextDouble();

        printFormat(Locale.US, value);
        printFormat(new Locale("en", "in"), value);
        printFormat(Locale.CHINA, value);
        printFormat(Locale.FRANCE, value);
        sc.close();
    }

    private static void printFormat(Locale locale, double value){
        String print = locale.getDisplayCountry()
                        .concat(": ")
                        .concat(NumberFormat.getCurrencyInstance(locale)
                        .format(value));
        System.out.println(print);
    }
    
}
