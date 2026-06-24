package com.demo.sorting;

import java.util.Arrays;

public class CountingSort {

    public static int[] countingSort(int[] arr) {

        int max = findMax(arr);
        int min = findMin(arr);

        int range = max - min + 1;

        int[] countarr = new int[range];

        for (int i = 0; i < arr.length; i++) {
            countarr[arr[i] - min]++;
        }

        for (int i = 1; i < countarr.length; i++) {
            countarr[i] += countarr[i - 1];
        }

        int[] output = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            countarr[val - min]--;
            int idx = countarr[val - min];
            output[idx] = val;
        }

        return output;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
}