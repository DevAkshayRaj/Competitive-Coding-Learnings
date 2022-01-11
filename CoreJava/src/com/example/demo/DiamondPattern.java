package com.example.demo;

public class DiamondPattern {
    public static void main(String[] args) {
        String s="AKSHAYRAJ";
        char[] arr = s.toCharArray();
        int l=s.length()/2,r=s.length()/2;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(j==l){
                    System.out.print(arr[l]);
                }else if(j==r){
                    System.out.print(arr[r]);
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i<s.length()/2){
            l--;
            r++;
            }
            else if(i==s.length()/2){
                l=1;
                r=s.length()-2;
            }else{
                l++;
                r--;
            }
            System.out.println();
        }
        for(char i='0';i<='9';i++){
            System.out.println(i);
        }
//        int x=1,y=s.length()-1;
//        for(int i=0;i<s.length();i++){
//            for(int j=0;j<s.length();j++){
//                if(j==x){
//                    System.out.print(arr[x]);
//                }else if(j==y){
//                    System.out.print(arr[y]);
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            x++;
//            y--;
//            System.out.println();
//        }
    }
}
