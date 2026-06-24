package com.pkg.test;

import com.pkg.sorting.SelectionSort;

public class TestSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {64, 25, 12, 22, 11};
		
		//SelectionSort.selectionSort(arr);
		
		SelectionSort.selectionSortDescending(arr);
		
		System.out.println("Final Sorted arr: ");
		for(int n : arr) {
			System.out.println(n);
		}
		
		
	}

}
