package com.hackerrank.Java.Introduction.StaticInitializerBlock;

import java.util.*;

public class Solution {

    private final static Scanner SC = new Scanner(System.in);
    private static int h;
    private static int b;



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        b = SC.nextInt();
        h = SC.nextInt();
        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b*h);
        }
        SC.close();

    }
}
