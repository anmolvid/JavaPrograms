package com.bridgelabz.util;


import java.io.BufferedReader;
import java.util.Set;



import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

public class DataStructureUtility {
	static Scanner sc = new Scanner(System.in);

	public static int intValue()
	{


		return sc.nextInt();
	}


	public static double doubleValue()
	{
		return sc.nextDouble();
	}


	public static String StringValue()
	{

		return sc.next();
	}
	public static boolean booleanvalue()
	{
		return sc.hasNextBoolean();
	}


	//public class BalancedParan  
	//{ { 
		//        int top=-1; 
	//        char items[] = new char[100]; 
	//  
	//        void push(char x)  
	//        { 
	//            if (top == 99)  
	//            { 
	//                System.out.println("Stack full"); 
	//            }  
	//            else 
	//            { 
	//                items[++top] = x; 
	//            } 
	//        } 
	//  
	//        char pop()  
	//        { 
	//            if (top == -1)  
	//            { 
	//                System.out.println("Underflow error"); 
	//                return '\0'; 
	//            }  
	//            else 
	//            { 
	//                char element = items[top]; 
	//                top--; 
	//                return element; 
	//            } 
	//        } 
	//  
	//        boolean isEmpty()  
	//        { 
	//            return (top == -1) ? true : false; 
	//        } 
	//    } 
	//      
	//    /* Returns true if character1 and character2 
	//       are matching left and right Parenthesis */
	//    static boolean isMatchingPair(char character1, char character2) 
	//    { 
	//       if (character1 == '(' && character2 == ')') 
	//         return true; 
	//       else if (character1 == '{' && character2 == '}') 
	//         return true; 
	//       else if (character1 == '[' && character2 == ']') 
	//         return true; 
	//       else
	//         return false; 
	//    } 
	//
	//
	//
	//
	//static boolean areParenthesisBalanced(char exp[]) 
	//{ 
	//   
	//   stack st=new stack(); 
	//   
	//   
	//   for(int i=0;i<exp.length;i++) 
	//   { 
	//        
	//     
	//      if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
	//        st.push(exp[i]); 
	//   
	//     
	//      if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
	//      { 
	//               
	//          
	//         if (st.isEmpty()) 
	//           { 
	//               return false; 
	//           }  
	//   
	//         
	//         else if ( !isMatchingPair(st.pop(), exp[i]) ) 
	//           { 
	//               return false; 
	//           } 
	//      } 
	//        
	//   } 
	//      
	//  
	//   if (st.isEmpty()) 
	//     return true; /*balanced*/
	//   else
	//     {   /*not balanced*/
	//         return false; 
	//     }  
	//}  
	//}
	//
	//    static class stack  
	//    

	public static double binomialCoeff(double n, double k) {
		double res = 1.0;
		for (int i = 0; i < k; ++i) {
			res =res * (n - i);
			res =res /(i + 1);
		}
		return res;
	}

	public static double countBinary(double n) {
		double c = binomialCoeff(2 * n, n);
		double count = c / (n + 1);
		return count;
	}
	////////////////

	public static List<String> rangePrime1(int start,int end)
	{
		int flag=1;
		List<String> primeList=new ArrayList<>();//list declaration
		for(int i=start;i<=end;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				primeList.add(Integer.toString(i));//integer to String conversion


			}
		}
		//System.out.println(primeList);
		return primeList;
	}



	public static Set<String> primeAnagram(List<String> primeList)
	{   
		Set<String> primeAnagramSet=new HashSet<String>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(AlgorithmUtility.isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j))))
				{

					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					
				}
			}
		}

		return primeAnagramSet;
	}



	public static void printPrimeAndAnagram(List<List<String>> list1)
	{
		List<String> demo = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i++) {
			demo = list1.get(i);
			if (i == 0) {
				System.out.println("Numbers which are prime and anagram are:"+demo.size());
				System.out.println();
				for (int j = 0; j < demo.size(); j++) {
					System.out.print(demo.get(j) + " ");
				}
			} else {
				System.out.println();
				System.out.println("Numbers which are prime but not anagram are:"+demo.size());
				System.out.println();
				for (int j = 0; j < demo.size(); j++) {
					System.out.print(demo.get(j) + " ");
				}
			}
			System.out.println();
		}
	}






	public static void printMonth(int year, int month) {

		//Print the headings of the calendar
		printMonthTitle(year, month);

		//Print the body of the calendar
		printMonthBody(year, month);
	}

	/** Print the month title, e.g., May, 1999 */

	static void printMonthTitle(int year, int month) {

		System.out.println("         " + getMonthName(month) + " " + year);
		System.out.println("–––––––––––––––––––––––––––––");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

	}

	/** Get the English name for the month */
	static String getMonthName(int month) {
		String monthName = null;
		String[] m = {"","January","Feb","March","April","May","June","July","August","September","October","November","December"};
		System.out.println(m[month]);

		return m[month];
	}

	/** Print month body */
	static void printMonthBody(int year, int month) {

		// Get start day of the week for the first date in the month
		int startDay = getStartDay(year, month);

		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			if (i < 10)
				System.out.print("   " + i);
			else
				System.out.print("  " + i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}

	/** Get the start day of the first day in a month */

	static int getStartDay(int year, int month) {

		//Get total number of days since 1/1/1800
		int startDay1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		//Return the start day
		return (totalNumberOfDays + startDay1800) % 7;
	}

	static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		//Get the total days from 1800 to year - 1
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		//Add days from January to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	/** Get the number of days in a month */

	static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2) return isLeapYear(year) ? 29 : 28;

		return 0; // If month is incorrect
	}

	/** Determine if it is a leap year */
	static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	public static String[] intTostring(int[] abc) {
        String strarray[]=new String[abc.length];
        int l=0;
        for(int i=0;i<abc.length;i++) {
            if(abc[i]!=0) {
            String str=String.valueOf(abc[i]);
            strarray[l]=str;
            l++;
        }}
        return strarray;
    }
}






