package com.JavaPracticePrograms;
//conditions:
//1. natural number>1
//2.It should have two factors 1 and itself number.
//19 1,19 - it is prime number
//28 1, 2,4,7,14,28 - it is not a prime number
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=28;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num; i++) {
				
				if(num/i==0) 
					count++;
				
			}
				if(count==2) {
					System.out.println("It is a prime number");
				}
				else {
					System.out.println("It is not a prime number");
				}
				
			
		}
		else {
			System.out.println("It is not a prime number");
		}

	}

}
