package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//WAp to find Occurences of each Character..?
//input is : Java
//output  : J=1 a=2 v=1
public class TestMapDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();//Java
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		System.out.println(map);
		
		char[] ch = str.toCharArray();// J a v a
		
		
		for(char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for(Map.Entry<Character, Integer> en : entries) {
			System.out.println(en.getKey() + " - " + en.getValue());
		}
		
		System.out.println("Main Method Ended!");
	}

}
