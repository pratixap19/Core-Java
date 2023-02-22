package com.JavaPracticePrograms;

public class LargestAndSmallestNumber {
//Naveen Automation video
	public static void main(String[] args) {
		
		int a[] = {4, 10, 45, 78, 39};
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i] > largest) {
				
				largest = a[i];
			}
			
			else if(a[i]<smallest) {
				
				smallest = a[i];
				
			}
			
			
		}
		
		System.out.println("Largest number is:" + largest);
		System.out.println("Smallest number is:" + smallest);

	}

}
