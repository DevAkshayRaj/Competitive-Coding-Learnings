package com.example.demo;

public class PermutationsString {

    static String swap(String s,int i,int j){
        char t[]=s.toCharArray();
        char temp = t[i];
        t[i] = t[j];
        t[j] = temp;
        return String.valueOf(t);
    }
    static void permute(String s,int l,int r){
        if(l==r){
            System.out.println(s);
        }else{
            for(int i=l;i<=r;i++){
                s = swap(s,l,i);
                permute(s,l+1,r);
                s = swap(s,l,i);
            }
        }

    }
    public static void main(String[] args) {
        String t = "ABC";
        permute(t,0,2);
    }
}
