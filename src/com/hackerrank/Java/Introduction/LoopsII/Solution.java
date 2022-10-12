package com.hackerrank.Java.Introduction.LoopsII;

import java.util.*;

public class Solution {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int s;
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            s = a;
            for (int j = 0 ; j<n ; j++){
                s = s + ((int) Math.pow(2, j))*b;
                System.out.printf("%d ", s);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
