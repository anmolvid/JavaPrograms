package com.bridgelabz.algo;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class SquareRoot {

	public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	double num=s.nextDouble();
	AlgorithmUtility au=new AlgorithmUtility();
	au.squareRoot(num);
	s.close();

}
}
