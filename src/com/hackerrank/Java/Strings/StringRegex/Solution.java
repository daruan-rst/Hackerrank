package com.hackerrank.Java.Strings.StringRegex;

import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(validIP(IP));
        }

    }

    static private boolean validIP(String ip){
        String[] ipSections = ip.split("\\.");
        boolean validIp = true;

        for (String section : ipSections) {
            Integer sectionNumer = 256;
            try{
                sectionNumer = Integer.parseInt(section);
            }catch (Exception e){
                validIp = false;
            }
            if (sectionNumer > 255 || sectionNumer < 0 || section.length() > 3){
                validIp = false;
            }
        }
        return ipSections.length == 4 && validIp;
    }
}