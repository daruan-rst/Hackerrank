package com.hackerrank.Java.DataStructures.JavaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static String name;
    static String number;
    static String queryName;

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            name = scan.nextLine();
            number = scan.nextLine();
            phoneBook.put(name, number);
        }

        while (scan.hasNext()) {
            queryName = scan.nextLine();

            if (phoneBook.containsKey(queryName)) {
                System.out.println(
                        queryName + "=" + phoneBook.get(queryName)
                );
            } else {
                System.out.println("Not found");
            }
        }
        scan.close();

    }
}
