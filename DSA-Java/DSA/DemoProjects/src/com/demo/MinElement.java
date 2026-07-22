package com.demo;

public class MinElement {
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,4,23,56,34};
		System.out.println("Min element: " + findMin(arr));
	}

}
