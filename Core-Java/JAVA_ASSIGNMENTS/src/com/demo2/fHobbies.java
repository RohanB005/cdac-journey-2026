package com.demo2;

import java.util.*;

class Friend{
	int id;
	String name;
	String lastname;
	String[] hobbies;
	String mobno;
	String email;
	String bdate;
	String address;
	
	void accept(Scanner sc) {
		System.out.print("Enter ID: ");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter FirstName: ");
		name = sc.nextLine();
		
		System.out.print("Enter LastName: ");
		lastname = sc.nextLine();
		
		System.out.print("Enter number of hobbies: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		hobbies = new String[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter hobby " + (i+1)+": ");
			hobbies[i] = sc.nextLine();
		}
		
		System.out.print("Enter Mobile No: ");
		mobno = sc.nextLine();
		
		System.out.print("Enter Email: ");
		email = sc.nextLine();
		
		System.out.print("Enter BirthDate: ");
		bdate = sc.nextLine();
		
		System.out.print("Enter Address: ");
		address = sc.nextLine();
	}
	void display() {
		System.out.println("\nID: " + id);
		System.out.println("Name: " + name + " " + lastname);
		System.out.print("Hobbies: ");
		for(String h:hobbies) {
			System.out.print(h + " ");
		}
		System.out.println("\nMobile: " + mobno);
		System.out.println("Email: " + email);
		System.out.println("Birthdate: " + bdate);
		System.out.println("Address: " + address);
	}
}
public class fHobbies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of friends: ");
		int n = sc.nextInt();
		
		Friend[] friends = new Friend[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("\nEnter details for friend " + (i+1));
			friends[i] = new Friend();
			friends[i].accept(sc);
		}
		int choice;
		do {
			System.out.println("\n---Menu---");
			System.out.println("1. Display All Friends");
			System.out.println("2. Search by ID");
			System.out.println("3. Search by Name");
			System.out.println("4. Search by Hobby");
			System.out.println("5. Exit");
			
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				for(Friend f: friends) {
					f.display();
				}
				break;
			
			case 2:
				System.out.print("Enter ID to search: ");
				int id = sc.nextInt();
				boolean found = false;
				
				for(Friend f:friends) {
					if(f.id == id) {
						f.display();
						found = true;
					}
				}
				if(!found) System.out.println("Friends not found!");
				break;
			
			case 3:
				System.out.println("Enter name to search: ");
				String name = sc.nextLine();
				found = false;
				
				for(Friend f:friends) {
					if(f.name.equalsIgnoreCase(name)) {
						f.display();
						found = true;
					}
				}
				if(!found) System.out.println("Friend not found!");
				break;
				
			case 4:
				System.out.println("Enter hobby: ");
				String hobby = sc.nextLine();
				found = false;
				
				for(Friend f:friends) {
					for(String h : f.hobbies) {
						if(h.equalsIgnoreCase(hobby)) {
							f.display();
							found = true;
							break;
						}
					}
				}
				if(!found) System.out.println("No friend found with this hobby");
				break;
				
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
