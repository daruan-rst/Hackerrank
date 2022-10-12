package com.hackerrank.Java.Introduction.IntToString;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String answer;
        try{
            Integer.valueOf(line);
            answer = "Good job";
        }catch (NumberFormatException e){
            answer = "wrong";
        }
        System.out.println(answer);
        sc.close();
    }
}