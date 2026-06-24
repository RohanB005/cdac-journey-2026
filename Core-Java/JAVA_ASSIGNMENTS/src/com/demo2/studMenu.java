package com.demo2;

import java.util.Scanner;

class Stud{
	int studId;
	String name;
	int m1, m2, m3;
	double gpa;
	
	void accept(Scanner sc) {
		System.out.println("Enter Student id: ");
		studId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter M1: ");
		m1 = sc.nextInt();
		
		System.out.println("Enter M2: ");
		m2 = sc.nextInt();
		
		System.out.println("Enter M3: ");
		m3 = sc.nextInt();
	}
	void display() {
		System.out.println("Student ID: " + studId);
		System.out.println("Name: " + name);
		System.out.println("M1: " + m1);
		System.out.println("M2: " + m2);
		System.out.println("M3: " + m3);
		System.out.println("GPA: " + calculateGPA());
		System.out.println();
	}
	double calculateGPA() {
		gpa = (1.0/3)*m1 + (1.0/2)*m2 + (1.0/4)*m3;
		return gpa;
	}
}
public class studMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		
		Stud[] studs = new Stud[n];
		
		for(int i=0;i<n;i++) {
			studs[i] = new Stud();
			System.out.println("\nEnter details of student: ");
			studs[i].accept(sc);
		}
		int choice;
		do {
			System.out.println("\n---Menu----");
			System.out.println("1. Display all student");
			System.out.println("2. Search by ID");
			System.out.println("3. Search by Name: ");
			System.out.println("4. Calculate GPA: ");
			System.out.println("5. Exit");
			System.out.println("Enter choice: ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				for(Stud s:studs) {
					s.display();
				}
				break;
				
			case 2:
				System.out.println("ENter ID to search: ");
				int id = sc.nextInt();
				boolean foundId = false;
				
				for(Stud s:studs) {
					if(s.studId == id) {
						s.display();
						foundId = true;
					}
				}
				if(!foundId)
					System.out.println("Student not found!");
				break;
				
			case 3:
				sc.nextLine();
				System.out.println("Enter name to search: ");
				String name = sc.nextLine();
				boolean foundName = false;
				
				for(Stud s: studs) {
					if(s.name.equalsIgnoreCase(name)) {
						s.display();
						foundName = true;
					}
				}
				if(!foundName)
					System.out.println("Student not found!");
				break;
				
			case 4:
				System.out.println("Enter ID to calculate GPA: ");
				int sid = sc.nextInt();
				boolean foundGPA = false;
				
				for(Stud s:studs) {
					if(s.studId == sid) {
						System.out.println("GPA of " + s.name + " = " + s.calculateGPA());
						foundGPA = true;
					}
				}
				if(!foundGPA) {
					System.out.println("Student not found!");
				break;		
				}
			case 5:
				System.out.println("Exiting...");
				break;
			
			default:
				System.out.println("Invalid choice!");
			}
		}while(choice != 5);
		sc.close();
	}
}

