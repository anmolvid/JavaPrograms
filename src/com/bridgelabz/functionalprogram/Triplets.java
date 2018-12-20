package com.bridgelabz.functionalprogram;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Triplets {
public static void main(String[]args){
		
		
		FunctionalUtility tp=new FunctionalUtility();
		Scanner S=new Scanner(System.in);
		  System.out.println("Enter the no. of elements");
		  int n=S.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("the element is");
			arr[i]=S.nextInt();
		}
		
		tp.triplets(arr,n);
}		

}
