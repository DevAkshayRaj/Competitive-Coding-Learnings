package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSumProblem {

    static int[] findIndices(int a[],int t){
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i< a.length;i++){
            int diff = t - a[i];
            if(hs.containsKey(diff)){
                return new int[] {hs.get(diff),i};
            }else {
                hs.put(a[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int a[] = {2,7,11,15};
        System.out.println(Arrays.toString(findIndices(a,9)));
    }
}
