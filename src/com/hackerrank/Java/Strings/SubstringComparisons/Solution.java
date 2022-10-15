package com.hackerrank.Java.Strings.SubstringComparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String current = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i<s.length() ; i+=k){
            int start = s.length()-i<k ? s.length()-k : i;
            int end = Math.min(s.length(), (i+k));
            current = s.substring(start, end);
            if (i == 0){
                smallest = current;
            }else if (current.compareTo(smallest) < 0){
                smallest = current;
            }
            if (current.compareTo(largest) > 0){
                largest = current;
            }
        }



        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
