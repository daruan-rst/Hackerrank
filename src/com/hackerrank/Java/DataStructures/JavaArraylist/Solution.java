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

        for (int i = 0; i < n; i++) {
            String[] inputNumbers = bufferedReader.readLine().trim().split(" ");
            List<Integer> xy = new ArrayList<>();
            for (String s: inputNumbers ) {
                xy.add(Integer.valueOf(s));
            }
            xy_arr.add(xy);
        }

        for ( List<Integer> di: d
             ) {
            System.out.println(di);
        }

        for ( List<Integer> di: xy_arr
        ) {
            System.out.println(di);
        }

        for (List<Integer> xy: xy_arr){
//            xy.get(0) -> linha
//            xy.get(1) -> posicao
            try{
                System.out.println(d.get(xy.get(0)).get(xy.get(1)));
            }catch (Exception e){
                System.out.println("ERROR!");
            }

        }

    }
}
