package com.hackerrank.Java.bigNumber.PrimalityTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger n_integer = new BigInteger(n);

        boolean isPrime = n_integer.isProbablePrime(100);

        String message = isPrime ? "prime" : "not prime";

        System.out.println(message);
    }
}
