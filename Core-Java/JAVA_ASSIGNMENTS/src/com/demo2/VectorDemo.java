package com.demo2;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector<>();
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter String " + (i+1) + ": ");
			String str = sc.nextLine();
			v.add(str);
		}
		
		Enumeration<String> e = v.elements();
		
		System.out.println("Vector Elements: ");
		
		while(e.hasMoreElements()) {
			String str = e.nextElement();
			System.out.println(str);
		}
	}

}
