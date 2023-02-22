package arrayList;

//followed Automation Testing Insider tutorials
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {

		// Allow elements of all the data type. 
		// as written below using generic.
		ArrayList arrList = new ArrayList();

		arrList.add(23);
		arrList.add("ABCD");
		arrList.add("C");
		arrList.add(23.5);
		System.out.println(arrList);

		// Allows only integer type of data.ArrayList is written using generic.
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		arrList1.add(12);
		arrList1.add(34);
		arrList1.add(56);
		arrList1.add(56);
		arrList1.add(56);
		System.out.println(arrList1);

		// Access an element in ArrayList.
		System.out.println(arrList1.get(2));
		// update an element
		System.out.println(arrList1.set(0, 13));
		System.out.println(arrList1);
		// count no.of elements
		System.out.println(arrList1.size());
		// Insert an element in between
		arrList.add(1, 67);
		System.out.print(arrList1);

		// How to traverse/Iterate elements in ArrayList
		// 1.for loop
		for (int i = 0; i < arrList1.size(); i++) {

			System.out.print(arrList1.get(i));
			System.out.print(" ");// it is written to create space.

		}

		// 2.Using Iterator
		System.out.println(" ");
		Iterator itr = arrList1.iterator();// Iterator interface has iterator()
		while (itr.hasNext()) {
			System.out.println(itr.next());
			// System.out.print(" ");

		}

	}
}
