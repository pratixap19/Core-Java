package arrayList;
//Followed SDET tutorial
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		//addAll()
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);//[X, Y, Z, A, B, C]
		
		//removeAll()
		al_dup.removeAll(al);
		System.out.println("After removing elements " + al_dup);
		
		//To sort and shuffle elements we need homogeneous data
		
		//sort() from Collections so Collections.sort()
		Collections.sort(al);
		System.out.println("After sorting elements " +al);
		
		//to sort elements in reverse order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("After sorting elements in the reverse order" +al);
		
		//how to suffle elements
		Collections.shuffle(al);
		System.out.println("After shuffling elements " +al);

	}

}
