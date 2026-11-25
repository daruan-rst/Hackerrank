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
        if (pos > 0){
            List<Integer> arr1 = arr.subList(0,pos - 1);
            List<Integer> arr2 = arr.subList(pos,arr.size());
            arr1.addAll(arr2);
            arr = arr1;
        } else {
            arr = arr.subList(1,arr.size());
        }
    }

    private static void insert(Scanner scan) {
        int pos = scan.nextInt();
        int num = scan.nextInt();
        if (pos < arr.size()){
            List<Integer> arr1 = arr.subList(0,pos);
            List<Integer> arr2 = arr.subList(pos,arr.size());
            arr1.add(num);
            arr1.addAll(arr2);
            arr = arr1;
        } else {
            arr.add(num);
        }
    }

    private static void scanArray(Scanner scan) {
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            arr.add(num);
        }
    }


}
