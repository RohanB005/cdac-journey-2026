package com.demo.queue;

public class CircularQueue {

	int size = 5;
	int[] queue = new int[size];
	
	int front = -1;
	int rear = -1;
	
	void enqueue(int data) {
		if((rear + 1) % size == front) {
			System.out.println("Queue overflow");
			return;
		}
		if(front == -1)
			front = 0;
		
		rear = (rear + 1) % size;
		queue[rear] = data;
	}
	void dequeue() {
		if(front == -1) {
			System.out.println("Queue underflow");
			return;
		}
		System.out.println("Removed: " + queue[front]);
		
		if(front == rear) {
			front = rear = -1;
		}else {
			front = (front + 1) % size;
		}
		
	}
	void peek() {
		if(front == -1) {
			System.out.println("Queue empty");
			return;
		}
		System.out.println(queue[front]);
		
	}
	void display() {
		if(front == -1) {
			System.out.println("Queue empty");
			return;
		}
		int i = front;
		
		while(true) {
			System.out.println(queue[i] + " ");
			if(i == rear)
				break;
			
			i = (i+1) % size;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		q.display();
		
		q.peek();
		
		q.dequeue();
		q.dequeue();
		
		q.display();
		
		q.enqueue(70);
		q.enqueue(60);
		
		q.display();

	}

}
