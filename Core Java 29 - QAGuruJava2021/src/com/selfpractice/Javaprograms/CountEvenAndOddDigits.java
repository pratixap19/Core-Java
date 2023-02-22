package com.selfpractice.Javaprograms;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
		int num = 12345;
		
		int even_count =0;
		
		int odd_count = 0;
		
		while(num>0)//12345,1234,123,12,1
		{
			
			int rem = num % 10;//5, 4, 3, 2, 1
			
			if(rem%2 == 0) {
				
				even_count++;//1, 2,
			}
			else {
				
				odd_count++;//1, 2, 3
			}
			
			num = num/10;//1234, 123, 12, 1
			
			}
		System.out.println("Number of even numbers:" +" "+even_count);
		
		System.out.println("Number of even numbers:" +" "+odd_count);
	}

}
