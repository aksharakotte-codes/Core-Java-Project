package com.collections;
import java.util.Stack;

//Queue (FIFO) : First In First Out
//Stack (LIFO) : Last In First Out

public class TestStackDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Stack<String> l1 = new Stack<>();
		l1.push("J2SE");
		l1.push("J2EE");
		l1.push("MYSQL");
		l1.push("HTML");
		l1.push("JAVASCRIPT"); 
		l1.push("CSS");
		l1.push("SERVELTS");
		l1.push("SPRING BOOT");
		l1.push("MICRO SERVICES");
		l1.push("JPA");
		
//		Returns the 1-based position where an object is on this stack.
		System.out.println(l1.search("HTML"));//7
		System.out.println(l1.search("SERVELTS"));//4
		
//		Tests if this stack is empty.True if and only if this stack contains no items; false otherwise.
		System.out.println(l1.empty());//false
//		Removes the object at the top of this stack and returns that object as the value of this function.
		System.out.println(l1.pop());//JPA
//		Looks at the object at the top of this stack without removing it from the stack.
		System.out.println(l1.peek());//MICRO SERVICES
		System.out.println(l1);

	}

}
