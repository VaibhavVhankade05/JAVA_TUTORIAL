package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection 
{
	/*
		# Collections in Java
			Java Collection means a single unit of objects.
			The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
			Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
			Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

		# What is Collection framework
			The Collection framework represents a unified architecture for storing and manipulating a group of objects. 
			It enhances code efficiency and readability by offering various data structures, including arrays, linked lists, trees, and hash tables, tailored to different programming needs. 
			It has:
				Interfaces and its implementations, i.e., classes
				Algorithm

	 */

	static void UseOfCollection() 
	{  
		// Initialize an array of integers.  
		int[] numbersArray = new int[]{1, 2, 3, 4};
		
		// Print the first element of the array.  
		System.out.println("First element of numbersArray: " + numbersArray[0]); 
		
		
		
		
		
		
		
		
		 
		
		// Create an ArrayList to hold Integer objects.  
		List<Integer> numbersList = new ArrayList<>(); 
		// Add elements to the ArrayList.  
				numbersList.add(1);  
				numbersList.add(2);
				
		// Print the first element of the ArrayList.  
		System.out.println("First element of numbersList: " + numbersList.get(0)); 
		
		// Print the first element of the ArrayList.  
				System.out.println(" element of numbersList: " + numbersList.get(1)); 
		
		
		
		
		// Create a HashMap to map Integer keys to String values.  
		Map<Integer, String> numbersMap = new HashMap<>(); 
		// Put key-value pairs into the HashMap.  
		numbersMap.put(1, "alpha");  
		 numbersMap.put(2, "beta"); 
		
		
		
		
		// Add elements to the ArrayList.  
		numbersList.add(1);  
		numbersList.add(2);  
		
		
		
		
		 
		

		// Print the value associated with key 1 in the HashMap.  
		System.out.println("Value for key 1 in numbersMap: " + numbersMap.get(1));  
		
		
		
		
		// Header for iterating over the array.  
		System.out.println("\nIterating over numbersArray:");  
		
		
		
		// Iterate through the array and print each element.  
		for (int num : numbersArray) {  
			System.out.println("Element: " + num);  
		}  
		
		
		
		
		
		// Header for iterating over the ArrayList.  
		System.out.println("\nIterating over numbersList:"); 
		
		
		
		
		// Iterate through the ArrayList and print each element.  
		for (Integer num : numbersList) {  
			System.out.println("Element: " + num);  
		}  
		
		
		
		
		// Header for iterating over the HashMap.  
		System.out.println("\nIterating over numbersMap:");  
		
		
		
		
		// Iterate through the HashMap and print each key-value pair.  
		for (Map.Entry<Integer, String> entry : numbersMap.entrySet()) {  
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());  
		}
	}
	
	
	public static void main(String[] args) 
	{
		
		UseOfCollection();
	}
}
