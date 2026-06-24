package com.pkg.test;

import com.pkg.searching.BinarySearch;

public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 7, 10, 15, 20, 25, 30};
		//int[] arr = {30,25,20,15,10,7,5,2};
		
		int key = 15;
		
		
		int index = BinarySearch.binarySearch(arr, key);
		
		//int index = BinarySearch.binarySearchDescending(arr, key);
		
		if(index != -1) {
			System.out.println("Element found at index: " + index);
		}
		else {
			System.out.println("Element not found");
		}

	}

}
