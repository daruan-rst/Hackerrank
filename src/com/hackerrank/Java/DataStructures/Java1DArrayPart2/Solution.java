package com.hackerrank.Java.DataStructures.Java1DArrayPart2;

import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int counter = 0;
        for (int i = 0 ; i < game.length ; ){
            if (i + leap >= game.length){
                counter = game.length - 1;
                break;
            } else if (i + 1 < game.length){
                if (game[i+1] == 0){
                    counter = i+1;
                    i = i+1;
                }
            } else if (i > 0){
                if (game[i-1] == 0){
                    counter = i-1;
                    i = i-1;
                }
            }  else {
                if (game[i+leap] == 0){
                    counter = i+leap;
                    i = i+leap;

                }
            }
        }

        return counter == game.length - 1;
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
