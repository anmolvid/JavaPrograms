package com.bridgelabz.util;

import java.util.Scanner;

public class FunctionalUtility {
	public void replaceString(String str)
	{
		Scanner scan=new Scanner(System.in);
		String uname=scan.nextLine();
		if(str.length()>=3)
		{
			str = str.replaceFirst("<<username>>", uname);
			System.out.println(str);
		}
		else
			System.out.println("cannot be replaced");
	}

	
	public void flipCoin()
	{ 
		int count=0;
		double result;
		double heads,tails;
		int sum_tails=0;
		int sum_heads=0;
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextLine();
		for(int i=0;i<n;i++)
		{
		result = Math.random();
		if(result <0.5)
		  {
		   tails=result;
		   sum_tails++;
		   
		  }
		else
		
		heads = result;
		sum_heads++;
		
		}
		double pHeads = sum_heads/n*100;
		System.out.println("heads percentage"+pHeads);
		double pTails = sum_tails/n*100;
		System.out.println("tails percentage"+pTails);
	}
	}

