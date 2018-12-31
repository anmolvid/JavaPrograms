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
			System.out.println("enter 1. for conversion from celcius to fahrenheit 2. for conversion from fahrenheit to celcius");
			int choice=AlgorithmUtility.intValue();
			
			switch(choice) {
			case 1:	System.out.println("Enter the temperature in celsius");
			double tc=AlgorithmUtility.doubleValue();
		    double t=AlgorithmUtility.temparatureF(tc);
		    System.out.println(t);
		    break;
		    
			case 2:System.out.println("Enter the temperature in fahrenheit");
			double tf=AlgorithmUtility.doubleValue();
			double tff=AlgorithmUtility.temparatureC(tf);
			System.out.println(tff);
			break;
			
//		System.out.println("Enter the temperature in celsius");
//		double tc=AlgorithmUtility.doubleValue();
//		double tempc=AlgorithmUtility.temparatureF(tc);
//		System.out.println(tempc);
//		System.out.println("Enter the temperature in fahrenheit");
//		double tf=AlgorithmUtility.doubleValue();
//		double tempf=AlgorithmUtility.temparatureF(tf);
//		System.out.println(tempf);
//		
}
}
}

