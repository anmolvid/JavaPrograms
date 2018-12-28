/*******************************************************************************
 *   Compilation:  javac -d bin SwapNibbles.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.SwapNibbles     *
 *                                                                              *
 *  Purpose: to read an integer as an Input, convert to Binary using toBinary function and perform the following functions.
i. Swap nibbles and find the new number.
ii. Find the resultant number is the number is a power of 2.                              *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   26.12.2018                                                            *
 *  **************************************************************************/


package com.bridgelabz.algo;

import com.bridgelabz.util.AlgorithmUtility;


public class SwapNibbles {

    public static void main(String[] args) {
        
        System.out.println("enter the Value of n");
        int x =AlgorithmUtility.intValue();
        int flag=0;
        int c=AlgorithmUtility.swapNibbles(x);
        System.out.println(c);
       
       int[] d=AlgorithmUtility.toBinary(c);
       for(int j=d.length;j>=0;j--)
       {
           System.out.println(d[j]);
       }
    
      for (int i = 1; i <c; i++) {
         if (Math.pow(2, i)== c)
             flag=1;
      }
         
      if(flag==1)
      {
          System.out.println("number is a power of 2");
     
      }
      else
      {
          System.out.println("number is not a power of 2");
      }
     
        
    }
    
    
        
    
}
