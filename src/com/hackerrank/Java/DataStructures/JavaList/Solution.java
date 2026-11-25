package com.hackerrank.Java.DataStructures.JavaList;


import java.io.*;
import java.util.*;

public class Solution {

    private static List<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scanArray(scan);
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String command = scan.next();
            if (command.equalsIgnoreCase("Insert")){
                insert(scan);
            } else {
                delete(scan);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.printf(arr.get(i).toString() + " ");
        }

        scan.close();
    }

    private static void delete(Scanner scan) {
        int pos = scan.nextInt();
        arr.remove(pos);
    }

    private static void insert(Scanner scan) {
        int pos = scan.nextInt();
        int num = scan.nextInt();
        arr.add(pos,num);
    }

    private static void scanArray(Scanner scan) {
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            arr.add(num);
        }
    }


}
