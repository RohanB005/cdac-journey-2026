package com.demo.sorting;

import java.util.Arrays;

public class insertionSort {
	public static void insertionSortAscending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j = i - 1;
			int key = arr[i];
			while((j>=0) && (arr[j])>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	public static void insetionSortDescending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j = i - 1;
			int key = arr[i];
			while((j>=0) && (arr[j]) < key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
		}
	}
}
