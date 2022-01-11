package com.example.sorting;

import java.util.Arrays;

public class QuickSort {

    void sort(int arr[], int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);

            sort(arr, l, pi - 1);
            sort(arr, pi + 1, r);
        }
    }

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int arr[], int l, int r) {
        int pivot = arr[r];

        int smallElementIndex = l - 1;

        for (int i = l; i <= r - 1; i++) {
            if (arr[i] < pivot) {
                smallElementIndex++;
                swap(arr, smallElementIndex, i);
            }
        }
        swap(arr, smallElementIndex + 1, r);

        return smallElementIndex + 1;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int arr[] = {45, 12, 45, 65, 98, 32, 65, 78, 98, 5, 6, 7, 8, 2, 3, 6, 4, 5};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;

        qs.sort(arr, 0, n - 1);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
