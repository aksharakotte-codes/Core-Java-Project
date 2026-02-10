package com.javaintro;

public class TestDemo6 {
	
	native void hello();
	
	void main() {
		System.out.println("Instance Method called");
	}


	public static void main(String[] args) {
		System.out.println("Static Main Method called");
		TestDemo6 testDemo6 = new TestDemo6();
		testDemo6.main();
		testDemo6.hello();
		
	}

}
