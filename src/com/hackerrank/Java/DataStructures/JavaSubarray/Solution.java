package com.hackerrank.Java.DataStructures.JavaSubarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();

        String[] inputNumbers = bufferedReader.readLine().trim().split(" ");

        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(inputNumbers[i]));
        }

        bufferedReader.close();

        int negativeArrays = 0;
        List<Integer> currentList;

        for(int i = 0 ; i < a.size() ; i++){
            for (int j = i ; j < a.size() ; j++ ){
                currentList = List.copyOf(a.subList(i,j));
                if (isNegativeSum(currentList, a.get(j))){
                    negativeArrays++;
                }
            }
        }

        System.out.println(negativeArrays);
    }

    private static boolean isNegativeSum(List<Integer> arr, Integer aj){
        return arr.stream().reduce(0, Integer::sum) + aj < 0;
    }
}
