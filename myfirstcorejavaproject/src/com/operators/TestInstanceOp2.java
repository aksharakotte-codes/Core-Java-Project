package com.operators;
//Parent
class A {
	
}
//Child
class B extends A{
	
}
public class TestInstanceOp2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");

		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof A);//true
//      Why false? where a is the parent of B.So it not possible for reverse	
		System.out.println(a instanceof B);//false	
		System.out.println(b instanceof B);//true
//      Why true? where b is the children of A.So it possible for child	
		System.out.println(b instanceof A);//true
	}

}
