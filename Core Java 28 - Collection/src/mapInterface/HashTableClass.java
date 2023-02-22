package mapInterface;


import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashTableClass {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hm= new Hashtable<Integer, String>();
		
		hm.put(4, "John");
		hm.put(1, "James");
		hm.put(2, "Peter");
		hm.put(3, "Alvin");
		//hm.put(5, null);
		//hm.put(6, null);
		
		System.out.println(hm);
		
		//A Map interface can't be traverse so we need to convert it into Set using map.entry method.
		//It provides getKey() and getValue()methods to get key and value.
		
		for(Map.Entry data:hm.entrySet()) {
			System.out.println("Key is: " + data.getKey() + " " + "Value is: " + data.getValue());
		}
	}

}
