package com.hackerrank.Java.DataStructures.Java1DArrayPart2;

import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        int i = 0;

        while (i < n) {

            if (i + leap >= n || i == n - 1) {
                return true;
            }


            if (game[i + leap] == 0) {
                i += leap;
            }

            else if (game[i + 1] == 0) {
                i++;
            }

            else if (i > 0 && game[i - 1] == 0) {
                game[i] = 1;
                i--;
            }

            else {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
