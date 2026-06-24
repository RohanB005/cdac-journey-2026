package com.demo2;

import java.util.*;

public class CityTreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeMap<String, List<String>> map =new TreeMap<>();
		
		while(true) {
			System.out.println("\n1. Add City");
			System.out.println("2. Find trees by City");
			System.out.println("3. Delete City");
			System.out.println("4. Display All");
			System.out.println("5. Exit");
			
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter city name: ");
				String city = sc.nextLine();
				
				if(map.containsKey(city)) {
					System.out.println("City already exits");
					break;
				}
				System.out.print("Enter number of trees: ");
				int n = sc.nextInt();
				sc.nextLine();
				
				List<String> trees = new ArrayList<>();
				
				for(int i=0;i<n;i++) {
					System.out.print("Enter tree name: ");
					trees.add(sc.nextLine());
				}
				
				map.put(city, trees);
				System.out.println("City added successfully");
				break;
				
			case 2:
				System.out.print("Enter city name: ");
				city = sc.nextLine();
				
				if(map.containsKey(city)) {
					System.out.println("Trees in " + city + ": " + map.get(city));
				}else {
					System.out.println("City not found");
				}
				break;
				
			case 3:
				System.out.print("Enter city name: ");
				city = sc.nextLine();
				
				if(map.remove(city) != null) {
					System.out.println("City deleted");
				}else {
					System.out.println("City not found");
				}
				break;
				
			case 4:
				System.out.println("\n----Using Iterator----");
				
				Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
				
				while(it.hasNext()) {
					Map.Entry<String, List<String>> entry = it.next();
					System.out.println(entry.getKey() + "-> " + entry.getValue());
				}
				System.out.println("\n----Using for each----");
				
				for(Map.Entry<String, List<String>> entry : map.entrySet()) {
					System.out.println(entry.getKey() + "->" + entry.getValue());
				}
				break;
				
			case 5:
				System.exit(0);
			}
			
		}
	}

}
