package com.dsa;

import java.util.Arrays;

public class BubbleSort {
	static void bubbleSort(int[] arr, int n) {
		if(n == 1) {
			return;
		}
		for(int i=0;i<n-1;i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		bubbleSort(arr, n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		bubbleSort(arr, arr.length);
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

}
