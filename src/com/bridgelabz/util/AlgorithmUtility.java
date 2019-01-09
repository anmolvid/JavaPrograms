package com.bridgelabz.util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AlgorithmUtility {
	static Scanner sc = new Scanner(System.in);

	public static int intValue() {
		try {
			return sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static double doubleValue() {
		try {
			return sc.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}

	public static String StringValue() {
		try {
			return sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param str1 string to check anagram
	 *
	 * @param str2 string to check anagram
	 * @return returing true if both are anagram to each other else returning false
	 */
	public static boolean isAnagram(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            //int wordLength = FunctionalUtility.readInteger();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }
	
	
	
	//////////////////////
	public static char[] sort(char[] ch)
	{
		char [] b=new char[ch.length];
		for (int i=0;i<ch.length;i++)
			
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				
			if(ch[i]<ch[j])
			{
				count++;
			}
			b[count]=ch[i];
		}
		}
		return b;
	}
	//////////////////////////////////////

	 public static int prime(int range)
	    {

	        for(int i=1; i <= range; i++){

	            int flag = 1;

	            for(int j=2;j<i;j++){

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
	        return i;
	    }

	
	//////////////
	public static List<Integer> findPrime(int low,int high) {
        int flag = 1;
        int i;
        List<Integer> arr = new ArrayList<>();
        for (i = low; i < high; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else
                    flag = 1;
            }
            if (flag == 1) {
                arr.add(i);
            }
        }
        return arr;
    }
////MONTHLY PAYMENT

	/**
	 * @purpose: To calculate the monthly payment
	 * @param P principal loan amount
	 * @param R per cent interest compounded monthly.
	 * @param Y years to pay off a P principal loan amount
	 * 
	 * 
	 */
	public void monthlyPay(double P, double R, double Y) {
		double r=R/(12*100);
        double n=12*Y;

        double c=Math.pow((1+r),-n);
        double payment=((P*r)/1-c);
        System.out.println(payment);
	}

////TEMPERATURE Conversion

	/**
	 * @purpose: To convert temparature from Celsius to Fahrenheit
	 * @param C given temparature as an input
	 */
	public static double temparatureF(double C) {
		double F = ((C * 9 / 5) + 32);

     return F;
	}

	
	/**
	 * @purpose: To convert temparature from Celsius to Fahrenheit
	 * @param C given temparature as an input
	 */
	public static double temparatureC(double F) {
		double C = ((F - 32) * 5/9);

     return C;
	}
///Square root
	
	/**
	 * @purpose: to compute the square root of a nonnegative number c
	 * @param n nonnegative number
	 */

	public static double squareRoot(double n) {
		double t = n;
		double epsilon = 1e-15;
		if (n > 0) {
			while (Math.abs(t - n / t) > (epsilon * t)) {
				t = ((n / t) + t) / 2;

			}
		}
			return t;

		}
		
	

///to binary
	/**
	 * @purpose: to outputs the binary (base 2) representation of the decimal number typed as the input.
	 * @param num input number
	 */

	public static int[] toBinary(int num) {
		int bin[] = new int[8];
		int index = 0;
		while (num > 0) {
			bin[index++] = num % 2;
			num = num / 2;
		}
		return bin;
	}

///bubble sort for integer and strings
	
	/**
	 * @purpose: Reads in string prints them in sorted order using Bubble Sort
	 * @param f
	 */

//	public static <T extends Comparable<T>> void bubbleSort(T  array[], int f) {
//
//		for (int i = 0; i < f; i++) {
//			for (int j = 1; j < f; j++) {
//				if (array[j - 1].compareTo(array[j]) > 0) {
//					String temp = array[j - 1];
//					array[j - 1] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
//	}

//bubble sort for integer
	
	/**
	 * @purpose: Reads in integer prints them in sorted order using Bubble Sort
	 * @param n number of integer
	 * @param a[] array of integer
	 */

	public static int[] bubbleSortInt(int[] array, int n) {
		int i, j, temp;

		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (array[i] > array[j]) {
					// Swapping
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	
		
	
	
//insertion sort for  string 
	/**
	 * @purpose: Reads in string prints them in sorted order using insertion Sort
	 * @param n number of 
	 * @param arr[] array of string
	 */


	public static String[] insertionSort(String array[], int f){
		String temp="";
		for(int i=0;i<f;i++){
		for(int j=i+1;j<f;j++){
		if(array[i].compareToIgnoreCase(array[j])>0){
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		}
		}
		return array;
		}
		

//insertion for integer
	/**
	 * @purpose: Reads in integer prints them in sorted order using insertion Sort
	 * @param n number of integer
	 * @param arr[] array of integer
	 * 
	 */

	public static void insertionSortInt(int arr[], int n) {

		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	
	/**
	* 
	* @param elapsed_time the map that contains [key, pair] values that
	* 		  represents algorithm and its elapsed time respectively.
	* @return map that contains the sorted map of [key,pair] values that are sorted
	* 			by values
	*/
	public static Map<String,Double> sortByValue(Map<String, Double> elapsed_time){
		//Creating a list from the hashmap
		List<Map.Entry<String, Double> > list = 
	               new LinkedList<Map.Entry<String, Double> >(elapsed_time.entrySet()); 
		 
		//Sort the list 
		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {

			@Override
			public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		 
		// put data from sorted list to hashmap  
		Map<String, Double> temp = new LinkedHashMap<String, Double>(); 
	        for (Map.Entry<String, Double> hmap : list) { 
	            temp.put(hmap.getKey(), hmap.getValue()); 
	        } 
	        return temp;
	}
	
 //binary search
	/**
	 * @purpose: Reads in integer prints the key integer using binary search
	 * @param n number of integer
	 * @param arr[] array of integer
	 * @param key key integer
	 * 
	 */

	
	public static void binarySearch(int n, int key, int [] arr) {
	int  first, last, middle;
      first  = 0;
       last   = n - 1;
       middle = (first + last)/2;
    while( first <= last )
    {
     if ( arr[middle] < key )
       first = middle + 1;    
     else if ( arr[middle] == key)
      {
       System.out.println(key + " found at location " + (middle + 1) + ".");
       break;
     }
     else
        last = middle - 1;
      middle = (first + last)/2;
  }
   if (first > last)
      System.out.println(key + " isn't present in the list.\n");
}
	
	
	
//merge sort
	/**
	 * @purpose: Reads in integer print them in sorted order using merge sort
	 * @param 
	 * @param array[] array of string
	 * @param key key integer
	 * 
	 */
	
	
	
	public static void mergeSort(String array[], int low, int high) {
		int n = high - low;
		if (n <= 1)
			return;
		int mid = low + n / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid, high);
		String[] temp = new String[n];
		int i = low, j = mid;
		for (int k = 0; k < n; k++) {
			if (i == mid)
				temp[k] = array[j++];
			else if (j == high)
				temp[k] = array[i++];
			else if (array[j].compareToIgnoreCase(array[i]) < 0)
				temp[k] = array[j++];
			else
				temp[k] = array[i++];
		}

		for (int k = 0; k < n; k++) {
			array[low + k] = temp[k];
		}

	}
	
	//Vending Machine
	
	/**
	 * @purpose: to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine 
	 * @param money 
	 * @param notes[]
	 * 
	 * 
	 */
	static int i=0;
    static int total=0;
    //static int money;
    public static   int calculate(int money,int[]notes)
    {
        //Method to calculate the notes to be dispatched
        int rem;
        if(money==0)
        {
            return -1 ;
        }
        else
        {
            if(money>=notes[i])
            {
                int calNotes =money/notes[i];
                rem = money%notes[i];
                money =rem;
                total += calNotes;
                System.out.println(notes[i]+  "rs Notes are  " +calNotes );
            }
            i++;
            return calculate(money, notes);//method recursion
        }
    }


	
	//Swap Nibbles
	/**
	 * @purpose: read an integer as an Input, convert to Binary,Swap nibbles.the resultant number is the number is a power of 2
	 * @param x input integer
	 **/
	
	public static int swapNibbles(int x)
    {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);     

    }

//Find a number
	/**
	 * @purpose: guess a number using binary search
	 * @param x input integer
	 **/
	
	public  static void binarySearch(int lower,int upper,int middle,int count,String input,int n)
    {
        
        System.out.println("Is your number:"+middle);
        System.out.println();
        System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
        input=AlgorithmUtility.StringValue();
        
        do
        {
            if (input.equals("high"))
            {
                lower= middle;
                count++;
            }
            else if (input.equals("yes"))
            {
                System.out.println("The number you thought was: "+middle);
                int no=count+1;
                System.out.println("It takes "+no+" times to find your exact number" );
                break;
            }
            else if(input.equals("low"))
            {
                upper=middle;
                count++;
            }
            if(count<n)
            {
                middle=(lower+ upper+1)/2;
                System.out.println("Is your number "+middle+":");
                input=AlgorithmUtility.StringValue();
            }
        }
        while(lower<=upper);
        if (count>n)
        {
            System.out.println("Number not found");
        }
        else
        {
            System.exit(0);
        }

}

	public static int dayofweek(int m, int d, int y) {

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		return d0;
	}


	///**
	// * Function helping prime() to check if prime is pallindrome and print it
	// */
	
	 public static boolean Pallindrome(int n) {
	        int temp = n;
	        int sum = 0;
	        while (temp != 0) {
	            int r = temp % 10;
	            sum = sum * 10 + r;
	            temp = temp / 10;
	        }
	        if (sum == n) {
	            return true;
	        }
	        return false;
	    }
	    /**
	     * to check the values are anagrams or not
	     *
	     * @param n1 input number1
	     * @param n2 input number2
	     * @return
	     */
	    public static boolean anagram(int n1, int n2) {
	        int[] n1count = count(n1);
	        int[] n2count = count(n2);
	        for (int i = 0; i < n2count.length; i++) {
	            if (n1count[i] != n2count[i]) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void primePallindrome() {
	        System.out.println();
	        boolean b;
	        for (int j = 2; j <= 1000; j++) {
	            b = true;
	            for (int i = 2; i < j / 2; i++) {
	                if (j % i == 0) {
	                    b = false;
	                    break;
	                }
	            }
	            if (b && Pallindrome(j))
	                System.out.print(j + " ");
	        }
	    }

	    /**
	     * Function to check if no is anagram or not
	     */
	    public static void primeAnagrams() {
	        ArrayList<Integer> ar = new ArrayList<Integer>();
	        System.out.println();
	        boolean b;
	        for (int i = 2; i <= 1000; i++) {
	            b = true;
	            for (int j = 2; j < i / 2; j++) {
	                if (i % j == 0) {
	                    b = false;
	                    break;
	                }
	            }
	            if (b)
	                ar.add(i);
	        }
	        for (int i = 0; i < ar.size(); i++) {
	            for (int j = i + 1; j < ar.size(); j++) {
	                if (anagram(ar.get(i), ar.get(j))) {
	                    System.out.println(ar.get(i)+" "+ar.get(j));

	                }
	            }
	        }
	    }



	    /**
	     * Function to count the value in given integer be place
	     *
	     * @param n the integer value to count
	     * @return the integer array for the count value
	     */
	    public static int[] count(int n) {
	        int[] count = new int[10];
	        int temp = n;
	        while (temp != 0) {
	            int r = temp % 10;
	            count[r]++;
	            temp = temp / 10;
	        }
	        return count;
	    }







public static int binSearch(String [] str,String key)
{
    //int n=str.length;
    int first  = 0;
    int last   = str.length - 1;
    int middle = (first + last)/2;

    while( first <= last )
    {
      if ( str[middle].compareTo(key)<0 )
        first = middle + 1;    
      else if ( str[middle].equalsIgnoreCase(key) )
      {
       return middle;
      }
      else
         last = middle - 1;

      middle = (first + last)/2;
   }
 return -1;
}


public static String []  sort(String [] str)
{
    int len=str.length;
    for (int i = 0; i < len; i++){
        for (int j = i+1; j < len; j++) {
            if (str[i].compareTo(str[j])>0) {
                String temp;
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
    }
    return str;

}



public static List<Integer> primeNumbers(int m,int n) {
    List<Integer> lst=new ArrayList<Integer>();
    int temp;

    //swapping of bounds if the given lower bound is greater than upper bound
    if(m>n) {
        temp=m;
        m=n;
        n=temp;}
    int flag=1;
    //try all the possible values from lower bound to upper bound
    //if the number has the factor then it must be checked within lower bound
    for(int i=m;i<=n;i++){
        for(int j=2;j<i;j++){
            //If the number is divisible by any of the number then
            //initializing flag to zero and break
            //else flag is initialized to one
            if(i%j==0){
                flag=0;
                break;}
            else
                flag=1;}
        //If the number is prime which is indicated by the flag,
        //then adds the number into an ArrayList.
        if(flag==1)
            lst.add(i);}
    return lst;
}
}


