package com.bridgelabz.algo;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class TempConversion {
	
		public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature");
		double t=sc.nextDouble();
		AlgorithmUtility au=new AlgorithmUtility();
		au.Temparature(t);
}
}
