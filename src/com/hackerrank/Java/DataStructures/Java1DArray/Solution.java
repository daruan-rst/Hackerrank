package com.hackerrank.Java.DataStructures.Java1DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        bufferedReader.close();

        a.forEach(System.out::println);
    }
}

