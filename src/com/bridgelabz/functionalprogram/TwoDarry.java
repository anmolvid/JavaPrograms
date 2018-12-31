/*******************************************************************************
 *   Compilation:  javac -d bin TwoDarry.java                                    *
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.TwoDarry     *
 *                                                                              *
 *  Purpose: to print 2 D array                    *
 *                                                                                *
 *  @author  Anmol Vidyarthi                                               *
 *  @version 1.0                                                                *
 *  @since   .12.2018                                                            *
 *  **************************************************************************/
package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
import java.util.Scanner;


public class TwoDarry {
public static void main(String[] agrs){
	
        Scanner s=new Scanner(System.in);
        FunctionalUtility fu=new FunctionalUtility();
        System.out.println("enter the number of rows: m");
        int m=s.nextInt();
        System.out.println("enter the number of columns: n");
        int n=s.nextInt();
        System.out.println("1:Integer 2:Double 3:Boolean");
        int choice=s.nextInt();

        switch(choice){
               case 1: Integer[][] array=new Integer[m][n];
                      for(int i=0;i<m;i++){
        	            for(int j=0;j<n;j++){
        		             array[i][j]=s.nextInt();
        	                        }
                             }
                         fu.displayArray(array);
                         break;
         
              case 2: Double[][] darray=new Double[m][n];
                     for(int i=0;i<m;i++){
	                    for(int j=0;j<n;j++){
		                    darray[i][j]=s.nextDouble();
	                                  }
                                 }
                      fu.displayArray(darray);
                      break;

                case 3: Boolean[][] barray=new Boolean[m][n];
                         for(int i=0;i<m;i++){
	                          for(int j=0;j<n;j++){
		                         barray[i][j]=s.nextBoolean();
	                                  }
                                  }
                         fu.displayArray(barray);
                         break;
                 default: System.out.println("select among the choices");
                         break;
                         
                         
        }
        s.close();

        	 
         }
}
 



