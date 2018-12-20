package com.bridgelabz.functionalprogram;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Distance {
	public static void main(String[] agrs){		
		FunctionalUtility fu=new FunctionalUtility();
		Scanner d1=new Scanner(System.in);
		System.out.println("enter x");
		int x=d1.nextInt();
		System.out.println("enter y");
		int y=d1.nextInt();
		fu.distance(x,y);
	}
}
