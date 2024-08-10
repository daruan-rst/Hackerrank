package com.hackerrank.Java.bigNumber.JavaBigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();


        Arrays.sort(s, (a, b) -> {
            BigDecimal bd1 = new BigDecimal(a);
            BigDecimal bd2 = new BigDecimal(b);
            return bd2.compareTo(bd1);
        });


        for (String str : s) {
            System.out.println(str);
        }
    }
}
