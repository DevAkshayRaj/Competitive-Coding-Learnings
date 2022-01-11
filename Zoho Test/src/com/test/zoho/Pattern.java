package com.test.zoho;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ip = br.readLine();
//        int n=5;
//        //String ip="ZOHOCORPORATION";
//        //String ip = "ESTANCIACAMPUS";
//        String ip="NULLPOINTEREXCEPTION";
        int l = ip.length();
        int middleIndex =  2 * n - 2 ;
        int y = n;

        for(int i=0;i<n;i++){
            int multiple = middleIndex - 2 * i;
            //System.out.println("Multiple : "+multiple);
            for(int j=i; j < ip.length() ; j += middleIndex){

            System.out.print(ip.charAt(j));
            if( multiple + j < ip.length() && multiple > 0 && multiple < middleIndex){
                for(int k=0; k< 2 * (middleIndex-n-i) + 1;k++)
                    System.out.print(" ");
                System.out.print(ip.charAt(j+multiple));
                for(int k=0;k< 2* (i-1) + 1 ;k++)
                    System.out.print(" ");

            } else{
                for(int k=0;k< 2*(middleIndex-n)+1;k++){
                    System.out.print(" ");
                }
            }
            }
            System.out.println();
        }
    }
}
