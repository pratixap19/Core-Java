package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Followed SDET tutorials
public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		//HashMap hm = new HashMap();
		hm.put(101, "John");
		hm.put(102, "Devid");
		hm.put(103, "Scott");
		hm.put(104, "Merry");
		hm.put(105, "Tye");
		hm.put(103, "X");
		hm.put(106, "Devid");

		System.out.println(hm);//{101=John, 102=Devid, 103=X, 104=Merry, 105=Tye, 106=Devid}

		System.out.println(hm.get(105));//Tye
		hm.remove(106);
		System.out.println(hm);//{101=John, 102=Devid, 103=X, 104=Merry, 105=Tye}
		
		System.out.println(hm.containsKey(104));//true
		System.out.println(hm.containsValue("Merry"));//true
		
		System.out.println(hm.isEmpty());//false
		System.out.println(hm.keySet());//[101, 102, 103, 104, 105] It will return all the keys as set
		
		//If we want each element as a key, individually then use for each loop.
		
		for(Object e:hm.keySet()) {
			System.out.println(e);
		}
		
		System.out.println("**********************************");
		
		//System.out.println(hm.values());//[John, Devid, X, Merry, Tye] It will return all the values as Collection
		
		//If we want each element as a value individually then use for each loop.
		
		for(Object i:hm.values()) {
			System.out.println(i);
		}
		
		System.out.println("**********************************");
		
		//First approach: To retrieve all keys and values
		for(Object i:hm.keySet()) {
			System.out.println(i + "  " + hm.get(i));
		}
		
		System.out.println("**********************************");
		
		//Second approach: To retrieve all keys and values by using entrySet() of entry interface.
		
		for(Map.Entry entry:hm.entrySet()) 
		{
			System.out.println(entry.getKey()+ "  " + entry.getValue());
		}
		
		System.out.println("**********************************");
		//Third Approach: To retrieve all entries by using iterator()
		
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+ "   " + entry.getValue());
		}
		
		
		System.out.println("**********************************");
		System.out.println(hm.entrySet());//[101=John, 102=Devid, 103=X, 104=Merry, 105=Tye] It will return all the entries as set
	}

}
