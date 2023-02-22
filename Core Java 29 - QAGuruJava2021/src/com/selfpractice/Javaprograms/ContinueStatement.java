package com.selfpractice.Javaprograms;

public class ContinueStatement {

	public static void main(String[] args) {

		int num[] = { 10, 20, 30, 40, 50 };

		for (int x : num) {
			if (x == 30) {
				continue;

			}

			System.out.println(x);
		}
	}

}
