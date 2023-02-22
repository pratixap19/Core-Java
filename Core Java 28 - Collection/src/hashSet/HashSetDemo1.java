package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//Followed SDET tutorial
public class HashSetDemo1 {

	public static void main(String[] args) {
		//HashSet hs = new HashSet(); default capacity is 16. Load factor is 0.75
		//HashSet hs = new HashSet(100); initial capacity is 100.
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(12);
		hs.add(43);
		hs.add(4);
		hs.add(54);
		hs.add(54);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs); //[null, 4, 54, 43, 12]
		
		//remove()
		hs.remove(54);
		System.out.println("After removing the element " + hs);
		
		System.out.println(hs.contains(54));
		System.out.println(hs.isEmpty());
		
		// How to traverse/Iterate elements in HashSet. Reading objects/elements from HashSet using for each loop and iterator().
		//Since it is not index base so we need to use for each loop and iterator(). HashSet is Hash code based.
		
		for(Integer itr:hs) {
			System.out.println(itr);
		}
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Since it is not index based so we can't get particular element.There is no get() in set interface 
		//so first we need to convert it to ArrayList.

		ArrayList<Integer> ar = new ArrayList<Integer>(hs);
		System.out.println("Third element is " + ar.get(3));
	}

}
