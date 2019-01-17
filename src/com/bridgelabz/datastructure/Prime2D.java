/******************************************************************************
// *  Compilation:  javac -d bin WeekOnStack.java
// *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.WeekOnStack n
// *  
// *  Purpose: ­> Read .a List of Numbers from a file and arrange it ascending Order in a
// *Linked List. Take user input for a number, if found then pop the number out of the
// *list else insert the number in appropriate position
// *
// *  @author  anmol vidyarthi
// *  @version 1.0
// *  @since   05-01-2019
// *
// ******************************************************************************/

package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmUtility;

public class Prime2D {
	public static void main(String[] args) {
	 List<List<Integer>> outterlist = new ArrayList<List<Integer>>();
     List<Integer> innerlist= new ArrayList<Integer>();
     System.out.println("prime number of the range 0 to 1000" );
     int m=0;
    int n=100;
    
     for(int i=1;i<=10;i++)
     {
     innerlist= AlgorithmUtility.primeNumbers(m,n);
     outterlist.add(innerlist);
     System.out.println("prime no between "+ m +" and "+  n);
     System.out.println(innerlist);
     m+=100;
     n+=100;
     }
}
}


