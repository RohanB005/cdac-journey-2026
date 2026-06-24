package com.demo.test;

import java.util.Arrays;
import com.demo.sorting.SelectionSort;

public class TestSelectionSort {
	public static void main(String[] args) {
		int[] arr = {10,7,12,9,13,15,7,2,1,8,5};
		
		SelectionSort.selectionSortAscending(arr);
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(arr));
	}
	

}
