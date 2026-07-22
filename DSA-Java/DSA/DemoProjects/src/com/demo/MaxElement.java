package com.demo;

public class MaxElement {
	
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,30,89,40,76};
		System.out.println("Max Element: " + findMax(arr));
	}

}
