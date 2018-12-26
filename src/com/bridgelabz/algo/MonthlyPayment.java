package com.bridgelabz.algo;
import java.util.Scanner;
/*******************************************************************************
 *   Compilation:  javac -d bin MergeSort.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.MergeSort        *
 *                                                                              *
 *  Purpose: to calculate the monthly payment                                 *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   24.12.2018                                                            *
 *  **************************************************************************/

import com.bridgelabz.util.AlgorithmUtility;

public class MonthlyPayment {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Principal");
	double p=sc.nextDouble();
	System.out.println("Enter the number of Year");
	double y=sc.nextDouble();
	System.out.println("Enter the Rate of Interest");
	double r=sc.nextDouble();
	AlgorithmUtility mp=new AlgorithmUtility();
	mp.monthlyPay(p,y,r);	
	
	}	

}
