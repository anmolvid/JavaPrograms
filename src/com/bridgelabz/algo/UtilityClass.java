/******************************************************************************
 *  Compilation:  javac -d bin UtilityClass.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: determine the value by using different sorting methods
 *
 *  @author 
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algo;


import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.FunctionalUtility;

//public class UtilityClass {
//
//    public static void main(String[] args) {
//        
//        System.out.println("1.binary search of numbers 2. binary search of strings 3.insertion sort of numbers 4.insertion sort of strings 5.bubble sort of numbers 6. bubble sort of strings");
//
//        System.out.println("enter the choice");
//        int choice=AlgorithmUtility.intValue();
//        switch(choice)
//        {
//        case 1:System.out.println("enter the number of  elements");
//        int n1=AlgorithmUtility.intValue();
//        int array1[]=new int[n1];
//        System.out.println("enter the value of  key");
//        int key1=AlgorithmUtility.intValue();
//        long a =FunctionalUtility.start();
//        System.out.println("start time is "+(a/1000));
//        System.out.println("enter the array elements");
//        for(int i=0;i<n1;i++)
//        {
//            array1[i] =AlgorithmUtility.intValue();
//        }
//        
//       long b=FunctionalUtility.stop();
//        System.out.println("endtime is "+(b/1000));
//        int x=AlgorithmUtility.binarySearch(n1, key1, array1);
//        System.out.println(x);
//        long c=FunctionalUtility.elapse();
//        System.out.println("elapsed time is "+(c/1000));
//        break;
//        
//        
//        case 2:System.out.println("enter the number of  elements");
//        int n2=AlgorithmUtility.intValue();
//        String[] array2=new String[n2];
//        System.out.println("enter the value of  key");
//        String key2=AlgorithmUtility.StringValue();
//        long d =FunctionalUtility.start();
//        System.out.println("start time is "+(d/1000));
//        System.out.println("enter the array elements");
//        for(int i=0;i<n2;i++)
//        {
//            array2[i] =AlgorithmUtility.StringValue();
//        }
//        long e=FunctionalUtility.stop();
//        System.out.println("endtime is "+(e/1000));