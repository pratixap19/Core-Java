package com.exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		try {
		
		a[10]=100;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is finally block");
		}
		
	}

}
