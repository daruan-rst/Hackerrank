package com.hackerrank.Java.Strings.StringIntroduction;
import java.io.*;
import java.util.*;

public class Solution {

    static String a;
    static String b;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);

    a = sc.nextLine();
    b = sc.nextLine();

    System.out.println(a.length() + b.length());
    System.out.println(compareLexicographically());
    System.out.println(formatAnswer());
    formatAnswer();

    sc.close();
    }

    private static String compareLexicographically(){
        return a.compareTo(b) > 0 ? "Yes"  : "No";
    }

    private static String formatAnswer(){
        return  a.substring(0,1).toUpperCase().concat(a.substring(1)) +
                " " +
                b.substring(0,1).toUpperCase().concat(b.substring(1));
    }
}
