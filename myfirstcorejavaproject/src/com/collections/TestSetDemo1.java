package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestSetDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
//		---------------------HashMap Demo--------------------------
		Map<Integer, String> m = new HashMap<>();
		
//		Associates the specified value with the specified key in this map
		m.put(7, "Dhoni");
		m.put(18, "Virat");
		m.put(34, "Pandya");
		m.put(35, "Pandya");// Duplicate values allowed, Key must be unique
		
		System.out.println("HashMap Output:" + m);
		
//		HashSet : Constructs a new, empty set; 
//		the backing HashMap instance has default initial capacity (16)
//		and load factor (0.75).
//		HashSet internally works based on HashMap
//		HashMap creates a internal table with a 16 capacity.
		
//		Whatever we are sending the value for a HashSet will consider as Key for Internal HashMap.
//		What is the value for these key's..? Ans is: PRESENT = new Object() for every key.
		
//		Then How the key will be storing in bucket..? "
//		    Key % Bucket size 16
		
//		But,once elements it's reaching Threshold --> Current Capacity(16) * Load Factor(0.75) -->12
//		Then, the Capacity will be Double like ---> 32  then Calculations also changing with 32
		
//      Every Bucket is Linked List internally,
//		When we have more than one elements in a same Bucket,
//		it's arranging inside Linked List will consider as Hash Collision.
		
//		In One Bucket,the Linked List size is Greater than 8 then from Java 8 onwards its using 
//		RED BLACK TREE for Better performance
		Set<Integer> set = new HashSet<>();// map = new HashMap<>();
		set.add(18);// 18%16 = 2
		set.add(18);//Ignores duplicate values
		set.add(34);//34%16 =2
		set.add(37);//37%16=5
		set.add(27);//27%16=11
		set.add(45);//45%16=13
		set.add(52);//52%16=4
		set.add(77);//77%16=13 
		set.add(99);//99%16=3
//		Output : [18, 34, 99, 52, 37, 27, 45, 77]
		System.out.println("HashSet Output : " + set);
		System.out.println("Main Method Ended!!");

	}

}
