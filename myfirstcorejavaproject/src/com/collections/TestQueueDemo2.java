package com.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueDemo2 {

	public static void main(String[] args) {
        System.out.println("Main Method Started!!");
        
//      Creates a PriorityQueue with the default initial capacity (11) that orders its elements according to their natural ordering.
//      An unbounded priority queue based on a priority heap.
		Queue<Integer> q = new PriorityQueue<>();
		
		q.offer(5);
		q.offer(1);
		q.offer(3);
		q.offer(4);
		q.offer(2);
		
		System.out.println(q);
	}

}
