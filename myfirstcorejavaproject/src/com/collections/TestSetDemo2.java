package com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSetDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Set<String> s = new HashSet<String>();	
/*		Hash code formula:

        hash = 31 * 0 + 'A'
         = 31 * 0 + 65
           = 65
        Bucket index (capacity = 16):

        65 % 16 = 1 */
		s.add("A");//31 * 0 + 65 = 65 --> 65 % 16 = 1
		s.add("B");//31 * 0 + 66 = 66 --> 66 % 16 = 2
		s.add("D");//31 * 0 + 68 = 68 --> 68 % 16 = 4
		s.add("C");//31 * 0 + 67 = 67 --> 67 % 16 = 3
		s.add("G");//31 * 0 + 71 = 71 --> 71 % 16 = 7
		s.add("F");//31 * 0 + 70 = 70 --> 70 % 16 = 6
		s.add("E");//31 * 0 + 69 = 69 --> 69 % 16 = 5
		s.add(null);
		
		System.out.println(s);
		
		Set<String> set = new HashSet<String>();
		set.add("Sachin");//31 * 0 + 83 = 83 --> 31 * 83 + 97 = 2670 --> 31 * 2670 + 99 = 82869 --> 31 * 82869 + 104 = 2569043 --> 31 * 2569043 + 105 = 79640438 --> 31 * 79640438 + 110 = 2468853688 
//		2468853688 - 4294967296 = -1826113608
		set.add("Kohil");
		set.add("Dhoni");
		set.add("Rohit");
		set.add("Rahul");
		set.add("Jadeja");
		
		System.out.println(set); 
		
		System.out.println("Main Method Ended");
	}

}
