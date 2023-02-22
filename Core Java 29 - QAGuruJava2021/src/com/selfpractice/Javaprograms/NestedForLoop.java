//Outer for loop will create rows. Inner for loop will create columns. Outer loop is responsible for creating lines 
//while inner for loop is responsible for printing.

package com.selfpractice.Javaprograms;

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i);
			}

			System.out.println("\n");
		}

	}

}
