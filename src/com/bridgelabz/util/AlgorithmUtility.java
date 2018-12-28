package com.bridgelabz.util;
import java.util.ArrayList;
import java.util.Arrays;
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
			return sc.nextInt();
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
	public static boolean anagram(String str1, String str2) {
		char[] char1 = str1.toLowerCase().toCharArray();// method converts this string into character array.
		char[] char2 = str2.toLowerCase().toCharArray();// method converts this string into character array.

		int n1 = char1.length;
		int n2 = char2.length;

		if (n1 != n2) {

			return false;

		} else {

			Arrays.sort(char1);// method sorts the specified array of int into ascending numerical order
			Arrays.sort(char2);

			for (int i = 0; i < n1; i++)

				if (char1[i] != char2[2])

					return false;
		}

		return true;

	}

	public void Prime() {

		for (int i = 1; i < 1000; i++) {

			int flag = 1;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					flag = 0;
					break;

				}
			}
			if (flag == 1) {
				System.out.println(i);
			}

		}
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
		double r = R / (12 * 100);
		double n = 12 * Y;

		double k = Math.pow((1 + r), -n);// function returns a number representing the given base raised to the power of
											// the given exponent.
		double payment = P * R / 1 + k;
		System.out.println("Monthly payment is " + payment);
	}

////TEMPERATURE Conversion

	/**
	 * @purpose: To convert temparature from Celsius to Fahrenheit
	 * @param C given temparature as an input
	 */
	public void Temparature(double C) {
		double F = ((C * 9 / 5) + 32);
		System.out.println(F);

	}

///Square root
	
	/**
	 * @purpose: to compute the square root of a nonnegative number c
	 * @param n nonnegative number
	 */

	public void squareRoot(double n) {
		double t = n;
		double epsilon = 1e-15;
		if (n > 0) {
			while (Math.abs(t - n / t) > (epsilon * t)) {
				t = ((n / t) + t) / 2;

			}

		}
		System.out.println("the square root of " + n + "is" + t);
//	else
//	System.out.println("its a negative number");
	}

///to binary
	/**
	 * @purpose: to compute the square root of a nonnegative number c
	 * @param n nonnegative number
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

	public static void bubbleSort(String array[], int f) {

		for (int i = 0; i < f; i++) {
			for (int j = 1; j < f; j++) {
				if (array[j - 1].compareToIgnoreCase(array[j]) > 0) {
					String temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

//bubble sort for integer

	public static void bubbleSortInt(int[] a, int n) {
		int i, j, temp = 0;

		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					// Swapping
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("The sorted order is:");

		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

//insertion sort for  string 

	public static void insertionSort(String arr[], int n) {
		String temp = "";
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0)
					temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

	}

//insertion for integer

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
	
 //binary search
	
	public static void binarySearch(int n, int key, int [] arr) {
	int c, first, last, middle;
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

	public static int vendingMachine(int money, int[] notes) {
		int rem;
		int i = 0;
		int total = 0;

		if (money == 0) {
			System.out.println("no output");
		} else {
			for (i = 0; i < notes.length; i++) {
				if (money >= notes[i]) {
					int calculateNotes = money / notes[i];
					rem = money % notes[i];
					money = rem;
					total = total + calculateNotes;
					return calculateNotes;
					// System.out.println(notes[i]+ "Notes: " +calculateNotes);
				}
			}
			// return total;
			// System.out.println("total number of notes "+total);
		}
		return total;
	}

	public static int swapNibbles(int x) {
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}

//Find a number

	public static int findNumber(int lower, int upper, int middle, int count, String input1, int n) {
		Scanner rc = new Scanner(System.in);
		System.out.println("Is your number:" + middle);
		System.out.println();
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input1 = rc.nextLine();
		do {
			if (input1.equals("high")) {
				lower = middle;
				count++;
			} else if (input1.equals("yes")) {
				System.out.println("The number you thought was: " + middle);
				int no = count + 1;
				System.out.println("It takes " + no + " times to find your exact number");
				break;
			}

			else if (input1.equals("low")) {
				upper = middle;
				count++;
			}
			if (count < n) {
				middle = (lower + upper + 1) / 2;
				System.out.println("Is your number " + middle + ":");
				input1 = rc.nextLine();
			}
		} while (lower <= upper);
		if (count > n) {
			System.out.println("Number not found");
		} else {
			System.exit(0);
		}
		return middle;
	}

	public static int dayofweek(int m, int d, int y) {

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		return d0;
	}



/**
 * Function helping prime() to check if prime is pallindrome and print it
 */
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
        if (b && isPallindrome(j))
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
    for (int j = 2; j <= 1000; j++) {
        b = true;
        for (int i = 2; i < j / 2; i++) {
            if (j % i == 0) {
                b = false;
                break;
            }
        }
        if (b)
            ar.add(j);
    }
    for (int i = 0; i < ar.size(); i++) {
        for (int j = i + 1; j < ar.size(); j++) {
//            if (anagram(ar.get(i), ar.get(j))) {
                System.out.println(ar.get(i) + "  " + ar.get(j));
            }
        }
    }
//}
/**
 * Function to find the is pallindrome or not
 *
 * @param n the integer which to check for pallindrome
 * @return true if its pallindrome or false if its not
 */
public static boolean isPallindrome(int n) {
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
 * @param n1
 * @param n2
 * @return
 */
//public static boolean anagram(int n1, int n2) {
	
//    int[] n1count = count(n1);
//    int[] n2count = count(n2);
//    for (int i = 0; i < n2count.length; i++) {
//        if (n1count[i] != n2count[i]) {
//            return false;
//        }
//    }
//    return true;
//}










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
}
