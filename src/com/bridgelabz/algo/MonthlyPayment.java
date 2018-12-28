/*******************************************************************************
 *   Compilation:  javac -d bin MonthlyPayment.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.MonthlyPayment     *
 *                                                                              *
 *  Purpose: to calculate monthlyPayment that reads in three command­line arguments P, Y, and R                              *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   26.12.2018                                                            *
 *  **************************************************************************/

package com.bridgelabz.algo;


import com.bridgelabz.util.AlgorithmUtility;

public class MonthlyPayment {
	public static void main(String[]args) {
	
	System.out.println("Enter the Principal");
	double p=AlgorithmUtility.doubleValue();
	System.out.println("Enter the number of Year");
	double y=AlgorithmUtility.doubleValue();
	System.out.println("Enter the Rate of Interest");
	double r=AlgorithmUtility.doubleValue();
	AlgorithmUtility mp=new AlgorithmUtility();
	mp.monthlyPay(p,y,r);	
	
	}	

}
