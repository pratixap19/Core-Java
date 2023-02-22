package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Followed SDET tutorial
public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//How to declare ArrayList
		//ArrayList<Integer> al = new ArrayList<Integer>();
		//ArrayList<String> al = new ArrayList<String>();
		//List al = new ArrayList();
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("WelCome");
		al.add(15.5);
		al.add(true);
		al.add('A');
		System.out.println(al);
		//size()
		System.out.println("Number of elements in ArrayList are " + al.size());
		
		//remove()
		System.out.println("Removed element is " + al.remove(1));//here 1 is index
		
		//al.remove("WelCome");//here WelCome is an element
		
		System.out.println("After removing elemnt " + al);
		
		//insert a new element
		al.add(2, "Python");
		System.out.println("After insertion " + al);
		
		//get() retrieve specific element
		System.out.println(al.get(2));
		
		//To replace elements use set()
		al.set(2, "C#");
		System.out.println("After replacing with the new element " + al);
		
		//contains() search
		System.out.println(al.contains("C#"));
		System.out.println(al.contains("C++"));
		
		//isEmpty()
		System.out.println(al.isEmpty());
		
		//how to read elements from ArrayList?
		//1. for loop
		//2. for each loop
		//3. iterator()
		
		System.out.println("Reading elements using for loop");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Reading elements using for each loop");
		
		for(Object e:al) {
			System.out.println(e);
			
		}
		
		System.out.println("Reading elements using of iterator()");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
