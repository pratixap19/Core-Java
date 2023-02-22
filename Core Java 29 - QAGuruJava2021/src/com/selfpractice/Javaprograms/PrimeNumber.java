
/*Check given number is prime or not.
 * two conditions
 * Natural number > 1;
 * Which has only two factors 1 and itself
 * 19 - prime number because it is devided by only 1 and 19. 

*/
package com.selfpractice.Javaprograms;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 7;
		
		int count = 0;
		
		if(num>1)
		{
			for(int i=1;i<=7;i++)
			{
				if(num%i==0) 
				{
					count++;
				}
			}
			
			if(count==2) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not a Prime Number");
			}
		}
		else
		{
			System.out.println("Not a prime number");
		
		}

	}

}
