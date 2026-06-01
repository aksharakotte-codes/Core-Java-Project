package com.exceptionhandling;

public class TestExDemo7 {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		try {
			System.out.println("In Try1");
			try {
				System.out.println("In Try2");
				System.out.println(10 / 0);
			} catch(Exception e) {
				System.err.println("In Catch2");
			}finally {
				System.out.println("In Finally2");
			}
			System.out.println(10 / 0);
			System.out.println("Hello");
		} catch(Exception e) {
			System.err.println("In Catch1");
			try {
				System.out.println("In Try3");
				System.out.println(10 / 0);
			} catch(Exception e1) {
				System.err.println("In Catch3");
			}finally {
				System.out.println("In Finally3");
			}
		}  finally {
			try {
				System.out.println("In Try4");
			} catch(Exception e1) {
				System.err.println("In Catch4");
			} finally {
				System.out.println("In Finally4");
			}
			System.out.println("In Finally1");
		}
		
		System.out.println("Main Method Ended");

	}

}
