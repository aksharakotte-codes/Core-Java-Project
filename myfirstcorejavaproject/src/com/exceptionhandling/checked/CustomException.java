package com.exceptionhandling.checked;

//Whenever the class extends Exception will be a "Checked Exception".
//Whenever the class extends RuntimeException will be a "Un-Checked Exception".
public class CustomException extends RuntimeException{
	
	public CustomException(String s) {
		super(s);
	}
}
