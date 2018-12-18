
package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;

public class ReplaceString {
	public static void main(String[] agrs){
		String str ="hello <<username>>,how are you";
		System.out.println("Enter the username");
		FunctionalUtility fn=new FunctionalUtility();
		fn.replaceString(str);
		
	}


	

}
