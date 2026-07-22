package com.demo;

public class SumElements {

	public static int sum(int[] arr) {
		int sum = 0;
		
		for(int num : arr) {
			sum+=num;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,20};
		System.out.println("Sum of elements: " + sum(arr));
	}

}
