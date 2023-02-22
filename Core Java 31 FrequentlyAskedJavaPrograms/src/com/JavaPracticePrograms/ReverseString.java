package com.JavaPracticePrograms;
//We will use two methods. length() and charAt().
public class ReverseString {

	public static void main(String[] args) {
		
		String name = "madam";
		int l = name.length();
		String rev = "";
		
		for(int i=l-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
        System.out.println(rev);
        
	
	if(rev==name) {
    	System.out.println("it is palindrom");
    }
	}
}