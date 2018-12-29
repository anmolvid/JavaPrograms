/*******************************************************************************
 *   Compilation:  javac -d bin Distance.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.Distance    *
 *                                                                              *
 *  Purpose: to prints the Euclidean distance from the point (x, y) to the origin (0, 0).             *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   .12.2018                                                            *
 *  **************************************************************************/
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
