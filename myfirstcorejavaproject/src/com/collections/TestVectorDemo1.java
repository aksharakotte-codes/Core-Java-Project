package com.collections;

import java.util.Enumeration; 
import java.util.Vector;

public class TestVectorDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Vector<Integer> v1 = new Vector<>();
		v1.add(101);
		v1.add(102);
		v1.add(103);
		v1.add(104);
		v1.add(105);
		
		v1.addElement(106);
		v1.addElement(107);
		v1.addElement(108);
		System.out.println(v1);
		
//		Returns an enumeration of the components of this vector. 
		Enumeration<Integer> en = v1.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		System.out.println("Main Method Ended");
	}

}
