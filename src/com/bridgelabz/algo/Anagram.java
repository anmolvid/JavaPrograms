package com.bridgelabz.algo;
import com.bridgelabz.util.AlgorithmUtility;
/*******************************************************************************
 *   Compilation:  javac -d bin MergeSort.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.MergeSort        *
 *                                                                              *
 *  Purpose: to check one string is an anagram of another                                  *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   19.12.2018                                                            *
 *  **************************************************************************/
import java.util.Scanner;

import com.bridgelabz.util.*;
import com.bridgelabz.util.AlgorithmUtility;
public class Anagram {
	public static void main(String[] args)
	{
		AlgorithmUtility au=new AlgorithmUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter string 1");
		String m=S.nextLine();
		
		System.out.println("enter string 2");
		String n=S.nextLine();
		
		
	boolean an=AlgorithmUtility.anagram(m,n);
	if(an)
	{
		System.out.println("not an anagram");
		
	}
	else
	{
		System.out.println("are anagram");
	}
			
		
	
		
		
		
		
	}

}
