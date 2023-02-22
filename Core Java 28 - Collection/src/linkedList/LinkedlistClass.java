package linkedList;

import java.util.LinkedList;

//followed Automation Testing Insider tutorials
public class LinkedlistClass {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<String>();

		llist.add("C");
		llist.add("C++");
		llist.add("Java");
		llist.add("Python");
		llist.add("Python");
		llist.add("null");

		System.out.println(llist);

		llist.addFirst("C");
		System.out.println(llist);
		
		llist.addLast("JavaScript");
		System.out.println(llist);
		
		llist.remove(4);
		System.out.println(llist);
		
		// How to traverse/Iterate elements in LinkedList
		
		for(int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}

	}

}
