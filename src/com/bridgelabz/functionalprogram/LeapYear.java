/*******************************************************************************
 *   Compilation:  javac -d bin LeapYear.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.LeapYear     *
 *                                                                              *
 *  Purpose: to find whether a given year is leap year or not                       *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   .12.2018                                                            *
 *  **************************************************************************/

package com.bridgelabz.functionalprogram;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class LeapYear {
	public static void main(String[] agrs){

		Scanner S = new Scanner(System.in);
		System.out.println("enter the year");
		int yr = S.nextInt();
		
	boolean y=FunctionalUtility.isLeapYear(yr);
	if(y)
	{
		System.out.println("year is a leap year");
	}
	else
	{
		System.out.println("not leap year");
	}
	
	
}
	

}
