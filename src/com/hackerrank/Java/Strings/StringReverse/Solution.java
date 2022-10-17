package com.hackerrank.Java.Strings.StringReverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] letters = A.toCharArray();
        int bound = A.length()%2 ==0 ? A.length()/2 : (A.length()/2) +1;
        boolean isPalindrome = true;
        for (int i = 0 ; i< bound ; i++){
            if(letters[i] != letters[A.length()-i-1]){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome?"Yes":"No");
        sc.close();

    }
}
