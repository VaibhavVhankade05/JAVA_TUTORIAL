package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashingExample 
{
	/*
		 * To map data (keys) to a fixed-size value (hash code) using a hash function. 
		 * It helps in efficient searching, storing, and retrieving of data in constant time.
		 * Time Complexity  O(1).


		 * Key Concepts of Hashing
				1. Hash Function
					A function that takes an input (key) and produces a fixed-size hash code.
					Example: hashCode() method in Java.
					Ideal properties:
						* Should distribute data evenly.
						* Should be fast to compute.
						* Should minimize collisions.
				
				2. Hash Table	
					A data structure that stores key-value pairs.
					Uses an array where index positions are determined using a hash function.
				
				3. Collision Handling
					# When two different keys produce the same hash code, it's called a collision.
					# Common techniques to handle collisions:
						* Chaining (Linked List Method): Store multiple elements at the same index using linked lists.
						* 
					# Open Addressing: Find the next available slot within the array.
						* Linear Probing – Check the next slot sequentially.
						* Quadratic Probing – Use a quadratic formula to find the next slot.
						* Double Hashing – Use a secondary hash function to find a new index.

	 */
	
	
	/*
	 	HashMap (Most commonly used)
			* Uses a hash table to store key-value pairs.
			* Implements chaining for collision handling.
			* Provides O(1) time complexity for get(), put() in the best and average cases.
	 */
	
		public static void hashMap()
		{
			HashMap<Integer, String> map = new HashMap<>();
			
	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Cherry");

	        System.out.println(map.get(2));
	        System.out.println(map.get(1));
	        System.out.println(map.get(3));
//	        System.out.println(map.get(4));
		}
		
		
		
		
		
		
		
		
		
		
		/*
		 	HashSet
				* Uses hashing to store unique elements.
				* Internally uses a HashMap with dummy values.
		 */
		
		public static void hashSet()
		{
			HashSet<String> set = new HashSet<>();
			
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");

	        System.out.println(set.contains("Chiku"));
//	        System.out.println(get.("Banana"));
		}
		
		
		
		
		
		/*
		 	hashCode() Method
				* Every object in Java has a hashCode() method (inherited from Object class).
				* It generates an integer hash code for the object.
		 */
		
		
		private String name;
		
		HashingExample(String name)
		{
			this.name=name;
		}
		
		@Override
		 public int hashCode() {
		        return name.length();
		    }
		
		
		public static void main(String[] args) {

			ArrayList al = new ArrayList();
			
			al.add(101);
			al.add(101);
			al.add(101);
			al.add(101);
			al.add(101);al.add(101);
			
			System.out.println(al.get(0));
			
			
//			hashMap();
			
			
//			hashSet();
		
//			 HashingExample obj1 = new HashingExample("Java Tutorial");
//			 HashingExample obj2 = new HashingExample("Python");
//
//		        System.out.println(obj1.hashCode()); // Output: 4
//		        System.out.println(obj2.hashCode()); // Output: 6
			
		}
}
