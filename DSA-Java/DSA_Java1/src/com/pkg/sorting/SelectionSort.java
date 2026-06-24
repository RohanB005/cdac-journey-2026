package com.pkg.sorting;

import java.util.*;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
			System.out.println("Iteration: " + i);
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void selectionSortDescending(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int maxIndex = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
			
			System.out.println("Iteration: " + i);
			System.out.println(Arrays.toString(arr));
		}
	}

}
