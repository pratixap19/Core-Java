package com.selfpractice.Javaprograms;

public class MaxNumber {

	int max;

	public int maxNumber(int a, int b) {

		if (a > b) {
			max = a;

		} else {
			max = b;
		}

		System.out.println("Max number is " + max);
		
		return max;

	}

	public static void main(String[] args) {

		MaxNumber obj = new MaxNumber();
		obj.maxNumber(4, 8);

	}

}
