package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddTwoNumArrays {

    static int add(int[] a, int[] b, int n, int m) {

        int[] ans = new int[n+1];

        int i = n - 1, j = m - 1, k = n ;

        int sum = 0, carry = 0;

        while (j >= 0) {
            ans[k] = (a[i] + b[j] + carry) % 10;
            carry = (carry + a[i] + b[j]) / 10;
            j--;
            k--;
            i--;
        }

        while (i >= 0) {
            ans[k] = (a[i] + carry) % 10;
            carry = (carry + a[i]) / 10;
            k--;
            i--;
        }

        if (carry == 1)
            ans[0] = 1;
        else
            ans[0] = 0;
        System.out.println(Arrays.toString(ans));
//        for (int temp = 0; temp <= n - 1; temp++) {
//            sum = sum + ans[temp];
//            sum = sum * 10;
//        }
        return sum / 10;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First array : ");
        String[] ip = br.readLine().split(" ");
        int[] a = new int[ip.length];
        int i = 0;
        for (String s : ip) {
            a[i++] = Integer.parseInt(s);
        }
        System.out.println("Enter the Second array : ");
        ip = br.readLine().split(" ");
        int[] b = new int[ip.length];
        int j = 0;
        for (String s : ip) {
            b[j++] = Integer.parseInt(s);
        }
        if (i > j) {
            System.out.println(add(a, b, i, j));
        } else {
            System.out.println(add(b, a, j, i));
        }
    }
}
