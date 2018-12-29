/*******************************************************************************
 *   Compilation:  javac -d bin ReplaceString.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.ReplaceString     *
 *                                                                              *
 *  Purpose: to take username as input and replace <<username>> with a proper name             *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   .12.2018                                                            *
 *  **************************************************************************/
package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;

public class ReplaceString {
	public static void main(String[] agrs){
		String str ="hello <<username>>,how are you";
		System.out.println("Enter the username");
		
		FunctionalUtility.replaceString(str);
		
	}


	

}
