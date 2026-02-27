package com.languagefundamentals.methods;
//With Argument + With Return type
//WAP to find areas of Triangle, Rectangle, Square, Circle
//
//Area of Triangle : 0.5 * breadth * height
//Area of Rectangle: length * breadth
//Area of Square : side * side
//Area of Circle : PI * r * r
// Using instance method
import java.util.Scanner;
public class TestMethodsDemo9 {
	
	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		
//		Area of Triangle : 0.5 * breadth * height
		System.out.println("Enter base:");
		double base = sc.nextDouble();
		
		System.out.println("Enter height:");
		float height = sc.nextFloat();
		
		TestMethodsDemo9 t = new TestMethodsDemo9();
		double AreaOfTriangle= t.findAreaOfTriangle(base, height);
		System.out.println("Area Of Triangle : " + AreaOfTriangle);
		
//		Area of Rectangle: length * breadth
		System.out.println("Enter Length:");
		byte length = sc.nextByte();
		
		System.out.println("Enter Breadth:");
		int breadth = sc.nextInt();
		
		int AreaOfRectangle = (int)t.findAreaOfRectangle(length, breadth);
		System.out.println("Area of Rectangle:" + AreaOfRectangle);
		
//		Area of Square : side * side
		System.out.println("Enter side:");
		double side = sc.nextDouble();
		
	    double AreaOfSquare = t.findAreaOfSquare(side);
		System.out.println("Area of Square:" + AreaOfSquare);
		
//		Area of Circle : PI * r * r
		System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		
	    double AreaOfCircle= t.findAreaOfCircle(radius);
		System.out.println("Area of Circle:" + AreaOfCircle);
		
		sc.close();
		
	}
	
	double findAreaOfTriangle(double b, float h) {
		double AreaOfTriangle = 0.5 * b * h;
		return AreaOfTriangle;
	}
	
	double findAreaOfRectangle(byte l,int b) {
		double AreaOfRectangle = 0.5 * l * b;
		return AreaOfRectangle;
	}	
	
	double findAreaOfSquare(double s) {
		double AreaOfSquare =  s * s;
		return AreaOfSquare;
	}
	
	double findAreaOfCircle(double r) {
		double AreaOfCircle = Math.PI *  r * r;
		return AreaOfCircle;
	}


}
