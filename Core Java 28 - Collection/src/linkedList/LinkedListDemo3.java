package linkedList;

import java.util.LinkedList;

//Followed SDET tutorial
//Specific methods of LinkedList
public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		System.out.println(l);
		l.addFirst("Tiger");
		l.addLast("Elephant");
		System.out.println(l);//[Tiger, dog, dog, cat, horse, Elephant]
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println("After removing first and last elements " +l);

	}

}
