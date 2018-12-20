package com.bridgelabz.functionalprogram;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;


public class StopWatch {
	public static void main(String[]args){
		FunctionalUtility fn=new FunctionalUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter 1 to start the stopwatch");
		//long st=S.nextLong();
		
		fn.strTime();
		System.out.println("enter 2 to stop the stopwatch");
		long end=S.nextLong();
		
		fn.stp();
		
		System.out.println("enter 3 to find elapsed");
		//long elp=S.nextLong();
		
		fn.elapse();
		
		
		
	}

}
