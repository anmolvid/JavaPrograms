/*******************************************************************************
 *   Compilation:  javac -d bin Anagram.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.Anagram        *
 *                                                                              *
 *  Purpose: to check one string is an anagram of another                                  *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   19.12.2018                                                            *
 *  **************************************************************************/
package com.bridgelabz.algo;
import com.bridgelabz.util.AlgorithmUtility;

import java.util.Scanner;

import com.bridgelabz.util.*;
import com.bridgelabz.util.AlgorithmUtility;
public class Anagram {
	public static void main(String[] args)
	{
		AlgorithmUtility au=new AlgorithmUtility();
		
		System.out.println("enter string 1");
		String m=AlgorithmUtility.StringValue();
		
		System.out.println("enter string 2");
		String n=AlgorithmUtility.StringValue();
		
		
	boolean an=AlgorithmUtility.isAnagram(m,n);
	if(!an)
	{
		System.out.println(" an anagram");
		
	}
	else
	{
		System.out.println("are anagram");
	}
			
		
	
		
		
		
		
	}

}
