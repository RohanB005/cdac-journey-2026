package com.pkg.stack;

import java.util.*;

public class StackOperation {
	public static void stackDemo() {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Stack: " + stack);
		
		System.out.println("Top Element: " + stack.peek());
		
		System.out.println("Remove Element: " + stack.pop());
		
		System.out.println("Stack after pop: " + stack);
		
		System.out.println("Is Stack Empty? " + stack.isEmpty());
	}

}
