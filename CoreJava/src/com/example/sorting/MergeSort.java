package com.example.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {45, 12, 45, 65, 98, 32, 65, 78, 98, 5, 6, 7, 8, 2, 3, 6, 4, 5};
        System.out.println(Arrays.toString(a));
        MergeSort ms = new MergeSort();
        ms.sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    void merge(int[] arr, int l, int m, int r) {

        int l1 = m - l + 1, l2 = r - m;

        int[] lArr = new int[l1];
        int[] rArr = new int[l2];

        for (int i = 0; i < l1; i++)
            lArr[i] = arr[l + i];
        for (int i = 0; i < l2; i++)
            rArr[i] = arr[m + i + 1];

        int i = 0, j = 0, k = l;

        System.out.println("L:" + Arrays.toString(lArr) + "    R:" + Arrays.toString(rArr));
        while (i < l1 && j < l2) {
            if (lArr[i] > rArr[j]) {
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

    void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + (r - 1)) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
