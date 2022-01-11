package com.example.demo;

import java.util.Arrays;

public class StringSortingBasedOnOccurance {

    static int[] occurance = new int[26];

    static void merge(char[] arr, int l, int m, int r) {

        int l1 = m - l + 1, l2 = r - m;

        char[] lArr = new char[l1];
        char[] rArr = new char[l2];

        for (int i = 0; i < l1; i++)
            lArr[i] = arr[l + i];
        for (int i = 0; i < l2; i++)
            rArr[i] = arr[m + i + 1];

        int i = 0, j = 0, k = l;

        System.out.println("L:" + Arrays.toString(lArr) + "    R:" + Arrays.toString(rArr));
        while (i < l1 && j < l2) {
            if (occurance[lArr[i] - 'a'] >= occurance[rArr[j] - 'a']) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i < l1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < l2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    static void sort(char[] arr, int l, int r) {
        if (l < r) {
            int m = (l + (r - 1)) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        String s = "zoho".toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            occurance[curr - 'a']++;
        }
        char[] temp = s.toCharArray();

        sort(temp, 0, s.length() - 1);

        System.out.println(String.valueOf(temp));
    }
}
