//According to Sadiq.

package com.selfpractice.Javaprograms;

public class FactorialNumber {
	
	public static int fact(int number) {
		
		if(number == 0)
			return 1;
		else {
			return (number*fact(number - 1));
		}
	
	}
	
	//5*4*3*2*1 = ?
	//4*3*2*1 = ?
	//10*9....*2*1 = ?

	public static void main(String[] args) {
		int number = 7;
		int fact = fact(number);
		System.out.println(fact);

	}

}
