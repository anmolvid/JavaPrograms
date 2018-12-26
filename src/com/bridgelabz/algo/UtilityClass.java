package com.bridgelabz.algo;
import java.util.Scanner;
/*******************************************************************************
 *   Compilation:  javac -d bin MergeSort.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.MergeSort        *
 *                                                                              *
 *  Purpose: Check using Stopwatch the Elapsed Time for every method call                                   *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   26.12.2018                                                            *
 *  **************************************************************************/

import com.bridgelabz.util.AlgorithmUtility;

public class UtilityClass {
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	System.out.println("enter the number of elements");
	int n=sc.nextInt();
	String arr[]=new String[n];
    
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.next();
	}
	AlgorithmUtility au=new AlgorithmUtility();
	switch(choice)
	{
	case 1: double startTime=System.currentTimeMillis();//to start timer
	au.bubbleSort(arr,arr.length);//to call method
	double stopTime=System.currentTimeMillis();//to stop the timer
	double elapsedTime=(startTime-stopTime);//to calculate the elapsed time
	System.out.println("elapsed time is "+elapsedTime);
	break;
	
	
	case 2:  startTime=System.currentTimeMillis();//to start timer
	au.insertionSort(arr,arr.length);//to call method
	stopTime=System.currentTimeMillis();//to stop the timer
	 elapsedTime=(startTime-stopTime);//to calculate the elapsed time
	 break;

}
	}
}
