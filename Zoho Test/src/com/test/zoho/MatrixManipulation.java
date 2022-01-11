package com.test.zoho;
import java.io.*;
public class MatrixManipulation {

    static void printArray(int[][] input){
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void fillRowAndColumn(int[][] a,int l,int r){
        for(int i=0;i<a.length;i++){
            a[i][r] = 0;
        }
        for(int i=0;i<a[l].length;i++){
            a[l][i] = 0;
        }
    }
    static void fillRow(int[][] a,int l,int r){
        for(int i=0;i<a[l].length;i++){
            a[l][i] = 0;
        }
    }
    static void transformArray(int[][] ip){
        int[][] temp = new int[100][3];
        int index=0;
        for(int i=0;i<ip.length;i++){
            for(int j=0;j<ip[i].length;j++){
                if(ip[i][j]==0){
                   temp[index++] = new int[]{ip[i][j],i,j};
                }
                else if(ip[i][j]<0){
                    temp[index++] = new int[]{ip[i][j],i,j};
                }
            }
        }
//        System.out.println("--------");
//        printArray(temp);
        for(int i=0;i<index;i++){
            if(temp[i][0]==0){
                fillRowAndColumn(ip,temp[i][1],temp[i][2]);
            } else{
                fillRow(ip,temp[i][1],temp[i][2]);
            }
        }
    }
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns : ");
        int m = Integer.parseInt(br.readLine());
        System.out.println("Enter the Arrays Elements : ");
        int[][] input = new int[n][m];
        for(int i=0;i<n;i++){
            String[] temp = br.readLine().split(" ");
            for(int j=0;j<temp.length;j++){
                input[i][j] = Integer.parseInt(temp[j]);
            }
        }
        //int[][] input = {{4,2,9},{-1,0,9},{1,6,1},{-1,2,3}};
        System.out.println("Input Array: ");
        printArray(input);
        transformArray(input);
        System.out.println("Output Array: ");
        printArray(input);
    }
}
