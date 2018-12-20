
package com.bridgelabz.functionalprogram;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class CouponNo {
public static void main(String[]args){
	Scanner S=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=S.nextInt();
	  
		
		
		FunctionalUtility cn=new FunctionalUtility();
		cn.couponNumber(num);
}

}
