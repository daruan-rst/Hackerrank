package com.hackerrank.Java.bigNumber.JavaBigDecimal;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here

        Function<String, BigDecimal> convert = (st) -> new BigDecimal(st).setScale(st.split(".")[1].length());

        List<BigDecimal> bigDecimal_s = Arrays.stream(s).map(convert).collect(Collectors.toList());

        List<String> sList = rearrange(s);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(sList.get(i));
        }
    }

    private static List<String> rearrange(String[] s){
        List<BigDecimal> sArr = Arrays.stream(s).map(BigDecimal::new).collect(Collectors.toList());
        List<Integer> scale = sArr.stream().map(BigDecimal::scale).toList();

        Comparator<BigDecimal> isDescAndScale = new Comparator<BigDecimal>() {
            @Override
            public int compare(BigDecimal o1, BigDecimal o2) {
                boolean isDesc =  o1.compareTo(o2) < 0;
                
                return 0;
            }
        };

        sArr.sort(Comparator.reverseOrder()
        );
        return sArr.stream().map(BigDecimal::toString).toList();

    }

}
