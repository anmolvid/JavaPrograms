package com.bridgelabz.algo;

import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;

public class ToBinary {
	public static void main(String []args)
	{
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int binary=AlgorithmUtility.toBinary(num);
		
		
	}
}
