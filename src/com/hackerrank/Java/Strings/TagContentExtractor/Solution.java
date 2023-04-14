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
            System.out.println(extractContent(line));
            //Write your code here

            testCases--;
        }
    }

    private static String extractContent(String withTag){
        String content = "";
        boolean matchFound = false;
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(withTag);

        while (m.find()) {
            content = m.group(2);
            matchFound = true;
        }
        if ( ! matchFound) {
           content = "None";
        }


        return content;
    }

}
