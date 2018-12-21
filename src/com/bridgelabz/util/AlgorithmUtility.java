package com.bridgelabz.util;
import java.util.Arrays; 
public class AlgorithmUtility{

	public  boolean anagram(String str1,String str2)
	{
		char[] char1= str1.toLowerCase().toCharArray();
		char[] char2= str2.toLowerCase().toCharArray();
		
		
		int n1=char1.length;
		int n2=char2.length;
		
		
		
		if(n1!=n2)
		
		return false;
		
		
		
			
			
		
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			for(int i=0;i<n1;i++)
			
				if(char1[i] != char2[2])
				
					
					return false;
	}
	
				
	{
				
			        return true;

}
				
			
			
		
		
		
	

