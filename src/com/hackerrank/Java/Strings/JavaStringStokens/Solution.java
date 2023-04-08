package com.hackerrank.Java.Strings.JavaStringStokens;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
//        List<String> tokens = Arrays.stream(s.split("[^\\w]")).collect(Collectors.toList());
        List<String> tokens = Arrays.stream(s.split("[\\s!,?._'@\\e\\n\\r]")).collect(Collectors.toList());
        tokens = tokens.stream().filter(st->!st.equals("")).collect(Collectors.toList());
        System.out.println(tokens.size());
        for (String token: tokens
             ) {
            System.out.println(token);
        }
        scan.close();
    }
}
