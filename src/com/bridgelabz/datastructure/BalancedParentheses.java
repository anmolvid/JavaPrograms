//******************************************************************************
// *  Compilation:  javac -d bin WeekOnStack.java
// *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.WeekOnStack n
// *  
// *  Purpose: ­> Take an Arithmetic Expression such as
//*(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
// *performance of operations. Ensure parentheses must appear in a balanced
// *fashion.
// *
// *  @author  anmol vidyarthi
// *  @version 1.0
// *  @since   05-01-2019
// *
// ******************************************************************************/

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


	