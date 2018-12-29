/*******************************************************************************
 *   Compilation:  javac -d bin BinarySearchForInt.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.BinarySearchForInt     *
 *                                                                              *
 *  Purpose: Binary search for integer                             *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   28.12.2018                                                            *
 *  **************************************************************************/
package com.bridgelabz.algo;

import com.bridgelabz.util.AlgorithmUtility;

public class BinarySearchForInt {
	 public static void main(String args[])
	  {
	    
	 
	    
	    System.out.println("Enter number of elements");
	    int num=AlgorithmUtility.intValue();
		int a[]=new int[num];
		   
	    System.out.println("Enter " + num + " integers");
	 
	 
	    for (int c = 0; c < num; c++)
	      a[c] = AlgorithmUtility.intValue();
	 
	    System.out.println("Enter value to find");
	    int search = AlgorithmUtility.intValue();
	    
	    AlgorithmUtility.binarySearch(num,search,a);
	   
	  }
}