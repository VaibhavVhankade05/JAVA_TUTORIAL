package com.array;

public class Array 
{
	/*
		Java array is an object which contains elements of a similar data type.
		Elements of an array are stored in a contiguous memory location.
		Store only a fixed set of elements in a Java array.
		Array in Java is index-based.
		Indexing start form 0th number.
		
		
		Advantages:
			Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
			Random access: We can get any data located at an index position.
			
		Disadvantages
			Size Limit: Arrays have a fixed size and do not grow dynamically at runtime.
			
		
		Types of Array in java:	
	*/
	/*
		 1. Single Dimensional Array
					# syntax:
					
						dataType[] arr; 
						dataType []arr;  
						dataType arr[]; // most use
	 */
	
	public void singleDimensionalArrayList()
	{
		int arr[] = new int[10];//declaration and instantiation  
		arr[0]=10;//initialization  
		arr[1]=20;  
		arr[2]=70;  
		arr[3]=40;  
		arr[4]=50; 
//		arr[5]=10;  
//		arr[6]=20;  
//		arr[7]=70;  
//		arr[8]=40;  
//		arr[9]=50; 
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	/*
	 	For-each Loop for Java Array
	 	
	 	The Java for-each loop prints the array elements one by one. 
	 	It holds an array element in a variable, then executes the body of the loop.
	 	
	 	syntax:
		 	for(data_type variable:array){  
			//body of the loop  
			}  
	*/
	
	public void forEachLoop()
	{
		int arr[] = {33,3,4,5};  
		//printing array using for-each loop  
		for(int i:arr)  
		System.out.println(i);  
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		
	}
	
	
	
	/*
	 	Multidimensional Array in Java:
			A multidimensional array in Java is an array of arrays where each element can be an array itself. 
			It is useful for storing data in row and column format.
			
			syntax:
				dataType[][] arrayRefVar;  
				dataType [][]arrayRefVar;  
				dataType arrayRefVar[][];  // most use 
				dataType []arrayRefVar[];   
				
	 */
	
	
	public void multidimensionalArray()
	{
		int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3x3 matrix  
        // Printing the 2D array  
        for (int i = 0; i < 3; i++) 
        {  
            for (int j = 0; j < 3; j++) 
            {  
                System.out.print(arr[i][j] + " ");  
            }  
            System.out.println();  
        } 
	}
	
	
	public static void main(String[] args) {
	
		Array array = new Array();
		
//		array.singleDimensionalArrayList();
		
//		array.forEachLoop();
		
//		array.multidimensionalArray();
	}
}
