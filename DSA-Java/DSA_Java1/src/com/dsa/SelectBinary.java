package com.dsa;

public class SelectBinary {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
				minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	public static int binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid] < key) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
