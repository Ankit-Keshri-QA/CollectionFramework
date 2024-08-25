package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyPractise {

	public static void main(String[] args) {

		// Creating an ArrayList of Strings
		ArrayList<String> fruits = new ArrayList<String>();

		// Adding elements using add(E e)
		fruits.add("Banana");
		fruits.add("Pomegranade");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Beetroot");

		// Print ArrayList
		System.out.println("1. List Creation " + fruits);

		// Size
		System.out.println("2. Size of List: " + fruits.size());

		// Add at a particular index
		// ! -- ! fruits.add(7,"Mango"); - Size is 5 , Index is 7
		// (IndexOutOfBoundException)

		fruits.add(3, "Mango"); // Added Mando at 3 index.

		// Print ArrayLista after adding mango
		System.out.println("3. New List " + fruits);
		System.out.println("New Size : " + fruits.size());

		// Remove at index
		fruits.remove(1); // Remove Pomegranade
		System.out.println("4. After Removing 1 index : " + fruits);
		System.out.println("New Size : " + fruits.size());

		// Set at an index
		// --! -- fruits.set(10, "New Fruit"); // Size is 5 , Index is 10
		// (IndexOutOfBoundException)

		fruits.set(3, "Mosambi"); // Orange -> Mosambi
		System.out.println("5. New List Post Updation : " + fruits);

		// Get a value/item based on index
		System.out.println("6. Get Method : " + fruits.get(3));
		String fruitName = fruits.get(2);
		System.out.println("Fruit Picked is : " + fruitName);
		// !--! fruits.get(100); --> 100 Index not available IndexOutOfBoundException

		// Contains
		System.out.println("7. Contains: "+fruits.contains("Beetroot"));
		boolean isPresent = fruits.contains("Mango");
		System.out.println(isPresent);
		System.out.println(fruits.contains("Random"));

		System.out.println("Current Size : " + fruits.size());

		// Is List Empty ??
		System.out.println("8. isEmpty()-> "+fruits.isEmpty());

		// IndexOf
		int indexOfApple = fruits.indexOf("Apple");
		System.out.println("9. "+indexOfApple);
		System.out.println(fruits.indexOf("Mosambi"));

		System.out.println("Index of A Fruit which is not present " + fruits.indexOf("Random False")); // -1

		// Iterator
		System.out.println();
		System.out.println("For Loop : ");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i) + " , ");
		}

		System.out.println();
		System.out.println("For Each Loop : ");
		for (String fruit : fruits) {
			System.out.print(fruit + " , ");
		}
		
		System.out.println();
		System.out.println("Iterator : ");
		
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" , ");
		}
		
		// Remove Random Elements
		System.out.println();
		System.out.println("Current List and Size : \n"+fruits+"\n"+fruits.size());
		
		List<String> newFruitList = new ArrayList<>();
		newFruitList.add("Apple");
		newFruitList.add("Mosambi");
		
		// Remove items from fruits List
		
		fruits.removeAll(newFruitList);
		System.out.println();
		System.out.println("New List and Size : \n"+fruits+"\n"+fruits.size());
		
		// Clear Complete List
		fruits.clear();
		newFruitList.clear();
		
		// Is List Now Empty ??
		System.out.println("List fruits is Empty : "+fruits.isEmpty());
		System.out.println("List newfruits is Empty : "+fruits.isEmpty());
		
		// Size
		System.out.println( "Size of List: " + fruits.size());
		System.out.println( "Size of Created List: " + newFruitList.size());
		
		

	}

}
