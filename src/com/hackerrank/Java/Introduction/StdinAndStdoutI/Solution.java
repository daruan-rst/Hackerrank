package com.hackerrank.Java.Introduction.StdinAndStdoutI;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print
        output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int value1  = scan.nextInt();
        int value2  = scan.nextInt();
        int value3  = scan.nextInt();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        scan.close();
    }
}