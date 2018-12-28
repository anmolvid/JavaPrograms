/*******************************************************************************
 *   Compilation:  javac -d bin BubbleSort.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.BubbleSort       *
 *                                                                              *
 *  Purpose: Reads in integers prints them in sorted order using Bubble Sort                               *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   26.12.2018                                                            *
 *  **************************************************************************/

package com.bridgelabz.algo;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class BubbleSort {
	public static void main(String[] args)
    {
        
        System.out.println("Enter the size of your array");
        int n=AlgorithmUtility.intValue();
        String arr[]=new String[n];
        System.out.println("Enter the elements");

        for( int i=0;i<n;i++)
        {   
            arr[i]=AlgorithmUtility.StringValue();
        }
       
        AlgorithmUtility.bubbleSort(arr,n);//calling method
        System.out.println("Elements after sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");
        }

    }

}


