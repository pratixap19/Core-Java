package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

//Followed SDET tutorial
//How to convert array into ArrayList
public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		String arr[] = {"Dog", "Cat", "Elephant"};
		
		for(String e:arr) {
			System.out.println(e);
		}
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}
