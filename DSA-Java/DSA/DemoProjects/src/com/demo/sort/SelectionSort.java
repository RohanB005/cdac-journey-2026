package com.demo.sort;

public class SelectionSort {

	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex = i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,23,12};
		selectionSort(arr);
		System.out.println("Sorted array: ");
		for(int num : arr) {
			System.out.println(num + " ");
		}

	}

}
