package com.operator;

public class LogicalOperators {

	public static void main(String[] args) {
		 int a = 7;
		 int b = 10;
		 int c = 20;
		 
		 //System.out.println( a < b && a++ > c ); 
		 //System.out.println(a);
		 
		 System.out.println( a < b | a++ > c ); 
		 System.out.println(a);
		 
		//System.out.println(a == b);
		// System.out.println(a >= b);
		// System.out.println(a < b);
		// System.out.println(a < b);  //  false
		 
		 // Logical operators &&, ||
		 // bitwise operator  & , |
		 
		 //System.out.println( a > b && a > c );  // false, true ==> false
		  										// true , true ==> true
		 										// true , false ==> false
		 										// false , false ==> false
		 
		 //System.out.println( a < b || a < c );  // false, false ==> false
												// true , false ==> true
												// false , true ==> true
												// true , true ==> true
	}

}
