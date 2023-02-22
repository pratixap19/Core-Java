package linkedList;
//Followed SDET tutorial
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		
		//LinkedList<Integer> l = new LinkedList<Integer>();// <Interger> is called type parameter from generics. 
		//Here Integer is a wrapper class.
		//LinkedList<String>  l= new LinkedList<String>();
		
		LinkedList l = new LinkedList();
		
		l.add(100);
		l.add("Welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		System.out.println(l);
		System.out.println(l.size());
		
		//remove()
		l.remove(3);
		System.out.println("After removing element " + l);
		l.remove(15.5);
		System.out.println("After removing element " + l);
		
		//insert() adding element in the middle of LinkedList
		l.add(2, "Java");
		System.out.println("After inserting element" + l);
		
		//Retrieving element from the LinkedList
		
		System.out.println(l.get(3));
		
		//Change the value
		l.set(1, "Python");
		System.out.println("After changing the value of element " + l);
		
		//contains()
		System.out.println(l.contains("Java"));
		
		//isEmpty()
		System.out.println(l.isEmpty());
		
		//To read LinkedList data
		//There are three ways to read data from LinkedList
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		for(Object o:l) {
			System.out.println(o);
		}
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
