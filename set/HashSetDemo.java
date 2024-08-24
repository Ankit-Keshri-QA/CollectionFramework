package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		// Declaration
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		// Set set3 = new Set() // not possible
		HashSet<String> set4 = new HashSet<String>();
		HashSet<Integer> set5 = new HashSet<Integer>();
		// HashSet<Fruits> set6 = new HashSet<Fruits>(); - Fruits calss Datatype

		// Working Model

		HashSet mySet = new HashSet();
		mySet.add(100);
		mySet.add(10.5);
		mySet.add("Hello");
		mySet.add(true);
		mySet.add('A');
		mySet.add(100); // no compile time error
		mySet.add(null);
		mySet.add("Hello"); // no compile time error
		mySet.add(null); // no compile time error

		// Printing Hashset
		System.out.println(mySet);
		System.out.println("Size: " + mySet.size());
		// o/p:- [null, A, 100, Hello, 10.5, true]
		/*
		 * 1. Insertion Order is not preserved 
		 * 2. Duplicate values not allowed 
		 * 3.
		 * Duplicate null not allowed
		 */

		// Removing an element
		// Since , indexing concept is not there in Hashset, Removing a value based on
		// index not possible

		mySet.remove(10.5); // Here 10.5 is a value not index.

		System.out.println();
		System.out.println("After Removing 10.5 : " + mySet);

		System.out.println("Size:- " + mySet.size());

		// Inserting element
		// Not possible as insertion order is random and not defined, inserying a value
		// is not possible

		// Access specific value - Not possible

		// ----- CONVERT HashSet into ArrayList ------ //

		ArrayList myList = new ArrayList(mySet);
		System.out.println("List " + myList);
		// Now we can remove an element, access specific element and insert element in
		// this list

		System.out.println(myList.get(3));
		System.out.println(myList.get(2));

		// Insert a new value
		myList.add(4, "Item Added in List");
		System.out.println(myList);

		// Remove now
		myList.remove(4);

		System.out.println("Removed item " + myList);

		// ------- DEMO DONE ------ //
		System.out.println();
		// Iterate over the Set

		// Normal for loop is not possible as it does have index
		System.out.println("Using for each loop:");
		for (Object items : mySet) {
			System.out.print(items + " - ");
		}

		System.out.println();
		System.out.println("Using Iterator: ");

		Iterator<Object> it = mySet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" - ");
		}
		System.out.println();
		System.out.println();
		
		// Contains
		System.out.println(mySet.contains(100));
		System.out.println(mySet.contains("Random"));
		System.out.println(mySet.contains("Hello"));
		
		// Clear The Set
		System.out.println("Is Set Empty: "+mySet.isEmpty());
		mySet.clear();
		System.out.println("Is Set Empty: "+mySet.isEmpty());
		System.out.println(mySet.size());
		

	}

}
