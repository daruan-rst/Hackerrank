package com.hackerrank.JavaOutputFormatting;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    private static int numberInput;
    private static String stringInput;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            stringInput = sc.next();
            numberInput = sc.nextInt();
            System.out.printf("%-15s%03d%n",stringInput, numberInput);
        }
        System.out.println("================================");

    }
}

