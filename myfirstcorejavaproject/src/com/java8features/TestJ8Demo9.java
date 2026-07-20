package com.java8features;
//Cube 

@FunctionalInterface
interface In8 {
	public void cubeit(int n);
}

public class TestJ8Demo9 {

	public static void main(String[] args) {
        System.out.println("Main Method Started");
		
		In8 t = (n) -> System.out.println(n * n * n);
		t.cubeit(4);
        
      
		System.out.println("Main Method Ended");


	}

}
