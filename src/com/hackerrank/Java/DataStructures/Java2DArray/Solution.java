package com.hackerrank.Java.DataStructures.Java2DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        int[][] inputArray = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] line = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            for (int j = 0; j < 6; j++) {
                inputArray[i][j] = Integer.valueOf(line[j]);
            }
        }

        bufferedReader.close();

        int maxHourGlass = 0;

        int[][] currentHourGlass = new int[3][3];
        for (int k = 0; k <= 2; k++) {
            for (int l = 0; l <= 2; l++) {
                int hourglassSum = calculateHourglassSum(inputArray, k, l);
                if (hourglassSum > maxHourGlass){
                    maxHourGlass = hourglassSum;
                }
            }
        }

        System.out.println(maxHourGlass);

    }

    private static int calculateHourglassSum(int[][] array){
        return array[0][0] + array[0][1] + array[0][2] +
                array[1][1] +
                array[2][0] + array[2][1] + array[2][2];
    }

    private static int calculateHourglassSum(int[][] input, int k, int l) {
        return input[k][l] + input[k][l + 1] + input[k][l + 2] +   // Top row
                input[k + 1][l + 1] +                                // Middle element
                input[k + 2][l] + input[k + 2][l + 1] + input[k + 2][l + 2]; // Bottom row
    }
}
