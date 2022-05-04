package com.hackerrank.JavaDatatypes;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    private static Scanner SC = new Scanner(System.in);


    public static void main(String[] args) {
        int t = SC.nextInt();
        while (t > 0) {
            try {
                long n = SC.nextLong();
                System.out.printf("%d can be fitted in:\n", n);
                if (byteCondition(n)) {
                    System.out.println("* byte");
                }
                if (shortCondition(n)) {
                    System.out.println("* short");
                }
                if (integerCondition(n)) {
                    System.out.println("* int");
                }
                if (longCondition(n)) {
                    System.out.println("* long");
                }
            }catch(Exception e){
                System.out.println(SC.next() + " can't be fitted anywhere.");
            }
            t--;
        }
        SC.close();
    }

    private static boolean byteCondition(long n) {
        return -128 < n && n <= 127;
    }

    private static boolean shortCondition(long n) {
        return Short.MIN_VALUE < n && n <= Short.MAX_VALUE;
    }

    private static boolean integerCondition(long n) {
        return Integer.MIN_VALUE < n && n <= Integer.MAX_VALUE;
    }

    private static boolean longCondition(long n) {
        return Long.MIN_VALUE < n && n <= Long.MAX_VALUE;
    }
}


