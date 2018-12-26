package com.bridgelabz.algo;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class BubbleSort {
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the elements");

        for( int i=0;i<n;i++)
        {   
            arr[i]=sc.next();
        }
       
        AlgorithmUtility.bubbleSort(arr,n);
        System.out.println("Elements after sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");
        }

    }

}


