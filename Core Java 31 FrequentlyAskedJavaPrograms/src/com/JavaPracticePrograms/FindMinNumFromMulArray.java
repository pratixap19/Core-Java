package com.JavaPracticePrograms;
//Find minimum number from the array. followed Rahul Shetty.
//Find maximum number from the array.
public class FindMinNumFromMulArray {

	public static void main(String[] args) {
		
		int abc[][] = {{2,4,5},{3,4,7},{1,2,9}};
		int min = abc[0][0];//assume min is [0][0]
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				if(abc[i][j]<min) 
				{
					min=abc[i][j];
				}
			}
		}
		
System.out.println(min);
	}

}
