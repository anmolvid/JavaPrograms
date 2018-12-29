/*******************************************************************************
 *   Compilation:  javac -d bin FlipCoin.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.FlipCoin     *
 *                                                                              *
 *  Purpose: to find the Percentage of Head vs Tails             *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   .12.2018                                                            *
 *  **************************************************************************/
package com.bridgelabz.functionalprogram;
import java.util.Scanner;

import com.bridgelabz.util.*;

public class FlipCoin {
	public static void main(String[]agrs){
		Scanner S=new Scanner(System.in);
		System.out.println("enter number of flips");
		int nflips=S.nextInt();
		
		FunctionalUtility fp=new FunctionalUtility();
		fp.flipCoin(nflips );
		
		
	}
	

}
