package com.bridgelabz.datastructure;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Stack;

public class BalancedParentheses {
	 public static void main(String[] args) {

	        //DataStructureUtility sc=new DataStructureUtility();
	        System.out.println("enter the string ");
	        String exp1=DataStructureUtility.StringValue();
	       
	        char[] exp = exp1.toCharArray();
	         
	   
	       
	         if (Stack.ParenthesisBalanced(exp))
	           System.out.println("Balanced ");
	         else
	           System.out.println("Not Balanced ");  
	   }

	}


	