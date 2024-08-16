package com.hackerrank.Java.DataStructures.JavaSubarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        bufferedReader.close();

        int negativeArrays = 0;
        List<Integer> currentList;

        // 1 2 3 4 5 6
        for(int i = 0 ; i < a.size() ; i++){
            for (int j = 0 ; j < a.size() ; j++ ){
                currentList = List.copyOf(a.subList(j,j));
                if (isNegativeSum(currentList)){
                    negativeArrays++;
                }
            }
        }

        System.out.println(negativeArrays);
    }

    private static boolean isNegativeSum(List<Integer> arr){
        return arr.stream().reduce((a,b) -> a = a + b).get() < 1;
    }
}
