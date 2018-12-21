package com.bridgelabz.util;

import java.util.Random;
import java.util.Scanner;

public class FunctionalUtility<E> {
	public void replaceString(String str)
	{
		Scanner scan=new Scanner(System.in);
		String uname=scan.nextLine();
		if(str.length()>=3)
		{
			str = str.replaceFirst("<<username>>", uname);
			System.out.println(str);
		}
		else
			System.out.println("cannot be replaced");
	}

	
	public void flipCoin(int count)
	{ 
		int head=0;
		int tail=0;
		
		int i= count;
		
		Random result=new Random();
		while(count>0)
		{
			double r=result.nextInt();
			
			if(r<0.5)
			{
				tail++;
			}
			else
			{
				head++;
			}
		 count--;
		 
		}
	System.out.println(head/i*100);
	System.out.println(tail/i*100);
	}

		

		
		
		
	
	
public void power()
{
	int count=0;

	Scanner scan=new Scanner(System.in);
	int n =scan.nextInt();
	if( n>=0 && n<31)
	{
		for(int i=0;i<n;i++)
		{
		  System.out.println(Math.pow(2, count));
		  count++;
		}
	}
	else
	{
		System.out.println("out of range");
	}
}



public void leapYear()
{
	Scanner S=new Scanner(System.in);
	System.out.println("enter the year");
	int year=S.nextInt();
	{
		
	 if(String.valueOf(year).length()==4)
	 {
	
	    if((year%400 == 0) && (year%4==0))
	    {
		System.out.println("year is leap year");
	     }
	
	    else if(year%100==0)
	    {
		System.out.println("year is not leap year");
		
	    }
	else
	   {
		System.out.println("year is not leap year");
		
	   }
	 }
	 else
	    { 
		 System.out.println("yesr is not of four digits");
		 }
	 }
}	
	

public void harmonicN() 
{
	{
	  double sum=0;
	  Scanner S=new Scanner(System.in);
	  System.out.println("Enter the value");
	  int num=S.nextInt();
		 
		 
	  
	  for(int i=1;i<=num;i++)
	  {
		  sum=sum  + (float)1 / i; 
		  
	  }
	  System.out.println("result:"+sum);
		
	  
	}
}


public void primeNo()
{
	int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ::");
    n = sc.nextInt();
    
    for(int i = 2; i< n; i++) {
       while(n%i == 0) {
          System.out.println(i+" ");
          n = n/i;
       }
    }
    if(n >2) 
    {
       System.out.println(n);
	  
    }
}


public void gambler()
{
	int win=0;
	int loose=0;

	Scanner S=new Scanner(System.in);
	  System.out.println("Enter the goal");
	  int goal=S.nextInt();
	  System.out.println("Enter the stake");
	  int stake=S.nextInt();
	  System.out.println("Enter the number of times");
	  int n=S.nextInt();

	for(int i=1;i<=n;i++)
		{
		
		int cash=stake;
		while(cash>0 && cash< goal)
		{
			if (Math.random() < 0.5)
			{
                cash++;
                
			}
			else
			{
				cash--;
			}
		}
		if(cash==goal)
		{
			win++;
		}
		else
			loose++;
		}
	System.out.println(100* win/n);
	System.out.println(100* loose/n);
	}


public void couponNumber(int n)
{
	boolean[] a=new boolean[n];
	int count=0;
	int distinct=0;
	while(distinct<n)
	{
		Random rand=new Random();
		int content=rand.nextInt(n);
		count++;
		if(!a[content])
		{
			distinct++;
			System.out.println(distinct);
			a[content]=true;
		}
	}
	
	System.out.println("assigning is done for"+count);
	
				
    }		

			
		
	
	
	public void triplets(int[] arr,int n)
	{
		
		
		boolean flag= false;
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if (arr[i]+arr[j]+arr[k] == 0) 
						
					{
						
					   
						System.out.println("true");
					    flag=true;
					}
					
					
					
					
						
						
					
						
				}
			}
		}
	
	
	if(flag==false)
	{
		System.out.println("false");
	}
}


public void distance(int x,int y)
{
	double result=Math.sqrt(x*x+y*y);
	System.out.println("result is"+result);
	
}
	


public void displayArray(E[][] array){
	for(int i=0;i<array.length;i++){
		for(int j=0;j<array.length;j++)
		{
			System.out.println(array[i][j]);
		}
	}
}

	
public void quadratic()
{
	Scanner s=new Scanner(System.in);
    
    System.out.println("enter value of a");
	
	double a=s.nextDouble();
    System.out.println("enter the value of b");
    double b=s.nextDouble();
    System.out.println("enter the value of c");
    double c=s.nextDouble();
	double res=b*b-4*a*c;
	double root1 = (-b + Math.sqrt(res)/(2*a*b));
	double root2 = (-b - Math.sqrt(res)/(2*a*b));
	System.out.println("first root is" +root1);
	System.out.println("second root is"+root2);
}



public void stopwatch()
{
	Scanner S=new Scanner(System.in);
	
	
	System.out.println("enter 1 to start");
	long strt=System.currentTimeMillis();
	long start=S.nextLong();
	
	System.out.println("enter 2 to stop");
	long stp=System.currentTimeMillis();
	long stop=S.nextLong();
	
	long elapse=(strt-stp);
	System.out.println("Elapse time is"+elapse);
	
}
}









    
		

	


	
	



