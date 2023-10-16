// Java Program to Demonstrate
// Working of Map interface

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
class GFG implements Serializable {

	public static void main(String... args) {
		set();
	}

	// Main driver method
	public static void map() {
		// Creating an empty HashMap
		Map<String, Integer> hm = new HashMap<>();

		// Inserting pairs in above Map
		// using put() method
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);

		// Traversing through Map using for-each loop
		for (Map.Entry<String, Integer> me :
			hm.entrySet()) {

			// Printing keys
			System.out.println(me);
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}

	public static void set() {
		// Demonstrating Set using HashSet
		// Declaring object of type String
		Set<String> hash_Set = new HashSet<>();

		// Adding elements to the Set
		// using add() method
		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks"); // duplicate
		hash_Set.add("Example");
		hash_Set.add("Set");


		hash_Set.forEach(i -> System.out.println(i));

		// Printing elements of HashSet object
		System.out.println(hash_Set);
	}
}