package com.bridgelabz.algo;

import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;
/*******************************************************************************
 *   Compilation:  javac -d bin MergeSort.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.MergeSort        *
 *                                                                              *
 *  Purpose: to convert the temperature from Celsius to Fahrenheit or vise versa                               *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   19.12.2018                                                            *
 *  **************************************************************************/
public class ToBinary {
	public static void main(String []args)
	{
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int binary=AlgorithmUtility.toBinary(num);
		
		
	}
}
