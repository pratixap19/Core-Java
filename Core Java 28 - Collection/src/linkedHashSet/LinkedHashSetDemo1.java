package linkedHashSet;

import java.util.LinkedHashSet;

//followed SDET tutorials
//Same methods are used for HashSet and LinkedHashSet classes.
public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		
		//LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		LinkedHashSet lset = new LinkedHashSet();
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		
		System.out.println(lset);
		
	}

}
