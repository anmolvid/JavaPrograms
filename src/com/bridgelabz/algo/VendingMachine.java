package com.bridgelabz.algo;

import com.bridgelabz.util.AlgorithmUtility;

public class VendingMachine {public static void main(String[] agrs) {
	int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
	System.out.println("Enter the amount");
	int num=AlgorithmUtility.intValue();
	AlgorithmUtility au=new AlgorithmUtility();
	au.vendingMachine(num,notes);

}
}
