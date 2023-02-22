package com.JavaPracticePrograms;
//Return the maximum occurrence of character from the string “aabbdcccccdd”.
public class MaximumAccuranceOfString {

	public static void main(String[] args) {
		
		String s = "aabbdcccccdd";
		
		int totalCount=s.length();
		
		int totalcounts_afterRemove = s.replace("c", "").length();
		
		int count = totalCount - totalcounts_afterRemove;
		
		System.out.println(count);

	}

}
