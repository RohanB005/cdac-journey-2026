package com.demo.queue;

public class QueueArray {
	
	int[] queue = new int[5];
	
	int front = 0;
	int rear = -1;
	
	void enqueue(int data) {
		if(rear == queue.length-1) {
			System.out.println("Queue overflow");
			return;
		}
		queue[++rear] = data;
	}
	void dequeue() {
		if(front > rear) {
			System.out.println("Queue underflow");
			return;
		}
		System.out.println("Removed: " + queue[front++]);
	}
	void peek() {
		if(front > rear) {
			System.out.println("Queue empty");
			return;
		}
		System.out.println(queue[front]);
	}
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println(queue[i] + " ");
		}
	}
	public static void main(String[] args) {
		QueueArray q = new QueueArray();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		q.display();
		
		q.peek();
	}

}
