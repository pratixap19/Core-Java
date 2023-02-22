package mapInterface;

import java.util.Hashtable;

//followed SDLC tutorials
//All methods are same in HashMap and HashTable
public class HashTableDemo {

	public static void main(String[] args) {
		
		//Hashtable ht = new Hashtable();
		Hashtable<Integer, String> ht = new Hashtable<Integer, String> ();
		ht.put(101, "John");
		ht.put(102, "Devid");
		ht.put(103, "Smith");
		//ht.put(null, "X");//NullPointerException, null is not allowed as key or value
		//ht.put(104, null);//NullPointerException
		System.out.println(ht.get(103));
		
		ht.remove(103);
		System.out.println(ht);
		System.out.println(ht.containsKey(102));// return type is boolean
		System.out.println();
		System.out.println(ht.containsValue("John"));
		System.out.println(ht.isEmpty());
		
		System.out.println(ht.keySet());//[102, 101] It will return keys as set
		System.out.println(ht.values());//[Devid, John] It will return values as Collection
		System.out.println("+++++++++++++++++++++++++++++++++");
		//retrieve value as individual
		for(int k:ht.keySet()) {
			System.out.println(k + " " +ht.get(k));
			//102 Devid
			//101 John
		}
		
	}

}
