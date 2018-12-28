/*******************************************************************************
 *   Compilation:  javac -d bin InsertionForInt.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.InsertionSortForInt     *
 *                                                                              *
 *  Purpose: Reads in integer from standard input and prints them in sorted order.
Uses insertion sort.                              *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   26.12.2018                                                            *
 *  **************************************************************************/

package com.bridgelabz.algo;

import com.bridgelabz.util.AlgorithmUtility;

public class InsertionForInt {
	public static void main(String[] args) {
		System.out.println("enter the number of elements");
		int num=AlgorithmUtility.intValue();
		int a[]=new int[num];
		   
	    System.out.println("Enter the elements");

	    for(int i=0;i<a.length;i++)      
	    {
	        a[i]=AlgorithmUtility.intValue();     
	    }
		
	    
	    AlgorithmUtility.insertionSortInt(a,num);//to call method
	    
	
	    for(int i=0;i<a.length;i++)  
	    {
	    	System.out.println(a[i]);
	    }
	}

}
