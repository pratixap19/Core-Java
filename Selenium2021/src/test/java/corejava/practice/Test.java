package corejava.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		int num=5432;
		int rem,rev=0;
		while(num!=0) {
			rem=num%10; //2, 3, 4,5
			rev=rev*10+rem;//2, 23,234,2345
			num=num/10;//543,54,5,0
		}
		
		System.out.println(rev);
		
}
}
