package com.demo.list;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}

public class StackLinkedList {
	Node top;
	
	void push(int data) {
		Node newNode = new Node(data);
		top = newNode;
	}
	
	void pop() {
		if(top == null) {
			System.out.println("Stack empty");
			return;
		}
		System.out.println("Removed: " + top.data);
	}
	
	void peek() {
		if(top == null) {
			System.out.println("Stack empty");
			return;
		}
		System.out.println("Top: " + top.data);
	}
	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
		s.push(10);
		s.push(20);
		s.push(30);
		
	}

}
