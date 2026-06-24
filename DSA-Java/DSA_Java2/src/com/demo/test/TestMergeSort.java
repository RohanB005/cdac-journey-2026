package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.MergeSort;

public class TestMergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 3, 4, 8, 6, 7, 5, 4, 2};
		MergeSort.mergeSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(arr));
	}
}
