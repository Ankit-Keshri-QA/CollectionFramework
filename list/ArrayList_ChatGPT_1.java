package list;

import java.util.*;

public class ArrayList_ChatGPT_1 {

	public static void main(String[] args) {

		// Creating an ArrayList of Strings
		ArrayList<String> fruits = new ArrayList<>();

		// 1. Adding elements to the ArrayList
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		System.out.println("After adding elements: " + fruits);

		// 2. Adding an element at a specific index
		fruits.add(1, "Orange");
		System.out.println("After adding Orange at index 1: " + fruits);

		// 3. Removing an element by value
		fruits.remove("Banana");
		System.out.println("After removing Banana: " + fruits);

		// 4. Removing an element by index
		fruits.remove(2);
		System.out.println("After removing element at index 2: " + fruits);

		// 5. Getting the size of the ArrayList
		int size = fruits.size();
		System.out.println("Size of the ArrayList: " + size);

		// 6. Setting an element at a specific index
		fruits.set(1, "Grapes");
		System.out.println("After setting Grapes at index 1: " + fruits);

		// 7. Getting an element at a specific index
		String fruitAtIndex0 = fruits.get(0);
		System.out.println("Element at index 0: " + fruitAtIndex0);

		// 8. Iterating over the ArrayList using an Iterator
		System.out.print("Iterating over the ArrayList: ");
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// 9. Checking if the ArrayList contains a specific element
		boolean containsApple = fruits.contains("Apple");
		System.out.println("Does the list contain Apple? " + containsApple);

		// 10. Removing all elements from the ArrayList
		ArrayList<String> toRemove = new ArrayList<>();
		toRemove.add("Apple");
		toRemove.add("Grapes");
		fruits.removeAll(toRemove);
		System.out.println("After removing all elements in toRemove: " + fruits);

		// 11. Clearing the ArrayList
		fruits.clear();
		System.out.println("After clearing the ArrayList: " + fruits);

		// 12. Checking if the ArrayList is empty
		boolean isEmpty = fruits.isEmpty();
		System.out.println("Is the ArrayList empty? " + isEmpty);

	}

}
