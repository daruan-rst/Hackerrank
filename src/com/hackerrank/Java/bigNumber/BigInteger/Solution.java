package com.hackerrank.Java.bigNumber.BigInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger a_bigInt = new BigInteger(a);
        BigInteger b_bigInt = new BigInteger(b);

        System.out.println(a_bigInt.add(b_bigInt));
        System.out.println(a_bigInt.multiply(b_bigInt));
    }
}
