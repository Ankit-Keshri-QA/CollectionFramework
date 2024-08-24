package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Iterator;

public class HashSet_ChatGPT {

	public static void main(String[] args) {
		// Create a HashSet
		HashSet<String> set = new HashSet<>();

		// 1. add(E e): Add elements to the set
		set.add("Apple");
		set.add("Banana");
		set.add("Mango");
		set.add("Orange");

		System.out.println("Original Set: " + set);

		// 2. contains(Object o): Check if the set contains an element
		System.out.println("Does the set contain 'Banana'? " + set.contains("Banana"));

		// 3. remove(Object o): Remove an element from the set
		set.remove("Banana");
		System.out.println("Set after removing 'Banana': " + set);

		// 4. size(): Get the size of the set
		System.out.println("Set size: " + set.size());

		// 5. isEmpty(): Check if the set is empty
		System.out.println("Is the set empty? " + set.isEmpty());

		// 6. iterator(): Get an iterator and loop over the set
		System.out.println("Iterating over the set:");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 7. toArray(): Convert the set to an array
		Object[] array = set.toArray();
		System.out.println("Set converted to array:");
		for (Object element : array) {
			System.out.println(element);
		}

		// 8. addAll(Collection<? extends E> c): Add all elements from another
		// collection
		HashSet<String> anotherSet = new HashSet<>();
		anotherSet.add("Grapes");
		anotherSet.add("Apple");
		set.addAll(anotherSet);
		System.out.println("Set after adding another set: " + set);

		// 9. removeAll(Collection<?> c): Remove all elements in the specified
		// collection from the set
		set.removeAll(anotherSet);
		System.out.println("Set after removing another set: " + set);

		// 10. retainAll(Collection<?> c): Retain only the elements that are also in the
		// specified collection
		anotherSet.add("Mango");
		set.retainAll(anotherSet);
		System.out.println("Set after retaining elements from another set: " + set);

		// 11. clear(): Remove all elements from the set
		set.clear();
		System.out.println("Set after clear(): " + set);

		// 12. Converting Set to List
		HashSet<String> fruitSet = new HashSet<>();
		fruitSet.add("Kiwi");
		fruitSet.add("Papaya");
		fruitSet.add("Lemon");

		List<String> fruitList = new ArrayList<>(fruitSet);
		System.out.println("Converted Set to List: " + fruitList);

		// Perform some operations on the List
		fruitList.add("Strawberry");
		System.out.println("List after adding 'Strawberry': " + fruitList);

		fruitList.remove("Papaya");
		System.out.println("List after removing 'Papaya': " + fruitList);

	}

}
