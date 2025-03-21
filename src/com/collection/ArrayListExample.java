package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample 
{
	/*
		The ArrayList class implements the List interface. 
		It uses a dynamic array to store the duplicate element of different data types. 
		The ArrayList class maintains the insertion order and is non-synchronized. 
		The elements stored in the ArrayList class can be randomly accessed.

	 */


	public static void main(String[] args) 
	{
		
		ArrayList arrayList = new ArrayList<>();
		
		arrayList.add(101);
		
		arrayList.add(102);
		
		arrayList.add(103);
		
		arrayList.add(104);
		
		System.out.println("Array List: "+arrayList);
		
		arrayList.addFirst(105);
		
		System.out.println("First: "+arrayList);
		
		arrayList.addLast(106);
		
		System.out.println("Last: "+arrayList);
		
		ArrayList arrayList2 = new ArrayList();
		
		arrayList2.addAll(arrayList);
		 
		arrayList2.add(108);
		
		System.out.println("Add All"+arrayList2);
		
		arrayList.remove(0);
		
		System.out.println("remove: "+arrayList);
	}


}
