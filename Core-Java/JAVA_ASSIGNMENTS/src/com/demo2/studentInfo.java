package com.demo2;

import java.util.Scanner;

class Student{
	int studId;
	String name;
	int m1, m2, m3;
	
	void accept(Scanner sc) {
		System.out.println("Enter Student ID: ");
		studId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter M1: ");
		m1 = sc.nextInt();
		
		System.out.println("Enter M2: ");
		m2 = sc.nextInt();
		
		System.out.println("Enter M3: ");
		m3 = sc.nextInt();
	}
	void display() {
		System.out.println("Student Details");
		System.out.println("-----------------");
		System.out.println("Name: " + name);
		System.out.println("M1: " + m1);
		System.out.println("M2: " + m2);
		System.out.println("M3: " + m3);
		System.out.println();
	}
}
public class studentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		
		Student[] students = new Student[n];
		
		for(int i=0;i<n;i++) {
			students[i] = new Student();
			System.out.println("\nEnter details of Student " + (i+1) + ":");
			students[i].accept(sc);
		}
		System.out.println("\n---Output---\n");
		for(int i=0;i<n;i++) {
			students[i].display();
		}
		sc.close();
	}
}