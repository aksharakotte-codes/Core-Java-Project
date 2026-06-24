package com.collections;

//import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Customer {

	@Override
	public String toString() {
		return "Akshara";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method called from Customer !");
	}
	
}

//Weak HashMap
//hashMap always dominates garbage Collector.So we can say, HashMap Object will not eligible for Garbage Collections even though objects are nullified.
//Garbage Collector dominates WeakHashMap. So objeects are eligible for garbage collections when the objects are nullified.
public class TestMapDemo5 {

	public static void main(String[] args)  {
		System.out.println("Main Method Started!!");

		Map<Object, String> map = new WeakHashMap<>();
		Customer c = new Customer();
		map.put(c, "Java");
		System.out.println(map);
		
		c = null;
		System.gc();
//		Thread.sleep(5000);
		System.out.println(map);

		System.out.println("Main Method Ended!!");
	}

}
