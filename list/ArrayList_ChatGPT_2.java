package list;

import java.util.*;

public class ArrayList_ChatGPT_2 {

	public static void main(String[] args) {

		// Creating an ArrayList of Strings
		ArrayList<String> fruits = new ArrayList<>();

		// Adding elements using add(E e)
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");

		System.out.println("Initial List: " + fruits);

		// Adding an element at a specific index
		fruits.add(2, "Pineapple");
		System.out.println("After adding Pineapple at index 2: " + fruits);

		// Getting an element at a specific index
		String fruit = fruits.get(1);
		System.out.println("Element at index 1: " + fruit);

		// Replacing an element at a specific index
		fruits.set(3, "Grapes");
		System.out.println("After replacing element at index 3 with Grapes: " + fruits);

		// Removing an element at a specific index
		fruits.remove(4);
		System.out.println("After removing element at index 4: " + fruits);

		// Removing an element by its value
		fruits.remove("Apple");
		System.out.println("After removing Apple: " + fruits);

		// Checking if the list contains a specific element
		boolean containsBanana = fruits.contains("Banana");
		System.out.println("Contains Banana: " + containsBanana);

		// Getting the size of the ArrayList
		int size = fruits.size();
		System.out.println("Size of the ArrayList: " + size);

		// Iterating over the ArrayList using an Iterator
		System.out.print("Elements using Iterator: ");
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// Iterating over the ArrayList using a ListIterator
		System.out.print("Elements using ListIterator (forward): ");
		ListIterator<String> listIterator = fruits.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();

		System.out.print("Elements using ListIterator (backward): ");
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();

		// Adding all elements from another collection
		ArrayList<String> tropicalFruits = new ArrayList<>();
		tropicalFruits.add("Papaya");
		tropicalFruits.add("Coconut");

		fruits.addAll(tropicalFruits);
		System.out.println("After adding all tropical fruits: " + fruits);

		// Finding the index of an element
		int indexOfMango = fruits.indexOf("Mango");
		System.out.println("Index of Mango: " + indexOfMango);

		// Finding the last index of an element
		fruits.add("Mango"); // Add Mango again
		int lastIndexOfMango = fruits.lastIndexOf("Mango");
		System.out.println("Last index of Mango: " + lastIndexOfMango);

		// Sorting the ArrayList
		Collections.sort(fruits);
		System.out.println("Sorted List: " + fruits);

		// Clearing the entire list
		fruits.clear();
		System.out.println("After clearing the list: " + fruits);

		// Checking if the list is empty
		boolean isEmpty = fruits.isEmpty();
		System.out.println("Is the ArrayList empty? " + isEmpty);

	}

}
