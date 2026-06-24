package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.HeapSort;

public class TestHeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 9, 7, 4, 1, 8, 4};
		HeapSort.heapSortAscending(arr);
		System.out.println(Arrays.toString(arr));
	}

}
