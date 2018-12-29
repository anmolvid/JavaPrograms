/*******************************************************************************
 *   Compilation:  javac -d bin FindaNum.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.FindaNum     *
 *                                                                              *
 *  Purpose: find a number using binary search                               *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   27.12.2018                                                            *
 *  **************************************************************************/

package com.bridgelabz.algo;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;



public class FindaNum {
	public static void main(String[] args) {
		
	AlgorithmUtility a1= new AlgorithmUtility ();
	
	System.out.println("Enter any Number:");
    int n=AlgorithmUtility.intValue();
    int range=(int)(Math.pow(2,n-1));                //range calculation for the number
    System.out.println("Take number between '0' to "+range);
    int count=0;
    String input="null";
    int lower=0;
    int upper=range;
    int middle=(lower+upper/2);
    AlgorithmUtility.binarySearch(lower,upper,middle,count,input,n-1);


}

	}

	
	

