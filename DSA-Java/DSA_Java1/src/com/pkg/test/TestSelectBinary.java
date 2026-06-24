package com.pkg.test;

import java.util.Arrays;

import com.dsa.SelectBinary;
import com.pkg.searching.BinarySearch;
import com.pkg.sorting.SelectionSort;

public class TestSelectBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25, 10, 40, 5, 20, 15};
		int key = 15;
		
		SelectionSort.selectionSort(arr);
		System.out.println("Sorted arr: ");
		System.out.println(Arrays.toString(arr));
		
		int index = BinarySearch.binarySearch(arr, key);
		
		if(index != -1) {
			System.out.println("Element found at Index: " + index);
		}
		else {
			System.out.println("Element not found");
		}
	}

}
