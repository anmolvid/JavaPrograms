/*******************************************************************************
 *   Compilation:  javac -d bin TempConversion.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.TempConversion        *
 *                                                                              *
 *  Purpose: to convert the temperature from Celsius to Fahrenheit or vise versa                               *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   19.12.2018                                                            *
 *  **************************************************************************/

package com.bridgelabz.algo;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class TempConversion {
	
		public static void main(String[]args) {
		
		System.out.println("Enter the temperature");
		double t=AlgorithmUtility.doubleValue();
		double temp=AlgorithmUtility.temparature(t);
		System.out.println(temp);
		
}
}
