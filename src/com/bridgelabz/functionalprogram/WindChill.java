package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;



public class WindChill {
	public static void main(String[]args){
	
	Scanner S=new Scanner(System.in);
	System.out.println("enter the temp");
	double tem=S.nextInt();

	System.out.println("enter the velocity");
	double vel=S.nextInt();
	FunctionalUtility fn=new FunctionalUtility();
	
	fn.windchill( tem, vel);
	}
	

}
