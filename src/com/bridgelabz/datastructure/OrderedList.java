//******************************************************************************
// *  Compilation:  javac -d bin WeekOnStack.java
// *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.WeekOnStack n
// *  
// *  Purpose: ­> Read .a List of Numbers from a file and arrange it ascending Order in a
// *Linked List. Take user input for a number, if found then pop the number out of the
// *list else insert the number in appropriate position
// *
// *  @author  anmol vidyarthi
// *  @version 1.0
// *  @since   05-01-2019
// *
// ******************************************************************************/




package com.bridgelabz.datastructure;

import java.io.IOException;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.*;

public class OrderedList {
	static String sortFile="/home/admin1/Documents/sorted.txt";
    static String fName="/home/admin1/Documents/num.txt";
    public static void main(String[] args) throws IOException
    {
       LinkedList Lists=new LinkedList();
       Lists=LinkedList.readFile(Lists);
       LinkedList.printList(Lists);      
        while(true)
        {
            System.out.println("please select one option");
            System.out.println("1.Display list 2.to search element 3.Display Sorted File  ");
            int option=DataStructureUtility.intValue();
            switch(option) {
            case 1:LinkedList.printList(Lists);
            break;
            case 2:{System.out.println("Enter the key element to be searched");
            int key=DataStructureUtility.intValue();
            String key1=String.valueOf(key);
            int k=LinkedList.delete(Lists, key1);
            System.out.println(k);
            if(k==0) {
                LinkedList.insert(Lists, key1);
            }
            int[] fileContent = LinkedList.toIntConv(Lists);    
           
            int[] arr=LinkedList.stringSort(fileContent);
           String sortedstring[]= LinkedList.intTostring(arr);
          LinkedList.usingFileWriter(Lists,sortedstring,sortFile);
          
            break;}
            case 3:   LinkedList .dispFile(sortFile);
            break;
            default:System.out.println("Please enter an valid option");
            break;
            }
        }
    }

}


