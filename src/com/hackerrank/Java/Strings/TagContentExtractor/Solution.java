package com.hackerrank.Java.Strings.TagContentExtractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            extractContent(line);
            //Write your code here

            testCases--;
        }
    }

    private static void extractContent(String withTag){
        String content = "";
        //. any // ^ does not include // "\\1" group1
        String regex = "<(.+)>([^<]+)<(/\\1)>";

        boolean matchAvailable = false;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(withTag);

        //if(line.matches(regex)) System.out.println("test");

        while(m.find()) {
            matchAvailable = true;
            System.out.println(m.group(2));
        }

        if(!matchAvailable){
            System.out.println("None");
        }

    }

}
