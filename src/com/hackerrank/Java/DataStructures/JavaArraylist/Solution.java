package com.hackerrank.Java.DataStructures.JavaArraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> d = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputNumbers = bufferedReader.readLine().trim().split(" ");
            List<Integer> d_arr = new ArrayList<>();
            for (String s: inputNumbers ) {
                d_arr.add(Integer.valueOf(s));
            }
            d.add(d_arr);
        }

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> xy_arr = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] inputNumbers = bufferedReader.readLine().trim().split(" ");
            List<Integer> xy = new ArrayList<>();
            for (String s: inputNumbers ) {
                xy.add(Integer.valueOf(s));
            }
            xy_arr.add(xy);
        }

        for (List<Integer> xy: xy_arr) {
            int line = xy.get(0) - 1;
            int pos = xy.get(1);
            if (line < 0 || line >= d.size() || pos < 0 || pos >= d.get(line).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(d.get(line).get(pos));
            }
        }

    }
}
