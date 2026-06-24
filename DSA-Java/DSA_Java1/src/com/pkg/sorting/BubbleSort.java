package com.pkg.sorting;

import java.util.*;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					count++;
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("Iteration: " + i);
			System.out.println("Swap Count: " + count);
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void improveBubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean flag = false;
			int count = 0;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					count++;
					flag = true;
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("Iteration: " + i + "Swap Count: " + count);
			System.out.println(Arrays.toString(arr));
			
			if(!flag) {
				break;
			}
		}
	}
	
	

}
