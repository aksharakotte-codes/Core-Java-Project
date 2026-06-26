package com.collections;

//Queue (FIFO) : FIRST IN FIRST OUT
import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
//		Case1 :
		Queue<Integer> q = new LinkedList<>();
		q.add(15);//IllegalStateException
		q.add(10);
		q.add(12);
		q.add(11);
		q.add(14);
//		If Queue is empty then iit throws an error NoSuchElementException
//		Retrieves and removes the head of this queue.
		System.out.println(q.remove());//NoSuchElementException
//		Retrieves, but does not remove, the head of this queue
		System.out.println(q.element());//NoSuchElementException
		System.out.println(q);
		System.out.println("****************************");
		 
//		                    OR
		
//		Case 2 :
		Queue<Integer> q1 = new LinkedList<>();
		q1.offer(18);//true if the element was added to this queue, else false
		q1.offer(16);
		q1.offer(19);
		q1.offer(20);
		q1.offer(17);
		q1.offer(21);
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		System.out.println(q1);
		System.out.println("Main Method Ended!!");
	}

}
