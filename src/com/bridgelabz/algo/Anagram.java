package com.bridgelabz.algo;
import com.bridgelabz.util.AlgorithmUtility;
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
