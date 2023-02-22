package basic;

import java.util.ArrayList;

//int a[]= {1,3,5,6} write method to print 2 and 4
public class Interview {

	public static void main(String[] args) {
		
		
		int num = 5389;
		int rem, rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println("Reverse number is" + " " +rev);
		
		

	}

}
