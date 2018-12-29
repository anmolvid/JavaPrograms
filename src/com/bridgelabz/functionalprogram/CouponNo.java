/*******************************************************************************
 *   Compilation:  javac -d bin CouponNo.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.CouponNo     *
 *                                                                              *
 *  Purpose: to generate random number and to process distinct coupons.               *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   .12.2018                                                            *
 *  **************************************************************************/
package com.bridgelabz.functionalprogram;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class CouponNo {
public static void main(String[]args){
	Scanner S=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=S.nextInt();
	  
		
		
		FunctionalUtility cn=new FunctionalUtility();
		cn.couponNumber(num);
}

}
