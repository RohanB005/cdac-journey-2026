package com.demo2.sports;

import java.util.*;

public class ClubApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        int id = 100;

        while (true) {
            System.out.println("\n1.Add Salaried\n2.Add Contract\n3.Add Vendor");
            System.out.println("4.Display All\n5.Search by Id\n6.Search by Name");
            System.out.println("7.Salary by Designation\n8.Department Filter\n9.Exit");
            
            System.out.println("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
            case 1:
            		System.out.print("Enter Name: ");
            		String name = sc.nextLine();
            		
            		System.out.print("Enter Mobile: ");
            		String mob = sc.nextLine();
            		
            		System.out.print("Enter Email: ");
            		String email = sc.nextLine();
            		
            		System.out.print("Enter Dept: ");
            		String dept = sc.nextLine();
            		
            		System.out.print("Enter Desgination: ");
            		String desig = sc.nextLine();
            		
            		System.out.print("Enter DOJ: ");
            		String doj = sc.nextLine();
            		
            		System.out.print("Enter Salary: ");
            		double sal = sc.nextDouble();
            		
            		list.add(new SalariedEmployee(++id, name, mob, email, dept, desig, doj, sal));
            		break;
            		
            case 2:
            		System.out.print("Enter name: ");
            		name = sc.nextLine();
            		
            		System.out.print("Enter mobile: ");
            	    mob = sc.nextLine();
            	    
            	    System.out.print("Enter email: ");
            	    email = sc.nextLine();
            	    
            	    System.out.print("Enter dept: ");
            	    dept = sc.nextLine();
            	    
            	    System.out.print("Enter desig: ");
            	    desig = sc.nextLine();
            	    
            	    System.out.print("Enter doj: ");
            	    doj = sc.nextLine();
            	    
            	    System.out.print("Enter hours: ");
            	    int hours = sc.nextInt();
            	    
            	    System.out.print("Enter rate: ");
            	    double rate = sc.nextDouble();
            	    
            	    list.add(new ContractEmployee(++id, name, mob, email, dept, desig, doj, hours, rate));
            	    break;
            case 3:
            		System.out.print("Enter name: ");
            		name = sc.nextLine();
        		
            		System.out.print("Enter mobile: ");
            		mob = sc.nextLine();
        	    
            		System.out.print("Enter email: ");
            		email = sc.nextLine();
        	    
            		System.out.print("Enter dept: ");
            		dept = sc.nextLine();
            		
            		System.out.print("Enter desig: ");
            		desig = sc.nextLine();
        	    
            		System.out.print("Enter doj: ");
            		doj = sc.nextLine();
            		
            		System.out.print("Enter amount: ");
            		double amt = sc.nextDouble();
            		
            		list.add(new Vendor(++id, name, mob, email, dept, desig, doj, amt));
            		break;
            	    
            case 4:
            		list.forEach(System.out::println);
            		break;

            case 5:
                System.out.print("Enter id: ");
                int sid = sc.nextInt();
                list.stream().filter(e -> e.getId() == sid).forEach(System.out::println);
                break;

            case 6:
            		System.out.print("Enter name: ");
            		String name1 = sc.next();
                list.stream().filter(e -> e.getName().equalsIgnoreCase(name1))
                            .forEach(System.out::println);
                 			break;

            case 7:
                System.out.print("Enter designation: ");
                String d = sc.next();
                list.stream()
                            .filter(e -> e.getDesignation().equalsIgnoreCase(d))
                            .forEach(e -> System.out.println(e.calculateSalary()));
                break;

            case 8:
                    System.out.print("Enter dept: ");
                    dept = sc.next();
                    
                    list.stream()
                            .filter(e -> e.getDept().equalsIgnoreCase(dept))
                            .limit(5)
                            .forEach(System.out::println);
                    break;

            case 9:
            		System.exit(0);
                    
            default:
            		System.out.println("Invalid Choice!");
            }
        }
    }
}