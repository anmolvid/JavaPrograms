//******************************************************************************
// *  Compilation:  javac -d bin WeekOnStack.java
// *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.WeekOnStack n
// *  
// *  Purpose: ­> to find the number of binary search tree
// *
// *  @author  anmol vidyarthi
// *  @version 1.0
// *  @since   05-01-2019
// *
// ******************************************************************************/



package com.bridgelabz.datastructure;

import com.bridgelabz.util.DataStructureUtility;

public class BinarySearchTree {
	public static void main(String[] args)
    {
       
        System.out.println("Enter the number of elements");
        int n=DataStructureUtility.intValue();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the "+i+" th number:");
            arr[i]=DataStructureUtility.intValue();
        }
        double [] count=new double[arr.length];
        for(int i=0;i<arr.length;i++)
        {
          
            count[i] = DataStructureUtility.countBinary(arr[i]);
        }
         for(int i=0;i<count.length;i++)
         {
             System.out.println("Count of BST possibilities for "+  arr[i] +" nodes is "+count[i]);
         }

    }

}




