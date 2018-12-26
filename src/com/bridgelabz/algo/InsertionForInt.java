package com.bridgelabz.algo;

import com.bridgelabz.util.AlgorithmUtility;

public class InsertionForInt {
	public static void main(String[] args) {
		System.out.println("enter the number of elements");
		int num=AlgorithmUtility.intValue();
		int a[]=new int[num];
		   
	    System.out.println("Enter the elements");

	    for(int i=0;i<a.length;i++)      
	    {
	        a[i]=AlgorithmUtility.intValue();     
	    }
		
	    
	    AlgorithmUtility.insertionSortInt(a,num);
	    
	
	    for(int i=0;i<a.length;i++)  
	    {
	    	System.out.println(a[i]);
	    }
	}

}
