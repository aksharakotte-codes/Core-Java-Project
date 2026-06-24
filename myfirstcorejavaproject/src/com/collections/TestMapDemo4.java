package com.collections;

//import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

//HashMap internally uses .equals for Key check.
//identityhashMap uses  == Operator for key check.

//As we knoww  == operators alwayss checks addresses of objects.
//.equals() methods check content of the string
public class TestMapDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
//		Map<String, String> map = new HashMap<>();
		Map<String, String> map = new IdentityHashMap<>();
		
		String s1 = "Java";//Java
		String s2 = "Java";//Java
		
		map.put(s1, "Simple");
		map.put(s2, "More Simple");
		System.out.println(map);
		
		System.out.println("-----------------------------");
//		Map<String, String> map1 = new HashMap<>();
		Map<String, String> map1 = new IdentityHashMap<>();
		String s3 = new String("Java");//Java --> 101
		String s4 = new String("Java");//Java --> 102
		
		map1.put(s3, "Simple");
		map1.put(s4, "More Simple");
		System.out.println(map1);
		
		System.out.println("Main Method Ended!!");
	}

}
