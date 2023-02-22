package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapClassDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "James");
		hm.put(2, "Peter");
		hm.put(3, "Alvin");
		hm.put(4, "John");
		hm.put(4, "John");
		hm.put(5, "John");
		
		System.out.println(hm);
		
		//A Map interface can't be traverse so we need to convert it into Set using map.entry method.
		//It provides getKey() and getValue()methods to get key and value.
		
		for(Map.Entry data:hm.entrySet()) {
			System.out.println("Key is: " + data.getKey() + " " + "Value is: " + data.getValue());
		}
	}

}
