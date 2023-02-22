package hashSet;

import java.util.HashSet;

//Followed SDET tutorial
//union, intersection and difference
public class HashSetDemo3 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("HashSet 1: " + set1);//[1, 2, 3, 4, 5]
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("HashSet 2: " + set2);//[3, 4, 5]
		
		//Union
		set1.addAll(set2);
		System.out.println("Union " + set1);//[1, 2, 3, 4, 5]
		
		//Intersection
		//set1.retainAll(set2);
		//System.out.println("Intersection elements " + set1);//[3, 4, 5]
		
		//difference
		//set1.removeAll(set2);
		//System.out.println("Difference is " + set1);
		
		//subset
		System.out.println(set1.containsAll(set2));//true
		
		
	}
		
}
	

