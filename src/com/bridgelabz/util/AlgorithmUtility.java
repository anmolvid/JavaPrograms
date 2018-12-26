package com.bridgelabz.util;
import java.util.Arrays;
import java.util.Scanner; 
public class AlgorithmUtility{
	static Scanner sc = new Scanner(System.in);
	
	public static int intValue()
	{
		try
		{
			return sc.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
		
		public static double doubleValue()
		{
			try
			{
				return sc.nextInt();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return 0.0;
		}
			
			public static String StringValue()
			{
				try
				{
					return sc.next();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return null;
			}
			

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
		while(Math.abs(t-n/t)>(epsilon*t))
		{
			t=((n/t)+t)/2;
			
		}
		
	
	}System.out.println("the square root of "+n+ "is"+t);
//	else
//	System.out.println("its a negative number");
}


///to binary
public static int[] toBinary (int num)
{
	int bin[]=new int[8];
	int index =0;
	while (num>0)
	{
		bin[index++]=num%2;
		num=num/2;
		
	}
	
	
return bin;
}


///bubble sort for integer and strings

public static void bubbleSort(String array[],int f)
{
	
	for(int i=0;i<f;i++)
	{
		for(int j=1;j<f;j++)
		{
			if(array[j-1].compareToIgnoreCase(array[j])>0)
			{
				String temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
				
			}
		}
	}
	
}

//bubble sort for integer

public void bubbleSortInt()
{
    int i,j,temp=0;

    System.out.println("Enter how many numbers to be sorted:");
    int n=AlgorithmUtility.intValue();
    int a[]=new int[n];
   
    System.out.println("Enter value for "+n+" numbers:");

    for(i=0;i<a.length;i++)      
    {
        a[i]=sc.nextInt();       
    }

    for(i=0;i<a.length;i++)        
    {
        for(j=i+1;j<a.length;j++)
        {
            if(a[i]>a[j])
            {
                //Swapping
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    System.out.println();
    System.out.println("The sorted order is:");

    for(i=0;i<a.length;i++)     
    {
         System.out.println(a[i]);       
    }
}




//insertion sort for  string 

public static void insertionSort(String arr[],int n)
{
	String temp="";
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i].compareToIgnoreCase(arr[j])>0)
				temp=arr[i];
			    arr[i]=arr[j];
			    arr[j]=temp;
		}
	}


	
}

//insertion for integer

public static void insertionSortInt(int arr[],int n) 
{ 
    
    for (int i=1; i<n; ++i) 
    { 
        int key = arr[i]; 
        int j = i-1; 

        
        while (j>=0 && arr[j] > key) 
        { 
            arr[j+1] = arr[j]; 
            j = j-1; 
        } 
        arr[j+1] = key; 
    } 
} 




//merge sort
	public static void mergeSort(String array[],int low,int high)
	{
	    int n=high-low;
	    if(n<=1)
	        return;
	    int mid=low+n/2;
	    mergeSort(array,low,mid);
	    mergeSort(array,mid,high);
	    String[] temp=new String[n];
	    int i=low,j=mid;
	    for(int k=0;k<n;k++)
	    {
	        if(i==mid)
	            temp[k]=array[j++];
	        else if(j==high)
	            temp[k]=array[i++];
	        else if(array[j].compareToIgnoreCase(array[i])<0)
	            temp[k]=array[j++];
	        else
	            temp[k]=array[i++];
	    }

	    for(int k=0;k<n;k++)
	    {
	        array[low +k]=temp[k];
	    }

	}

	



public static void vendingMachine(int money,int[] notes)
{
	int rem;
	int i=0;
	int total=0;
	
if (money==0)
	{
	 System.out.println("no output");	
	}
	else
{
		for(i=0;i<notes.length;i++)
	{
		if (money>=notes[i])
			{
				int calculateNotes=money/notes[i];
				rem=money%notes[i];
			money=rem;
			total=total+calculateNotes;
				System.out.println(notes[i]+ "Notes: " +calculateNotes);
			}
			}
		System.out.println("total number of notes "+total);
		}
	}
	

public static int swapNibbles(int x) 
{ 
    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
} 
}


		
	

