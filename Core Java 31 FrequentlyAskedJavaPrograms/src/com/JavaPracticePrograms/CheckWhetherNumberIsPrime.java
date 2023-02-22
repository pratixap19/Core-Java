package com.JavaPracticePrograms;
//check if given number is prime number by B Tech Computer Science.
public class CheckWhetherNumberIsPrime {

	public static void main(String[] args) {
	
		int num =11; //1,2,3,4,5,6,7,8,9,10,11
		
		boolean prime=true;//assume
		
	    for(int i=2;i<num;i++) {
	    	if(num%i==0) 
	    	{
	    	prime=false;
	    	break;
	    	}
	    }
	    System.out.println(prime);

	}

}
