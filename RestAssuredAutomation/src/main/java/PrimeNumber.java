import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//int num=7;//It can devide by only 0 and 1. so program logic is devide 7 with 2,3,4,5,6.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = s.nextInt();
		
		int temp=0;
		
		for(int i=2; i<=num-1;i++) 
		{
			if(num%i==0) 
			{
				temp=temp+1;
			}
			
		}
		
		if(temp==0) 
		{
			System.out.println(num + " " + "is prime number");
		}
		else {
			System.out.println(num + " " + "is not prime number");
		}

	}

}
