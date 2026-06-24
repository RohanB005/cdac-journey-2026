package com.demo2;

import java.util.Scanner;

public class primeTable{
	
	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	public static void printTable(int num) {
		System.out.println("Table of " + num + ":");
		for(int i=1;i<=10;i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		for(int i=0;i<3;i++) {
			int num = sc.nextInt();
			
			if(isPrime(num)) {
				printTable(num);
			}
			else {
				double result = num / 10.0;
				System.out.println(num + " is not Prime. After division: " + result);			
			}
			System.out.println();			
		}
		sc.close();
	}
}