package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DecimalToBinary {

    static int convert(int n){
        System.out.print(n+" : ");
        int bin[]=new int[100];
        int i=0;
        while(n>0){
            bin[i]=(n%2);
            n/=2;
            i++;
        }
        int s=0;
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
            s+=bin[j];
        }
        System.out.println();
        return s;
    }

    void mergeSort(int a[],int l,int r){
        if(l<r){
            int m=(l+(r-1))/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            partition(a,l,m,r);
        }
    }
    void partition(int a[],int l,int m,int r){
        int n1=m-l+1,n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=a[l+i];
        for(int i=0;i<n2;i++)
            right[i]=a[m+1+i];
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(convert(left[i])<=convert(right[j])){
                a[k]=left[i];
                i++;
            }else{
                a[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        convert(100);
        DecimalToBinary db=new DecimalToBinary();
        //int a[]={15,68,56,12,6,68};
        //int a[]={1,5,3,4,6};
        int a[]={7,2,10,16};
        db.mergeSort(a,0,3);
        System.out.println(Arrays.toString(a));
    }
}
