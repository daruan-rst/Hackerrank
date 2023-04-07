package com.hackerrank.Java.Strings.JavaAnagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()){
            return false;
        }
        char[] aArray = a.toLowerCase().toCharArray();
        Arrays.sort(aArray);
        char[] bArray = b.toLowerCase().toCharArray();
        Arrays.sort(bArray);
        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] != bArray[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
