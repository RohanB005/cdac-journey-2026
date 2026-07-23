package com.demo.list;

import java.util.LinkedList;

public class LinkedDemo {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		list.addFirst(5);
		list.addLast(40);
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
	}

}
