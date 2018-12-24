package com.bridgelabz.util;
import java.util.Arrays; 
public class AlgorithmUtility{

	/**
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean anagram(String str1,String str2)
	{
		char[] char1= str1.toLowerCase().toCharArray();
		char[] char2= str2.toLowerCase().toCharArray();
		
		
		int n1=char1.length;
		int n2=char2.length;
		
		
		
		if(n1!=n2) {
		
		return false;
		
		}
		else
		{
		
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			for(int i=0;i<n1;i++)
			
				if(char1[i] != char2[2])
				
					
					return false;
		}
	
	return true;
	
}



public void Prime()
{

    for(int i=1; i < 1000; i++){

        int flag = 1;

        for(int j=2; j < i ; j++){

            if(i % j == 0){
                flag = 0;
                break;

            }
        }
        if(flag==1)
        {
            System.out.println(i);
        }




    }
}
////MONTHLY PAYMENT

/**
 * @purpose: 
 * @param P
 * @param R
 * @param Y
 * 
 * 
 */
public void monthlyPay(double P,double R,double Y)
{
    double r=R/(12*100);
    double n=12*Y;

    double k=Math.pow((1+r),-n);
    double payment=P*R/1+k;
    System.out.println("Monthly payment is "+payment);
}


////TEMPERATURE

/**
 * @param C
 */
public void Temparature(double C)
{
    double F= ((C *9/5) + 32) ;
    System.out.println(F);


}


///Square root

public void squareRoot(double n)
{
	double t=n;
	double epsilon=1e-15;
	if(n>0)
	{
		while(Math.abs(t-n/t)>epsilon*t);
		{
			t=(n/t+t)/2;
			
		}
		System.out.println("the square root of "+n+ "is"+t);
	
	}
	else
	System.out.println("its a negative number");
}


///to binary
public static int toBinary (int num)
{
	int bin[]=new int[50];
	int index =0;
	while (num>0)
	{
		bin[index++]=num%2;
		num=num/2;
		
	}
	
	
return(bin[index]);
}
}

		
	

