package list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration
		ArrayList list1 = new ArrayList();
		List list2 = new ArrayList();
		ArrayList<String> list3 = new ArrayList(); // Homogenous Arraylist , will only store Strings
		ArrayList<Integer> list4 = new ArrayList<Integer>(); // Homogenous Arraylist , will only store integers.

		// ArrayList<Employee> empList = new ArrayList<Employee>(); -> Employee Class
		// object datatype

		// Ultimately ArrayList can hold only object kinds of data, not priitive types.

		ArrayList myList = new ArrayList();

		// Adding data to the list
		myList.add(1);
		myList.add("Ankit Keshri");
		myList.add(27);
		myList.add(16.55);
		myList.add('M');
		myList.add(true);
		myList.add(null);
		myList.add(null);

		// Size of list
		System.out.println("Size of myList : " + myList.size());

		// Print complete arraylist
		System.out.println("Printing data from ArrayList:- ");
		System.out.println(myList);

		// Removing an item from ArrayList based on index
		myList.remove(4); // 'M' will be removed

		// Print
		System.out.println("After removing index 4 Printing data from ArrayList:- ");
		System.out.println(myList);

		// Size of list post removal
		System.out.println("Size of myList : " + myList.size());

		// Insert item in between arrayList based on index
		myList.add(3, "New Item");

		// Print complete arraylist after adding
		System.out.println("Printing data from new ArrayList:- ");
		System.out.println(myList);

		// Modify the arrayList (modify/replace/change)
		myList.set(3, "Updated Item");

		// Print complete arraylist after modifying
		System.out.println("Printing data after changing ArrayList:- ");
		System.out.println(myList);

		// Retrieve specefic element from arrayList
		System.out.println(myList.get(4));
		System.out.println(myList.get(2));
		System.out.println(myList.get(6));

		System.out.println();

		// Reading the arrayList

		// 1. Normal For Loop , 2. Enhanced For Loop , 3. Iterator Class

		System.out.println("Normal For Loop :- ");
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}

		System.out.println();

		System.out.println("Enhanced For Loop :- ");
		for (Object item : myList) {
			System.out.print(item + " ");
		}

		System.out.println();

//		System.out.println(it.hasNext());
//		System.out.println(it.next());

		System.out.println("Iterator ... ");
		Iterator it = myList.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " 	");
		}
		System.out.println();

		System.out.println();
		// Checking if ArrayList contains an item
		System.out.println(myList.isEmpty());

		while (!myList.isEmpty()) {
			if (myList.contains("Ankit Keshri")) {
				break;
			}
		}

		// Contains
		System.out.println(myList);
		System.out.println(myList.contains(null));
		System.out.println(myList.contains("Some Random Text"));
		System.out.println(myList.contains(16.55));

		// Remove Multiple items randomly from the list
		// This requires a new arraylist which will be passed inside original arraylist

		/*
		 * 1. remove(index) - Remove an item based on a single index sent as a parameter
		 * 2. clear() - To remove all items from the list at once, make list empty 3.
		 * removeAll(newList) - create a new list and delete this from original list
		 *
		 */

		ArrayList myList2 = new ArrayList();

		myList2.add(16.55);
		myList2.add(null); // Both null indexes will be removed, so duplicate items will all be chucked
		myList2.add("Updated Item");

		// Now remove these 3 Items from myList

		myList.removeAll(myList2);

		System.out.println();
		System.out.println("After removing random items from myLIst :- ");
		System.out.println(myList);
		
		// Clear the List
		myList.clear(); // Khatam, Goodbye, Tata, Gya ...
		
		System.out.println();
		System.out.println(myList.isEmpty());
		System.out.println(myList.size());

	}

}
