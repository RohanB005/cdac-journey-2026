package com.demo;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(key < arr[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,50,30,40,50,60,70};
		int key = 50;
		
		int index = binarySearch(arr, key);
		
		if(index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found");
	}

}
