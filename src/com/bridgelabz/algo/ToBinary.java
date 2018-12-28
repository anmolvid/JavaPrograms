
/*******************************************************************************
 *   Compilation:  javac -d ToBinary.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.ToBinary        *
 *                                                                              *
 *  Purpose: outputs the binary representation of the decimal number typed as the input. It is based on decomposing the number into
  a sum of powers of 2.                              *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   19.12.2018                                                            *
 *  **************************************************************************/
package com.bridgelabz.algo;

import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;

public class ToBinary {
	public static void main(String[] args) {

		System.out.println("Enter the number");
		int num = AlgorithmUtility.intValue();
		int[] binary = AlgorithmUtility.toBinary(num);// to call method
		for (int i = binary.length - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}

	}
}
