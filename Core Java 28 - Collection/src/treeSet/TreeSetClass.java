package treeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		
		TreeSet<Integer> tr = new TreeSet<Integer>();	
		//It sorted elements in acceding order.
		tr.add(12);
		tr.add(43);
		tr.add(30);
		tr.add(4);
		tr.add(54);
		tr.add(54);
		//tr.add(null);//it doesn't allow null values.
		
		System.out.println(tr);
		
		//There is no get() in set interface so first we need to convert it to ArrayList.
		ArrayList<Integer> ar = new ArrayList<Integer>(tr);
		System.out.println("Third element is " + ar.get(3));
		
	}

}
