/*******************************************************************************
 *   Compilation:  javac -d bin SquareRoot.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.SquareRoot        *
 *                                                                              *
 *  Purpose: to calculate the square root of non negative number                                *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   24.12.2018                                                            *
 *  **************************************************************************/
package com.bridgelabz.algo;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;


public class SquareRoot {

	public static void main(String[]args) {
//	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	double num=AlgorithmUtility.doubleValue();
	double n=AlgorithmUtility.squareRoot(num);
	System.out.println("the square root of " + num + "is" + n);
	
//	s.close();

}
}
