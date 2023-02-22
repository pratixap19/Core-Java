package linkedHashSet;


import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(12);
		hs.add(43);
		hs.add(4);
		hs.add(54);
		hs.add(54);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		
		// How to traverse/Iterate elements in LinkedHashSet. Since it is not indexbase so we need to use for each loop.
		
				for(Integer itr:hs) {
					System.out.println(itr);
				}
				
				//There is no get() in set interface so first we need to convert it to ArrayList.
				
				ArrayList<Integer> ar = new ArrayList<Integer>(hs);
				System.out.println("Third element is " + ar.get(3));

	}

}
