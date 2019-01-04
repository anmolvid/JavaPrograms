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
public static Set<Integer> primeAnagram(List<Integer> primeList) {
    Set<Integer> primeAnagram = new HashSet<>();
    for (int i = 0; i < primeList.size(); i++) {
        for (int j = i+1; j < primeList.size(); j++) {
            if (AlgorithmUtility.anagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
                primeAnagram.add(primeList.get(i));
                primeAnagram.add(primeList.get(j));
            }
        }
    }
    return primeAnagram;
}
//////////////////////////

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
///////////////////

public static void printPrimeAndAnagram(List<List<Integer>> list1)
{
    List<Integer> demo = new ArrayList<Integer>();
    for (int i = 0; i < list1.size(); i++) {
        demo = list1.get(i);
        if (i == 0) {
            System.out.println("Numbers which are prime and anagram are:"+demo.size());
            System.out.println();
            for (int j = 0; j < demo.size(); j++) {
                System.out.print(demo.get(j) + " ");
            }
        } else {
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
	 switch (month) {
	   case 1: monthName = "January"; break;
	   case 2: monthName = "February"; break;
	   case 3: monthName = "March"; break;
	   case 4: monthName = "April"; break;
	   case 5: monthName = "May"; break;
	   case 6: monthName = "June"; break;
	   case 7: monthName = "July"; break;
	   case 8: monthName = "August"; break;
	   case 9: monthName = "September"; break;
	   case 10: monthName = "October"; break;
	   case 11: monthName = "November"; break;
	   case 12: monthName = "December";
	 }
	 return monthName;
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
		}







