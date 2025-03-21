package com.collection;

import java.util.LinkedList;

public class LinkedListExample 
{
	/*
	 * LinkedList implements the Collection interface. 
	 * It uses a doubly linked list internally to store the elements. 
	 * It can store the duplicate elements. 
	 * It maintains the insertion order and is not synchronized. 
	 * In LinkedList, the manipulation is fast because no shifting is required.
	 */


	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		
		al.remove("Ravi");
		
		System.out.println(al);

	} 
}
