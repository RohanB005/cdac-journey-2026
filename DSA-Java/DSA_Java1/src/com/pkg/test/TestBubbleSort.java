package com.pkg.test;

import com.pkg.sorting.BubbleSort;

public class TestBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {21, 2, 5, 1, 7, 8, 10, 3};
		
		//BubbleSort.bubbleSort(arr);
		BubbleSort.improveBubbleSort(arr);
		
		System.out.println("Final Sorted Array: ");
		for(int n : arr) {
			System.out.println(n);
		}
	}

}
