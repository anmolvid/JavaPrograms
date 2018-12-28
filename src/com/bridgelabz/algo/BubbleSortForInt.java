/*******************************************************************************
 *   Compilation:  javac -d bin BubbleSortForInt.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.BubbleSortForInt     *
 *                                                                              *
 *  Purpose: Reads in integers prints them in sorted order using Bubble Sort                               *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   26.12.2018                                                            *
 *  **************************************************************************/

package com.bridgelabz.algo;

import com.bridgelabz.util.AlgorithmUtility;

public class BubbleSortForInt {
	
	public static void main(String[] args)
	{
		
		System.out.println("enter the number of elements");
		int n=AlgorithmUtility.intValue();
		int arr[]=new int[n];
	    
	     for(int i=0;i<n;i++)
	    {
		arr[i]=AlgorithmUtility.intValue();
		System.out.println("numbers are");
	    } 
		
		
	    //calling the method
		AlgorithmUtility.bubbleSortInt(arr,n);
	}
	   
	


	
	
}


