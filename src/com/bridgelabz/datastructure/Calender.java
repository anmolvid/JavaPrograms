//******************************************************************************
// *  Compilation:  javac -d bin WeekOnStack.java
// *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.WeekOnStack n
// *  
// *  Purpose: ­> to takes the month and year as command­line
// * arguments and prints the Calendar of the month.
// *
// *  @author  anmol vidyarthi
// *  @version 1.0
// *  @since   05-01-2019
// *
// ******************************************************************************/


package com.bridgelabz.datastructure;
import com.bridgelabz.util.DataStructureUtility;
public class Calender {
	 public static void main(String[] args) {
         //

         //Prompt the user to enter year
         System.out.print("Enter year: ");
         int year = DataStructureUtility.intValue();

         // Prompt the user to enter month
         System.out.print("Enter month  ");
         int month = DataStructureUtility.intValue();

         // Print calendar for the month of the year
          if (month < 1 || month > 12 || year < 1700)
           System.out.println("Wrong input!");
           else
              DataStructureUtility.printMonth(year, month);

       }

}
