package com.example.demo;

import java.util.Arrays;

public class ReverseArray<T> {

     void swap(T arr[],int i,int j){
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

     void reverse(T arr[]){
        int n = arr.length;
        int l=0,r=n-1;
        while(l<n/2){
            swap(arr,l,r);
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        ReverseArray<String> reverseArray = new ReverseArray<>();
        //Character a[] = {'a','b','c'};
        String[] a = "Akshay is a good Boy".split(" ");
        reverseArray.reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
