package com.selfpractice.Javaprograms;

public class ReverseString {
	

	public static void main(String[] args) {

		String str = "ABCD";
		
		StringBuffer sb = new StringBuffer(str);
		
		StringBuffer rev = sb.reverse();
		
		System.out.println(rev);

	}

}
