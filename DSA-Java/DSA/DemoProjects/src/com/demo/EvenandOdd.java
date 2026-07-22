package com.demo;

public class EvenandOdd {

	public static void countEvenOdd(int[] arr) {
		int even = 0;
		int odd = 0;
		
		for(int num : arr) {
			if(num % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("Even = " + even);
		System.out.println("Odd = " + odd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,22,3,40,50};
		countEvenOdd(arr);
	}

}
