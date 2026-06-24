package com.demo2.filehandling;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
		service.loadFromFile();
		
		while(true) {
			System.out.println("\n1. Add Student 2.Update 3.Delete 4.Display 5.Exit");
			System.out.println("Enter choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter Degree: ");
				String degree = sc.nextLine();
				
				System.out.println("Enter Email: ");
				String email = sc.nextLine();
				
				service.addStudent(new Student(id, name, degree, email));
				break;
				
			case 2:
				System.out.print("Enter ID to update: ");
				id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter New Name: ");
				name = sc.nextLine();
				
				System.out.println("Enter New Degree: ");
				degree = sc.nextLine();
				
				System.out.println("Enter New Email: ");
				email = sc.nextLine();
				
				service.updateStudent(id, name, degree, email);
				break;
				
			case 3:
				System.out.println("Enter ID to delete: ");
				id = sc.nextInt();
				service.deleteStudent(id);
				break;
				
			case 4:
				service.displayAll();
				break;
				
			case 5:
				service.saveToFile();
				System.out.println("Data saved to file. Exiting...");
				System.exit(0);
			}
		}
	}
}


