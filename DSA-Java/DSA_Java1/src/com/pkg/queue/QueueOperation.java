package com.pkg.queue;

import java.util.*;

public class QueueOperation {
	public static void queueDemo() {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		
		System.out.println("Queue: " + queue);
		
		System.out.println("Top: " + queue.peek());
		
		System.out.println("Removed: " + queue.remove());
		
		System.out.println("Queue: " + queue);
		
		System.out.println("Is queue empty? : " + queue.isEmpty());
	}

}
