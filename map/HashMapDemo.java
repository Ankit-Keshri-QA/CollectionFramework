package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// Declaration
		HashMap hm = new HashMap();
		Map hm1 = new HashMap();
		HashMap<String, String> hm2 = new HashMap<String, String>();

		// Working model
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(101, "Ankit");
		myMap.put(102, "Saurabh");
		myMap.put(103, "Vaibhav");
		myMap.put(104, "Ishan");
		myMap.put(105, "Abhishek");
		myMap.put(104, "Hasrh"); // Duplicate Key

		// Printing HashMap
		System.out.println(myMap);

		// Size
		System.out.println(myMap.size());

		// Removing a pair
		myMap.remove(105); // Key 105 pair will be removed
		System.out.println(myMap);

		// Access Value of a Pair
		System.out.println(myMap.get(102));
		System.out.println(myMap.get(104));

		// Get All keys of the map
		System.out.println(myMap.keySet());

		// Get All the Values
		System.out.println(myMap.values());
		
		// Access Both
		System.out.println(myMap.entrySet());

	}

}
