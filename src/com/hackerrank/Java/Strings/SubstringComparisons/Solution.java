package com.hackerrank.Java.Strings.SubstringComparisons;

import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        StringBuilder b = new StringBuilder(s);
        String subString = "";
        smallest = b.substring(0,k);
        for (int i = 0; i + k -1 < s.length(); i++) {
            subString = b.substring(i, i + k);
            largest = subString.compareTo(largest) > 0 ? subString :  largest;
            smallest = subString.compareTo(smallest) < 0 ? subString : smallest;
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
