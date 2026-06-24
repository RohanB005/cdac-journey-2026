package com.pkg.linkedlist;

import java.util.*;

public class LinkedListOperation {
	public static void linkedListDemo() {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Linked list: " + list);
		
		list.addFirst(5);
		list.addLast(50);
		
		System.out.println("After adding: " + list);
		
		list.remove();
		System.out.println("After remove: " + list);
		
		System.out.println("First Element: " + list.getFirst());
		System.out.println("Last Element: " + list.getLast());
		
		System.out.println("Size: " + list.size());
		
		
		
	}

}
