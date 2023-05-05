package com.geometry.utils;

public class SelectionSort {
    public static void sortArray(Comparable[] arr) {
        if (arr == null) return;

        // selection sort
        int k = arr.length;
        int minIdx = 0;
        for (int i = 0; i < k; ++i) {
            minIdx = i;
            for (int j = i + 1; j < k; ++j) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    minIdx = j;
                }
            }

            if (i != minIdx) {
                Comparable temp = arr[minIdx];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }
}
