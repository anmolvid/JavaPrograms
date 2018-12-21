package com.bridgelabz.algo;
import java.util.Scanner;

import com.bridgelabz.util.*;

public class Anagram {
	public static boolean main(String[] args)
	{
		AlgorithmUtility au=new AlgorithmUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter string 1");
		String m=S.nextLine();
		
		System.out.println("enter string 2");
		String n=S.nextLine();
		
		au.anagram(m,n);
		
	
		
		
		
		
	}

}
