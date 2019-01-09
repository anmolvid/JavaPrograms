package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FunctionalUtility<E> {

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
	 * @purpose:Replace <<UserName>> with the proper name
	 * @param str
	 *
	 * 
	 */

	public static void replaceString(String str) {

		String uname = FunctionalUtility.StringValue();
		if (str.length() >= 3) {
			str = str.replaceFirst("<<username>>", uname);
			System.out.println(str);
		} else
			System.out.println("cannot be replaced");
	}
	/// Flip coin

	/**
	 * @purpose:to print the percentage of heads and tails
	 * @param number of flips
	 *
	 * 
	 */

	public void flipCoin(int count) {
		int head = 0;
		int tail = 0;
		int h_per = 0;
		int t_per = 0;

		int i = count;

		Random result = new Random();
		while (count > 0) {
			double r = result.nextDouble();

			if (r < 0.5) {
				tail++;
			} else {
				head++;
			}
			count--;

		}
		h_per = head * 100 / i;
		t_per = tail * 100 / i;
		System.out.println(h_per);
		System.out.println(t_per);
	}

///Power of 2		

	public void power() {
		int count = 0;

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n >= 0 && n < 31) {
			for (int i = 0; i < n; i++) {
				System.out.println(Math.pow(2, count));
				count++;
			}
		} else {
			System.out.println("out of range");
		}
	}

////Leap year

	public static int leapYear(int year) {
		
		{

			if (String.valueOf(year).length() == 4) {

				if ((year % 400 == 0) && (year % 4 == 0)) {
					System.out.println("year is leap year");
				}

				else if (year % 100 == 0) {
					System.out.println("year is not leap year");

				} else {
					System.out.println("year is not leap year");

				}
			} else {
				System.out.println("yesr is not of four digits");
			}
		}
		return 0;
	}

	
	
	
	public static boolean isLeapYear(int year)
    {
        if  (((year % 4 == 0) && (year % 100 != 0))||year % 400 == 0) return true;
        else return false;
    }
////Harmonic series

	public void harmonicN() {
		{
			double sum = 0;
			Scanner S = new Scanner(System.in);
			System.out.println("Enter the value");
			int num = S.nextInt();

			for (int i = 1; i <= num; i++) {
				sum = sum + (float) 1 / i;

			}
			System.out.println("result:" + sum);

		}
	}

///Prime factor
	public void primeNo() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i + " ");
				n = n / i;
			}
		}

	}

////Gambler

	public void gambler() {
		int win = 0;
		int loose = 0;

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the goal");
		int goal = S.nextInt();
		System.out.println("Enter the stake");
		int stake = S.nextInt();
		System.out.println("Enter the number of times");
		int n = S.nextInt();

		for (int i = 1; i <= n; i++) {

			int cash = stake;
			while (cash > 0 && cash < goal) {
				if (Math.random() < 0.5) {
					cash++;

				} else {
					cash--;
				}
			}
			if (cash == goal) {
				win++;
			} else
				loose++;
		}
		System.out.println(100 / n * win);
		System.out.println(100 / n * loose);
	}

///Coupon Number

	public void couponNumber(int n) {
		boolean[] a = new boolean[n];
		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			Random rand = new Random();
			int content = rand.nextInt(n);
			count++;
			if (!a[content]) {
				distinct++;
				System.out.println(distinct);
				a[content] = true;
			}
		}

		System.out.println("assigning is done for" + count);

	}

///Sum of three integer is zero
	public void triplets(int[] arr, int n) {
int flag=1;
int count=0;
System.out.println("possibilities are:");
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0)

					{

						System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k]+" = 0");
						flag=0;
						count++;
					}

				}
			}
		}
if (flag ==1)
		{
			System.out.println("there are no possibilities");
		}
System.out.println("no of posibilities are :"+count);
	}

	public void distance(int x, int y) {
		double result = Math.sqrt(x * x + y * y);
		System.out.println("result is" + result);

	}

	public void displayArray(E[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void quadratic() {
		Scanner s = new Scanner(System.in);

		System.out.println("enter value of a");

		double a = s.nextDouble();
		System.out.println("enter the value of b");
		double b = s.nextDouble();
		System.out.println("enter the value of c");
		double c = s.nextDouble();
		double res = b * b - 4 * a * c;
		double root1 = (-b + Math.sqrt(res) / (2 * a * b));
		double root2 = (-b - Math.sqrt(res) / (2 * a * b));
		System.out.println("first root is" + root1);
		System.out.println("second root is" + root2);
	}

	public void stopwatch() {
		Scanner S = new Scanner(System.in);

		System.out.println("enter any key value to start");
		long strt = System.currentTimeMillis();
		long start = S.nextLong();

		System.out.println("enter any key value to stop");
		long stp = System.currentTimeMillis();
		long stop = S.nextLong();

		long elapse = (strt - stp);
		System.out.println("Elapse time is" + elapse);

	}

///Windchill

	public void windchill(double t, double v) {
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("The value of windchill " + w);
	}

///Tic-tak toe

	static int player = 0;
	static int[][] BOARD = new int[3][3];
	static boolean isEmpty = true;

	public static void initBoard() {
		System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
		for (int i = 0; i < BOARD.length; i++) {
			for (int j = 0; j < BOARD[i].length; j++) {
				BOARD[i][j] = -10;
			}
		}
		System.out.println("Board is this :");
		dispBoard();
	}

	public static void dispBoard() {
		int count = 0;
		for (int i = 0; i < BOARD.length; i++) {
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < BOARD[i].length; j++) {
				if (BOARD[i][j] == 0) {
					count++;
					System.out.print(" o |");
				} else if (BOARD[i][j] == 1) {
					count++;
					System.out.print(" x |");
				} else
					System.out.print("   |");
			}
			System.out.println("|");
		}
		if (count == 9) {
			isEmpty = false;
		}
		System.out.println("---------------");
	}
	/*
	 * static void putVal(int i, int j, int player) { if if (player % 2 == 0) {
	 * BOARD[i][j] = 0; } else BOARD[i][j] = 1; }
	 */

	public static void putVal() {
		int i;
		int j;
		if (player % 2 == 1) {
			i = (int) (Math.random() * 10) % 3;
			j = (int) (Math.random() * 10) % 3;
		} else {
			Scanner s = new Scanner(System.in);
			System.out.println("enter value of x and y by space");
			i = s.nextInt();
			j = s.nextInt();
		}
		if (BOARD[i][j] == -10) {
			if (player % 2 == 0) {
				BOARD[i][j] = 0;
			} else {
				BOARD[i][j] = 1;
				System.out.println("Coumputer Choosing " + i + " " + j);
			}
		} else
			putVal();

	}

	public static boolean win() {
		return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
				|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
				|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
				|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
				|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
				|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
	}

	public static void play() {
		initBoard();
		while (isEmpty) {
			System.out.println("Players turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Player won");
				return;
			}
			player = 1;
			System.out.println("Computers turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Computer won");
				return;
			}
			player = 0;
		}
	}



/////
//**
//* static method is used to possible recursion we can do it for a string
//* @param str string value
//* @param initial first element
//* @param last element
//* @param array list
//* @return array list
//*/
public static List<String> recursion(String str, int initial, int last,List<String> arr) {

if (initial == last) {
   arr.add(str);
} else {
   for (int i = initial; i < last; i++) {
       str = swap(str, initial, i);
       recursion(str, (initial + 1), last,arr);
//       str = swap(str, initial, i);
   }
}
return arr;
}

/**
* static method is used to swap the string alphabets
* @param str string value
* @param i index of string
* @param j index of string
* @return String
*/
public static String swap(String str, int i, int j) {
char temp;
char[] ch = str.toCharArray();
temp = ch[i];
ch[i] = ch[j];
ch[j] = temp;
return String.valueOf(ch);

}

/**
* static method is used to possible iterations we can do it for a string
* @param s is the string value
* @return arr array of string
*/
public static List<String> iteration(String str) {
List<String> arr = new ArrayList<>();
arr.add(String.valueOf(str.charAt(0)));
for (int i = 1; i < str.length(); i++) {
   for (int j = arr.size() - 1; j >= 0; j--) {
       String s = arr.remove(j);
       for (int k = 0; k <= s.length(); k++) {
           arr.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
       }
   }
}
return arr;
}

/**
* static method is used to sort the array list
* @param arr is arraylist
* @return arraylist
*/
public static List<String> listSort(List<String> arr)
{
Collections.sort(arr);
return arr;
}

/**
* static method is used to compare 2 array list
* @param arr1 array list1
* @param arr2 array list2
* @return integer value
*/
@SuppressWarnings("unused")
public static int comparision(List<String> arr1,List<String> arr2)
{
for(int i=0;i<arr1.size();i++)
{
   if(arr1.get(i).compareTo(arr2.get(i))==0)
   {
       return 1;
   }
   else
       return 0;
}
return 0;
}
}

