package linkedList;

import java.util.Collections;
import java.util.LinkedList;

//Followed SDET tutorial
//sorting and shuffling is only possible if data are homogeneous.
public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		System.out.println(l);
		
		//Same group of elemnts are added into new LinkedList
		LinkedList new_l = new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l);//[X, Y, Z, A, B, C]
		new_l.removeAll(l);
		System.out.println(new_l);//[]
		
		System.out.println("Before sorting " + l);
		Collections.sort(l);
		
		System.out.println("After sorting " + l);
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("After reversing elements " + l);
		
		Collections.shuffle(l);
		System.out.println("After shuffling data/elements " + l);
		
	}

}
